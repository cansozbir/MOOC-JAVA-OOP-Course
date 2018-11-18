
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList <String> liste = new ArrayList<String> ();
        String inp;
        while ( true ) {
            System.out.println ("Type a word: " );
            inp = reader.nextLine ();
            if (inp.equals ("")) {
                break;
            }
            liste.add (inp);
        }
        System.out.println ("You typed the following words: " );
        Collections.sort(liste);
        for (String each : liste) {
            System.out.println (each);
        }
    }
}
