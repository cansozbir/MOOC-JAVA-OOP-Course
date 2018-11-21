import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;

    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public Person (String name , MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Person(String name) {
        this.name = name;
        MyDate current = new MyDate (Calendar.getInstance ( ).get (Calendar.DATE) ,
                                 Calendar.getInstance().get(Calendar.MONTH) + 1 ,
                                     Calendar.getInstance().get(Calendar.YEAR));
        this.birthday = current;
    }
    
    public int age() {

        MyDate current = new MyDate (Calendar.getInstance ( ).get (Calendar.DATE) ,
                                 Calendar.getInstance().get(Calendar.MONTH) + 1 ,
                                     Calendar.getInstance().get(Calendar.YEAR));


        return current.differenceInYears (this.birthday);
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        return this.birthday.earlier (compared.birthday);
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
