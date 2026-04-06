// A.	Create a Book class with multiple attributes such as title, author, ISBN, price, and publisher. Implement a method applyDiscount() to apply a discount to the price and a method to display book details.

public class Book {
    public String title;
    public String author;
    public long isbn;
    public int price;
    public String publisher;

    public void applyDiscount(int discount) {
        if (discount < 100) {
            System.out.println("After discount Book Price: " + (price - (price * discount) / 100) + " Rs");
        }
    }

    public void bookDetails() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("ISBN       : " + isbn);
        System.out.println("Price      : " + price);
        System.out.println("Publisher  : " + publisher);
    }
}
