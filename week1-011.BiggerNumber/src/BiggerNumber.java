
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int no1 = reader.nextInt();
        System.out.print("\n");
        System.out.print("Type another number: ");
        int no2 = reader.nextInt();

        System.out.println("The bigger number of the two numbers given was: "+Math.max(no1,no2));
        // Implement your program here. Remember to ask the input from user
    }
}
