
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        String name ;
        String no ;
        ArrayList<Student> list = new ArrayList<Student> ();
        while ( true ) {
            System.out.println ("name: " );
            name = inp.nextLine ();
            if(name.equals ("")) break;
            System.out.println ("studentnumber: " );
            no = inp.nextLine ();
            Student s = new Student (name , no);
            list.add(s);
        }

        for (Student current:list) {
            System.out.println (current.getName () + " (" + current.getStudentNumber () +")" );
        }
        System.out.print ("Give search term: " );
        String search = inp.nextLine ();
        System.out.println ("\nResult:" );

        for (Student current:list) {
            if (current.getName ().contains (search))
                System.out.println (current );
        }
    }
}
