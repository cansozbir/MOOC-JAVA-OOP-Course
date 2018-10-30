import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int num ;
        int sum=0;
        int howManyNumbers=0;
        int even = 0;
        int odd = 0;
        System.out.println("Type numbers: ");
        while (true) {
            num=reader.nextInt( );
            if (num == -1) {
                System.out.println("Thank you and see you later!");
                break;
            }
            sum += num;
            howManyNumbers++;
            if (num % 2 == 0){
                even++;
            }
            else {
                odd++;
            }
        }

        System.out.println("The sum is "+sum);
        System.out.println("How many numbers: "+howManyNumbers);
        System.out.println("Average: "+ ((double)sum/howManyNumbers));
        System.out.println("Even numbers:"+even);
        System.out.println("Odd numbers:"+odd);
    }
}
