import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        montella (lukija);
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

    }
    public static void montella (Scanner s) {
        int num ;
        ArrayList<Integer> list = new ArrayList<Integer> ();
        System.out.printf ("Type exam scores, -1 completes:" );
        while ( true ) {
            num = s.nextInt ();
            if (num == -1)
                break;
            list.add (num);
        }

        System.out.println ("Grade distribution:") ;
        int accapted=0 ;
        int allScores=0;
        int [] transkript = {0,0,0,0,0,0};
        for (int each : list) {
            allScores++;
            if (each>=30)
                accapted++;

            if (each >= 0  &&  each < 30)
                transkript[0]++;

            else if (each >=30 && each <35)
                transkript[1]++;
            else if (each >=35 && each <40)
                transkript[2]++;
            else if (each >=40 && each <45)
                transkript[3]++;
            else if (each >=45 && each <50)
                transkript[4]++;
            else if (each >=50 && each <=60)
                transkript[5]++;
        }
        for (int i = transkript.length-1 ; i>=0 ; i-- ){
            System.out.printf ("%d:",i);

            for (int j= 0 ; j<transkript[i]; j++) {
                System.out.print ("*");
            }
            System.out.printf ("\n");
        }

        System.out.println ("Acceptance percentage: "+ ((double)accapted/allScores)*100);

    }

}
