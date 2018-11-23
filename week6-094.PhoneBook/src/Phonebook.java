import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> persons = new ArrayList<Person> ();

    public void add(String name, String number) {
        Person p = new Person (name , number);
        persons.add(p);
    }
    public void printAll() {
        for (Person each : persons ){
            System.out.println (each );
        }
    }
    public String searchNumber(String name) {
        for (Person each : persons) {
            if (each.getName ().equals (name ))
                return each.getNumber ();
        }
        return "number not found";
    }
}
