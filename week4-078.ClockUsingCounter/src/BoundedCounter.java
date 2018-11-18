public class BoundedCounter {
    private int value;
    private int upperLimit;
    private int valueAtStart=value;
    public BoundedCounter (int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next ( ) {
        if (value==upperLimit)
            value = valueAtStart;
        else {
            value++;
        }
    }

    public String toString ( ) {

        //if (this.value <0)
        //    return ""+0;

        if (this.value <10)
            return "0" + this.value;
        else
            return "" + this.value;
    }
    public int getValue () {
        return this.value;
    }
    public void setValue (int v) {
        if (v >= 0)
            this.value = v;
        if (v > this .upperLimit)
            this.value = 0;

    }

}
