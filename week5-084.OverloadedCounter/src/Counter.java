public class Counter {
    private int number;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.check = check;
        this.number = startingValue;
    }
    public Counter(int startingValue) {
        this (startingValue , false);
    }

    public Counter (boolean check) {
        this ( 0 , check);
    }

    public Counter () {
        this (0,false);
    }

    public int value ( ){
        return this.number;
    }

    public void increase () {
        this.number ++ ;
    }
    public void decrease () {
        number --;

        if (check == true && number<0) {
            number=0;
        }
    }

    public void increase (int increaseAmount ) {
        for (int i = 0 ; i< increaseAmount ; i++)
            increase ();
    }

    public void decrease (int decreaseAmount ) {
        for (int i = 0 ; i< decreaseAmount ; i++)
            decrease ();
    }
}
