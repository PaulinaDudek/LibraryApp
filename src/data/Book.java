package data;

public class Book {
    private String title;
    private String author;
    private int releaseDate;
    private int pages;
    private String publisher;
    private String isbn;

    //CONSTRUCTORS
    public Book (String title, String author, int releaseDate, int pages, String publisher, String isbn){
        setTitle(title);
        setAuthor(author);
        setReleaseDate(releaseDate);
        setPages(pages);
        setPublisher(publisher);
        setIsbn(isbn);
    }

    public Book (Book book){
        this(book.title, book.author, book.releaseDate, book.pages, book.publisher, book.isbn);
    }

    // SETTERS AND GETTERS
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        if (releaseDate>0){
            this.releaseDate = releaseDate;
        }else {
            System.out.println("Data nie może być mniejsza od 0.");
        }

    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

   public void printInfo (){
        String info = title+"; "+author+
                "\n"+releaseDate+
                "\n"+pages+
                "\n"+publisher+
                "\n"+isbn;
        System.out.println(info);
    }


}
