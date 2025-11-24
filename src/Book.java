public class Book
{
    String title;
    String author;
    double price;

    Book(String title, String author, double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    Book(String title, String author)  {
        this.title = title;
        this.author = author;
    }

    Book(){
    }
}
