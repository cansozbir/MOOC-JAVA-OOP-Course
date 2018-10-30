import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = reader.nextInt();
        int fakt =1;
        for (int i = num; i >= 2; i--)
            fakt *= i;
        System.out.println("Factorial is "+fakt);

    }
}
