public class Reformatory {

    private int meas;
    public int weight(Person person) {
        // return the weight of the person
        this.meas ++ ;
        return person.getWeight ();
    }

    public void feed (Person person) {
        person.setWeight (weight (person) + 1);
    }
    public int totalWeightsMeasured () {
        return this.meas;
    }
}
