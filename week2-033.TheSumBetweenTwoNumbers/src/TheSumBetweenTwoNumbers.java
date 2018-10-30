
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int first = reader.nextInt();
        System.out.println("Last: ");
        int last = reader.nextInt();

        int sum=0;
        for (int i = Math.min(first,last); i <= Math.max(first,last); i++) {
            sum += i;
        }
        System.out.println("The sum is "+sum);
    }
}
