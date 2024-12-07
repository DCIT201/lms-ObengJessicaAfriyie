package ;
import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<Book>books;
    public Library(){
        this.books=new ArrayList<>();
    }
    // Constructor
    public void addBook(Book book){
        books.add(book);
    }

    // Method to check out a book to a patron
    public boolean checkOutBook(Book book, Patron patron) {
        if (book.availability()) {
            book.setAvailability(false);
            patron.borrowBook(book);
            System.out.println(patron.getName() + " checked out " + book.getTittle());
            return true;
        } else {
            System.out.println("Sorry, " + book.getTittle() + " is not available.");
            return false;
        }
    }
    // Method to return a book from a patron
    public void returnBook(Book book, Patron patron) {
        book.setAvailability(true);
        patron.returnBook(book);
        System.out.println(patron.getName() + " returned " + book.getTittle());
    }

    // Method to list all books in the library
    public void listBooks() {
        System.out.println("Books in the Library:");
        for (Book book : books) {
            book.displayDetails();
        }
    }
}
