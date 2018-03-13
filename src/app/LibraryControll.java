package app;//Created by Paulina on 2018-03-12.

import data.Book;
import data.Magazine;
import data.Library;
import utils.DataReader;

public class LibraryControll {

    private DataReader dataReader;

    private Library library;

    public LibraryControll(){
        library= new Library();
        dataReader= new DataReader();
    }

    public void controlLoop() {
        Option option;
        printOptions();
        while ((option = Option.createFromInt(dataReader.getInt())) != Option.EXIT) {
            switch (option) {
                case ADD_BOOK:
                    addBook();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case PRINT_MAGAZINES:
                    printMagazines();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, wprowadź ponownie: ");
            }
            printOptions();
        }
        dataReader.close();
    }

    private void printOptions(){
        System.out.println("Wybierz opcję: ");
        for (Option o: Option.values()){
            System.out.println(o);
        }
    }

    private void addBook(){
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }
    private void addMagazine(){
        Magazine magazine= dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }
    private void printBooks(){
        library.printBooks();
    }
    private void printMagazines(){
        library.printMagazines();
    }
}
