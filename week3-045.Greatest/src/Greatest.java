
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int great = number1 ;
        if (great < number2)
            great=number2;
        if (great <number3)
            great=number3;
        return great;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
