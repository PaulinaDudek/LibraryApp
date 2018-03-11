public class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    Book (String title, String author, int releaseDate, int pages, String publisher, String isbn){
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    Book (Book book){
        this(book.title, book.author, book.releaseDate, book.pages, book.publisher, book.isbn);
    }

    void printInfo (){
        String info = title+"; "+author+
                "\n"+releaseDate+
                "\n"+pages+
                "\n"+publisher+
                "\n"+isbn;
        System.out.println(info);
    }
}
