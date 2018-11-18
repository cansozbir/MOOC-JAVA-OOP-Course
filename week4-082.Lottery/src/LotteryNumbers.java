import javafx.scene.control.RadioMenuItem;

import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    Random r = new Random ();
    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        int eklenen;
        while ( numbers.size () < 7 ){
            eklenen = r.nextInt (39)+1;
            if (!containsNumber (eklenen))
                this.numbers.add(eklenen);
        }

    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (this.numbers.contains (number))
            return true;
        else
            return false;
    }
}
