package app;

import data.Book;
import utils.DataReader;

class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.7";

        Book []books = new Book[1000];
        DataReader dataReader = new DataReader();

        System.out.println(appName);
        System.out.println("Wprowadź nową książkę:");
        books[0]=dataReader.readAndCreateBook();
        dataReader.close();

        System.out.println("Książki w bibliotece:");
        books[0].printInfo();
        System.out.println("System może przechowywać "+books.length+" książek.");
    }
}