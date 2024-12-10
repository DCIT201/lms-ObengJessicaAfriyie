package example;
public class Book {
      // This is your working class.
//    using the encapsulation rule, all attribute are made private
    private String title;
    private String author;
    private String edition;
    private String publisher;
    private double price;
    private String publicationDate;
    private boolean availability;
//creating constructor
    public Book(String title,String author,String publisher){
        this.title=title;
        this.author=author;
        this.publisher=publisher;
//        initially making the book available
        this.availability= true;

    }
//    I'm providing getters
    public String getTittle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getPublisher(){
        return publisher;
    }
    public boolean getAvailability(){
        return availability;
    }

    public boolean availability(){
        return availability;
    }
//    I'm providing setters
    public void setAvailability(boolean availability){
        this.availability=availability;
    }
    //    creating a method to display details of the book
    public void displayDetails(){
        System.out.println("Title:"+title);
        System.out.println("Author"+author);
        System.out.println("Publisher:"+publisher);
        System.out.println("Availability:"+availability);
    }
}

