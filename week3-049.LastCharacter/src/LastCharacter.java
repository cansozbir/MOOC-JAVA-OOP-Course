import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println ("Type your name: ");
        System.out.println ("Last character: "+lastCharacter ( reader.nextLine ()) );
    }
    public static char lastCharacter(String text) {
        return text.charAt (text.length ()-1);
    }
}
