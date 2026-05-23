/*Book Library (Manual Objects). Create a Book class with attributes: title, author, ISBN. 
In the main() method, create 5 different Book objects manually and display their details 
using a method showDetails(). */

class Book{
    String title;
    String author;
    int ISBN;

    public void showDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println();
    }
}

public class Q01 {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Matters of origin";
        book1.author = "Michael Richards";
        book1.ISBN = 36999;

        Book book2 = new Book();
        book2.title = "The Hunger Games";
        book2.author = "Saka";
        book2.ISBN = 12345;

        Book book3 = new Book();
        book3.title = "The Art of War";
        book3.author = "Sun Tzu";
        book3.ISBN = 10992;

        Book book4 = new Book();
        book4.title = "Iceman";
        book4.author = "Mark Grayson";
        book4.ISBN = 67677;

        Book book5 = new Book();
        book5.title = "One with Nature";
        book5.author = "David Raya";
        book5.ISBN = 20267;

        book1.showDetails();
        book2.showDetails();
        book3.showDetails();
        book4.showDetails();
        book5.showDetails();
    }
}