import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order
        int nu;
        NumberStatistics ist = new NumberStatistics ();
        NumberStatistics cift = new NumberStatistics ();
        NumberStatistics tek = new NumberStatistics ();
        System.out.println ("Type numbers:" );
        while ( true ) {
            nu = reader.nextInt ( );
            if ( nu == -1 )
                break;
            ist.addNumber (nu);
            if ( nu % 2 == 0 )
                cift.addNumber (nu);
            else
                tek.addNumber (nu);
        }
        System.out.println ("sum: "+ist.sum() );
        System.out.println ("sum of even: "+cift.sum () );
        System.out.println ("sum of odd: "+tek.sum() );
    }
}
