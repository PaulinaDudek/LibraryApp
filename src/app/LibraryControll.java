package app;//Created by Paulina on 2018-03-12.

import data.Book;
import data.Magazine;
import data.Library;
import utils.DataReader;
import utils.LibraryUtils;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class LibraryControll {
    private DataReader dataReader;

    private Library library;

    public LibraryControll(){
        library= new Library();
        dataReader= new DataReader();
    }

    public void controlLoop() {
        Option option = null;
        while (option != Option.EXIT) {
            try {
                printOptions();
                option = Option.createFromInt(dataReader.getInt());
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
                    case EXIT:
                        ;
                }
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono niepoprawne dane, publikacji nie dodano");
            } catch (NumberFormatException | NoSuchElementException e) {
                System.out.println("Wybrana opcja nie istnieje, wybierz ponownie:");
            }
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
        LibraryUtils.printBooks(library);
    }
    private void printMagazines(){
        LibraryUtils.printMagazines(library);
    }
}
