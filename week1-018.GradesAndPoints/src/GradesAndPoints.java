
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int point = reader.nextInt();
        String Grade = "";

        if (point<=29) {
            Grade="failed";
        }
        else if (point <= 34) {
            Grade="1";
        }
        else if (point <= 39) {
            Grade="2";
        }
        else if (point <= 44) {
            Grade="3";
        }
        else if (point <= 49) {
            Grade="4";
        }
        else{
            Grade="5";
        }


        System.out.println("Grade: "+Grade);
    }
}
