
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your username: ");
        String id = reader.nextLine();

        System.out.println("Type your password: ");
        String pw = reader.nextLine();

        if ((id.equals("alex") && pw.equals("mightyducks")) ||
                (id.equals("emily") && pw.equals("cat"))){
            System.out.println("You are now logged into the system!");
        }
        else {
        System.out.println("Your username or password was invalid!");

        }
    }
}