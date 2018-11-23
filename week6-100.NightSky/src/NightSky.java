import java.util.Random;

public class NightSky {
    private double density ;
    private int width ;
    private int height ;
    private int starsInLastPrint=0;
    public NightSky (double density , int width, int height ) {
        this.density=density;
        this.height=height;
        this.width=width;
    }
    public NightSky (int width , int height) {
        this.width=width;
        this.height = height;
        this.density = 0.1;

    }
    public NightSky (double density) {
        this.density = density;
        this.width=20;
        this.height=10;
    }

    public void printLine () {

        int prob;
        Random r = new Random ();
        for (int i=0 ; i<this.width ; i++) {
            prob = r.nextInt (100) + 1;
            if (prob <= this.density*100) {
                System.out.printf ("*");
                this.starsInLastPrint++;
            }
            else
                System.out.printf (" ");
        }
        System.out.println ("");
    }

    public void print ( ) {
        this.starsInLastPrint = 0;
        for (int i = 0; i < this.height; i++) {
            printLine ();
        }
    }

    public int starsInLastPrint () {
        return starsInLastPrint;
    }
}
