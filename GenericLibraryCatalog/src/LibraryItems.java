public class LibraryItems <T> {

    private String bookTitle;
    private String Author;
    private T itemID;

    public LibraryItems (String bookTitle, String Author, T itemID){
        this.bookTitle = bookTitle;
        this.Author = Author;
        this.itemID = itemID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return Author;
    }

    public T getItemID() {
        return itemID;
    }




    
    

    
    

}
