package Practic_3;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Anton", "Book", 2012);
        System.out.println(book);
        book.setAuthor("NONE");
        System.out.println(book);


    }
}
