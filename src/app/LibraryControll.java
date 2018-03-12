package app;//Created by Paulina on 2018-03-12.

import data.Book;
import data.Library;
import utils.DataReader;

public class LibraryControll {
    public final int exit = 0;
    public final int add_book = 1;
    public final int print_boooks = 2;

    private DataReader dataReader;

    private Library library;

    public LibraryControll(){
        library= new Library();
        dataReader= new DataReader();
    }

    public void controlLoop(){
        int option;
        printOptions();
        while ((option=dataReader.getInt())!=exit){
            switch (option){
                case add_book:
                    addBook();
                    break;
                case print_boooks:
                    printBooks();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji.");
            }
            printOptions();
        }
        dataReader.close();
    }

    private void printOptions(){
        System.out.println("Wybierz opcję: ");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - dodanie nowej książki");
        System.out.println("2 - wyświetl dostępne książki");
    }

    private void addBook(){
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }
    private void printBooks(){
        library.printBooks();
    }
}
