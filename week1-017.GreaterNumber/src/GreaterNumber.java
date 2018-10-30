import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first number: ");
        int num1 = reader.nextInt();
        System.out.println("Type the second number: ");
        int num2 = reader.nextInt();

        if (num1==num2) {
            System.out.println("The numbers are equal!");
        }
        else {
            System.out.println("Greater number: "+Math.max(num1,num2));
        }

    }
}
