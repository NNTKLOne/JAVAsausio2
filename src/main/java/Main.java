import org.example.model.BookExchange;
import org.example.utils.MenuOperation;
import org.example.utils.ReadWriteOperation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String cmd = "";

//Buvo taip pas destytoja
//        BookExchange bookExchange = ReadWriteOperation.readFromFile();
//        if (bookExchange == null) bookExchange = new BookExchange();


        // Attempt to read the object from the file
        BookExchange bookExchange = ReadWriteOperation.readFromFile();

        // If the file is empty or reading failed, create a new BookExchange object
        if (bookExchange == null) {
            System.out.println("File not found or empty. Creating a new BookExchange.");
            bookExchange = new BookExchange();

            // Write this new object to the file to avoid EOFException next time
            ReadWriteOperation.writeToFileAsObject(bookExchange);
        }


        while (!cmd.equals("q")) {

            System.out.println("""
                    Choose an option
                    u - work with users
                    p - work with publications
                    w - write to file as text
                    q - quit
                    """);

            cmd = scanner.nextLine();


            switch (cmd) {
                case "u":
                    MenuOperation.generateUserMenu(scanner, bookExchange);
                    break;
                case "p":
                    break;
                case "w":
                    ReadWriteOperation.writeUsersToFile(bookExchange.getUsers());
                    System.out.println("Saved users to user.txt.");
                    break;
                case "q":
                    ReadWriteOperation.writeToFileAsObject(bookExchange);
                    System.out.println("Saving BookExchange as object and exiting.");
                    break;
                default:
                    System.out.println("Learn to read");
            }
        }

    }
    //xd
}