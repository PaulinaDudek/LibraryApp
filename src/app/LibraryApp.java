package app;//Created by Paulina on 2018-03-12.

public class LibraryApp {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.8";
        System.out.println(appName);

        LibraryControll libControll = new LibraryControll();
        libControll.controlLoop();
    }
}
