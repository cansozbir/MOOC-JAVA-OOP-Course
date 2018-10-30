
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int until = reader.nextInt();
        int sum=0;
        for (int i = 1; i <=until ; i++) {
            sum += i;
        }
        System.out.println("Sum is "+sum);

    }
}
