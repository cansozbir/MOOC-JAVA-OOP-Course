import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<Book> ();

    public Library () {

    }

    public void addBook (Book newBook) {
        books.add(newBook);
    }

    public void printBooks() {
        for (Book each : books) {
            System.out.println (each);
        }
    }
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> result  = new ArrayList<Book> ();
        for (Book each : books) {
            if (StringUtils.included (each.title () , title) )
                result.add (each);
        }
        return result;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> result  = new ArrayList<Book> ();
        for (Book each : books) {
            if (StringUtils.included (each.publisher () , publisher) )
                result.add (each);
        }
        return result;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> result  = new ArrayList<Book> ();
        for (Book each : books) {
            if (each.year ()==year)
                result.add (each) ;
        }
        return result;
    }
}
