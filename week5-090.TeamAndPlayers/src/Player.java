public class Player {
    private String name ;
    private int amountOfGoals;

    public Player (String s){
        this.name=s;
    }
    public Player (String s , int g) {
        this.name = s;
        this.amountOfGoals = g;
    }

    public String getName ( ) {
        return name;
    }

    public int goals( ) {
        return amountOfGoals;
    }

    public String toString () {
        return getName ()+ ", goals "+goals ();
    }
}
