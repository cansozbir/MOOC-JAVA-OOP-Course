import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    private ArrayList<Bird> birds = new ArrayList<Bird> ();
    private Scanner s;
    public Database (Scanner s ){
        this.s = s;
    }

    public void add () {
        System.out.println ("Name: " );
        String n =s.nextLine ();
        System.out.println ("Latin name: " );
        String ln = s.nextLine ();
        Bird newbird = new Bird (n,ln);
        birds.add (newbird);
    }

    public void observation () {
        System.out.println ("What was observed:? " );
        String name = s.nextLine ();
        boolean flag = false;
        for (Bird each : birds) {
            if (each.getName ().equals (name)) {
                flag = true;
                each.gozlendi ();
            }
        }
        if (!flag) {
            System.out.println ("Is not a bird!" );
            return;
        }
    }

    public void statistics () {

        for (Bird each : birds) {
                System.out.println (each);
        }
    }


    public void show () {
        System.out.println ("What? " );
        String searched = s.nextLine ();
        for (Bird each : birds) {
            if (each.getName ().equals (searched)) {
                System.out.println (each);
            }
        }

    }

}
