package utils;//Created by Paulina on 2018-03-12.

import data.Book;

import java.util.Scanner;

public class DataReader {
    private Scanner input;

    public DataReader(){
        input = new Scanner(System.in);
    }
    public void close(){
        input.close();
    }

    public int getInt(){
        int number = input.nextInt();
        input.nextLine();
        return number;
    }

    public Book readAndCreateBook(){
        System.out.println("Tytuł: ");
        String title = input.nextLine();
        System.out.println("Autor: ");
        String author = input.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = input.nextLine();
        System.out.println("ISBN: ");
        String isbn = input.nextLine();
        System.out.println("Rok wydania: ");
        int releaseDate = input.nextInt();
        input.nextLine();
        System.out.println("Ilość stron: ");
        int pages = input.nextInt();
        input.nextLine();

        return new Book(title,author,releaseDate, pages,publisher,isbn);
    }

}
