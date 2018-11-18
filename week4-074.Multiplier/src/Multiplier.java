public class Multiplier {
    private int multiplier;

    public Multiplier (int number) {
        this.multiplier = number;
    }

    public int multiply (int otherNumber) {
        return (otherNumber * multiplier);
    }
}
