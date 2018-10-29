
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here
        System.out.print("Type the radius: ");

        int r = reader.nextInt();
        double cevre = 2.0 * Math.PI * r ;
        System.out.println("Circumference of the circle: "+cevre);




    }
}
