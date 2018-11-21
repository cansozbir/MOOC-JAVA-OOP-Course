public class Student {
    private String name;
    private String studentNumber;

    public Student ( String n, String no ) {
        this.name = n;
        this.studentNumber = no;
    }

    public String getName () {
        return name;
    }

    public String getStudentNumber () {
        return studentNumber;
    }

    public String toString () {
        return "" + getName ( ) + " " +"("+this.getStudentNumber ( )+")";
    }




}
