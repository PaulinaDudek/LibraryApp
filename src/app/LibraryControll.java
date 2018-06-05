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

    private enum Option{
        EXIT (0,"Wyjście z programu"),
        ADD_BOOK (1, "Dodanie książki"),
        ADD_MAGAZINE (2, "Dodanie magazynu"),
        PRINT_BOOKS (3, "Wyświetlenie dostępnych książek"),
        PRINT_MAGAZINES (4, "Wyświetlenie dostępnych magazynów");

        private int value;
        private String description;

        Option (int value, String description){
            this.value=value;
            this.description=description;
        }

        @Override
        public String toString() {
            return value+" "+description;
        }

        public static Option createFromInt(int option) throws NoSuchElementException{
            Option result = null;
            try{
                result = Option.values()[option];
            }catch (ArrayIndexOutOfBoundsException e){
                throw new NoSuchElementException("Brak elementu o wskazanym ID");
            }
            return result;
        }
    }
}
