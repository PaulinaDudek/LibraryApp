package app;//Created by Paulina on 2018-03-12.

public class LibraryApp {
    public static final String appName = "Biblioteka v0.9";
    public static void main(String[] args) {

        System.out.println(appName);

        LibraryControll libControll = new LibraryControll();
        libControll.controlLoop();
    }
}