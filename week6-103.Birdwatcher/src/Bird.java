
public class Bird {
    private String name ;
    private String latinName ;
    private int howmanytimes ;

    public Bird ( String name, String latinName ) {
        this.name = name;
        this.latinName = latinName;
        this.howmanytimes = 0;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getLatinName ( ) {
        return latinName;
    }

    public void setLatinName ( String latinName ) {
        this.latinName = latinName;
    }

    public int getHowmanytimes ( ) {
        return howmanytimes;
    }

    public void setHowmanytimes ( int howmanytimes ) {
        this.howmanytimes = howmanytimes;
    }

    public void gozlendi ( ) {
        this.howmanytimes ++;
    }

    public String toString () {

        return this.getName () + "(" + this.latinName + "): " +this.howmanytimes + " observations" ;

    }
}
