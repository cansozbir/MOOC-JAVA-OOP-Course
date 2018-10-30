
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int first = reader.nextInt();
        System.out.println("Last: ");
        int last = reader.nextInt();

        for(int i=first ; i<=last ; i++){
            System.out.println(i);
        }
    }
}
