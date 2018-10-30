
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        String pw;

        while (true) {
            System.out.println("Type the password: ");
            pw= reader.nextLine();
            if(pw.equals(password)) {
                System.out.println("Right");
                System.out.println("The secret is: jryy qbar!");
                break;
            }
            System.out.println("Wrong!");
        }

        // Write your code here
    }
}
