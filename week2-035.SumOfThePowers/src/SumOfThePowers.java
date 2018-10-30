
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum=1;
        int j=1;
        System.out.println("Type a number: ");
        int num= reader.nextInt();
        for (int i = 1; i <=num ; i++) {
            j *= 2;
            sum += j;
        }
        System.out.println("The result is "+sum);
    }
}
