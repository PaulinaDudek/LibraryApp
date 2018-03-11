class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.2";

        Book book1 = new Book();
        book1.title="W Pustyni i w puszczy";
        book1.author="Henryk Sienkiewicz";
        book1.releaseDate = 2016;
        book1.pages =234;
        book1.publisher ="Greg";
        book1.isbn="245342535235";

        System.out.print(appName);
        System.out.println("Książki dostępne w bibliotece:");
        System.out.println(book1.title +" "+
                "\n"+ book1.author+
                "\n"+ book1.releaseDate+
                "\n"+ book1.pages+
                "\n"+ book1.publisher+
                "\n"+ book1.isbn);
    }
}