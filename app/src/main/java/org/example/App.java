/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
   blic static void main(String[] args) {
            // Create a Library
            Library library = new Library();

            // Create some books
            Book book1 = new Book("1984", "George Orwell","Secker & Weinberg");
            Book book2 = new Book("To Kill a Mockingbird", "Harper Lee","Harper & Rowling");
            Book book3 = new Book("Moby Dick", "Herman Melville","Douglas Adams");

            // Add books to the library
            library.addBook(book1);
            library.addBook(book2);
            library.addBook(book3);

            // Create a Patron
            Patron patron1 = new Patron("John Doe");

            // List books in the library
            library.listBooks();

            // Patron borrows a book
            library.checkOutBook(book1, patron1);

            // List borrowed books by the patron
            patron1.listBorrowedBooks();

            // Patron returns the book
            library.returnBook(book1, patron1);

            // List books in the library again after returning the book
            library.listBooks();
        }
}
