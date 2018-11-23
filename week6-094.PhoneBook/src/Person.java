public class Person {
    private String name ;
    private String number ;

    public Person (String na , String no) {
        this.name = na;
        this.number = no;
    }

    public String getName ( ) {
        return name;
    }

    public String getNumber ( ) {
        return number;
    }

    public String toString () {
        return this.name +" number: "+ this.number;
    }

    public void changeNumber (String newNumber) {
        this.number = newNumber;
    }

}

