package app;//Created by Paulina on 2018-03-12.

import data.Book;
import data.Library;
import utils.DataReader;

public class LibraryControll {

    public static final int EXIT = 0;
    public static final int ADD_BOOK = 1;
    public static final int PRINT_BOOKS = 2;

    private DataReader dataReader;

    private Library library;

    public LibraryControll(){
        library= new Library();
        dataReader= new DataReader();
    }

    public void controlLoop(){
        int option;
        printOptions();
        while ((option=dataReader.getInt())!=EXIT){
            switch (option){
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_BOOKS:
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
