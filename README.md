

# Library Catalog System

This project is a simple library catalog system implemented in Java. It allows you to manage a catalog of library items, each represented by a `LibraryItems` object. Each item has a title, an author, and an ID.

## Features

- **Add items to the catalog**: You can add new items to the catalog. The system checks if an item with the same ID or title already exists before adding a new item.

- **Remove items from the catalog**: You can remove items from the catalog by their ID. The system checks if an item with the given ID exists before attempting to remove it.

- **List all items in the catalog**: You can list all items currently in the catalog. The system will print the ID, title, and author of each item.

## Usage

To use this system, create a `LibraryGenericCatalog` object and use its methods to manage the catalog. Here's an example:

```java
LibraryGenericCatalog<LibraryItems> libraryCatalog = new LibraryGenericCatalog<>(new ArrayList<>());

LibraryItems book1 = new LibraryItems("Java:The Complete Reference", "Herbert Schildt", 1);
LibraryItems book2 = new LibraryItems("Head First Java", "Kathy Sierra", 2);

libraryCatalog.addItem(book1);
libraryCatalog.addItem(book2);

libraryCatalog.listItems();
```

This will add two books to the catalog and then list all items in the catalog.

## Files

- [`LibraryItems.java`](command:_github.copilot.openSymbolInFile?%5B%22src%2FLibraryItems.java%22%2C%22LibraryItems.java%22%5D "src/LibraryItems.java"): This file defines the `LibraryItems` class, which represents an item in the library.

- [`LibraryGenericCatalog.java`](command:_github.copilot.openSymbolInFile?%5B%22src%2FLibraryGenericCatalog.java%22%2C%22LibraryGenericCatalog.java%22%5D "src/LibraryGenericCatalog.java"): This file defines the `LibraryGenericCatalog` class, which represents the library catalog.

- [`Main.java`](command:_github.copilot.openSymbolInFile?%5B%22src%2FMain.java%22%2C%22Main.java%22%5D "src/Main.java"): This file contains the `main` method that runs the program.

## Building and Running

To build and run this project, use the following commands in the terminal:

```bash
javac -d bin src/*.java
java -cp bin Main
```

