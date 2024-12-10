package org.example;
import java.util.ArrayList;
import java.util.List;

public class Patron {

        private String name;
        private List<Book> borrowedBooks;

        // Constructor
        public Patron(String name) {
            this.name = name;
            this.borrowedBooks = new ArrayList<>();
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Method to borrow a book
        public void borrowBook(Book book) {
            borrowedBooks.add(book);
        }

        // Method to return a book
        public void returnBook(Book book) {
            borrowedBooks.remove(book);
        }

        // Method to list borrowed books
        public void listBorrowedBooks() {
            System.out.println(name + "'s Borrowed Books:");
            for (Book book : borrowedBooks) {
                book.displayDetails();
            }
        }
    }
