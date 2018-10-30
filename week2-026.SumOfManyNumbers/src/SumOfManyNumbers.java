
import java.util.Scanner;


public class SumOfManyNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;
        while (true) {
            read= Integer.parseInt(reader.nextLine());
            if (read == 0) {
                System.out.println("Sum in the end: "+sum);
                break;
            }
            sum += read;
            System.out.println("Sum now: " + sum);
            }

        }
    }
