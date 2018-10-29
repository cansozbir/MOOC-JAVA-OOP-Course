
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.

        System.out.print("Type a number: ");
        double no1 = reader.nextInt();
        System.out.print("\n");
        System.out.print("Type another number: ");
        double no2 = reader.nextInt();
        System.out.print("\n");
        System.out.println("Division: "+no1+" / "+no2+" = "+((double)(no1)/no2));


    }
}
