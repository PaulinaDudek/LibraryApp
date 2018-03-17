package utils;//Created by Paulina on 2018-03-12.

import data.Book;
import data.Magazine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataReader {
    private Scanner input;

    public DataReader(){
        input = new Scanner(System.in);
    }
    public void close(){
        input.close();
    }

    public int getInt()throws NumberFormatException{
        int number = 0;
        try{
            number=input.nextInt();
        }catch (NumberFormatException e){
            throw new NumberFormatException("Liczba wprowadzona w niepoprawnej formie.");
        }finally {
            input.nextLine();
        }
        return number;
    }

    public Book readAndCreateBook() throws InputMismatchException{
        System.out.println("Tytuł: ");
        String title = input.nextLine();
        System.out.println("Autor: ");
        String author = input.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = input.nextLine();
        System.out.println("ISBN: ");
        String isbn = input.nextLine();
        System.out.println("Rok wydania: ");
        int releaseDate = 0;
        int pages = 0;
        try{
            releaseDate=input.nextInt();
            input.nextLine();
            System.out.println("Ilość stron: ");
            pages=input.nextInt();
            input.nextLine();
        }catch (InputMismatchException e){
            input.nextLine();
            throw e;
        }
        return new Book(title,author,releaseDate, pages,publisher,isbn);
    }

    public Magazine readAndCreateMagazine()throws InputMismatchException{
        System.out.println("Tytuł: ");
        String title = input.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = input.nextLine();
        System.out.println("Język: ");
        String language = input.nextLine();
        System.out.println("Rok wydania: ");
        int year =0;
        int month=0;
        int day =0;
        try{
           year=input.nextInt();
           input.nextLine();
           System.out.println("Miesiąc: ");
           month=input.nextInt();
           input.nextLine();
           System.out.println("Dzień: ");
           day=input.nextInt();
           input.nextLine();
        }catch (InputMismatchException e){
            input.nextLine();
            throw e;
        }

        return new Magazine(title, publisher, language, year, month, day);
    }

}
