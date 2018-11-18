
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList
        ArrayList<String> liste = new ArrayList<String> ();
        String inp;
        while (true) {
            System.out.println ("Type a word:" );
            inp = reader.nextLine ();
            if (liste.contains(inp)) {
                System.out.println ("You gave the word "+inp + " twice" );
                break;
            }
            liste.add (inp);

        }
        
    }
}
