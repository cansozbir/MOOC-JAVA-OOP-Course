import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    Random r = new Random ();

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String pw = "";
        String symbol = "abcdefghijklmnopqrstuvwxyz";
        for (int i=0 ; i<length ; i++)
            pw += symbol.charAt (r.nextInt (26));
        return pw;
    }
}
