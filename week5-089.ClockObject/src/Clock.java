public class Clock {
/*    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;*/
    private BoundedCounter hours = new BoundedCounter (23);
    private BoundedCounter minutes = new BoundedCounter (59);
    private BoundedCounter seconds = new BoundedCounter (59);


    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        this.hours.setValue (hoursAtBeginning);
        this.minutes.setValue (minutesAtBeginning);
        this.seconds.setValue (secondsAtBeginning);

    }
    
    public void tick() {
        // Clock advances by one second
        this.seconds.next ();
        if (this.seconds.getValue () ==00 ){
            this.minutes.next ();
            if (this.minutes.getValue ()==00)
                this.hours.next ();
        }
    }
    
    public String toString() {
        // returns the string representation

        return "" + this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
