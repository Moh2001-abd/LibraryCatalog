import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Main class represents the entry point of the program. It contains the main method
 * which initializes the library catalog, interacts with the user, and performs various
 * operations on the catalog such as adding, removing, and retrieving items.
 */
public class Main {

    public static void main(String[] args) {

        LibraryGenericCatalog<LibraryItems> libraryCatalog = new LibraryGenericCatalog<>(new ArrayList<>());

        LibraryItems book1 = new LibraryItems("Java:The Complete Reference", "Herbert Schildt", 1);
        LibraryItems book2 = new LibraryItems("Head First Java", "Kathy Sierra", 2);
        LibraryItems book3 = new LibraryItems("Effective Java", "Joshua Bloch", 3);
        LibraryItems book4 = new LibraryItems("Thinking in Java", "Bruce Eckel", 4);
        
        libraryCatalog.addItem(book1);
        libraryCatalog.addItem(book2);
        libraryCatalog.addItem(book3);
        libraryCatalog.addItem(book4);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Retrieve item");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemTitle = scanner.nextLine();
                    System.out.print("Enter item ID: ");
                    int itemId = scanner.nextInt();
                    System.out.print("Enter item author: ");
                    String Author = scanner.nextLine();
                    scanner.nextLine(); // Consume the newline character
                    LibraryItems item = new LibraryItems(itemTitle, Author, itemId);
                    libraryCatalog.addItem(item);
                    if (libraryCatalog.addItem(item) == false) {
                        System.out.println("Addition failed!");
                    } else {
                        System.out.println("Item added successfully!");
                        
                    }
                    break;
                case 2:
                    System.out.print("Enter item ID to remove: ");
                    int removeItemId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    libraryCatalog.removeItem(removeItemId);
                    System.out.println("Item removed successfully!");
                    break;
                case 3:
                    System.out.println("Items in the library:");
                    libraryCatalog.listItems();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
