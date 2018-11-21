import java.util.ArrayList;

public class Team {
    private  String name ;
    private ArrayList<Player> players = new ArrayList<Player> ();
    private int maxSize=16 ;


    public Team (String  n) {
        this.name = n;
    }

    public String getName ( ) {
        return name;
    }

    public void addPlayer (Player p) {
        if (size () < maxSize)
            players.add (p);
    }

    public void printPlayers () {
        for (Player each : players) {
            System.out.println (each);
        }
    }

    public void setMaxSize (int maxSize) {
        this.maxSize = maxSize;
    }

    public int size () {
        return this.players.size ();
    }
    public int goals () {
        int sum=0 ;
        for(Player each : players )
            sum += each.goals ();
        return sum;
    }
}
