import java.util.List;

public class LibraryGenericCatalog <T extends LibraryItems> {

    private List<T> items;

    public LibraryGenericCatalog(List<T> items) {
        this.items = items;
    }
    boolean isAdded;
    public boolean addItem(T item) {
        for (T existingItem : items) {
            if (existingItem.getItemID() == item.getItemID()
            || existingItem.getBookTitle().equals(item.getBookTitle())) {
                System.out.println("Item with the same ID or title already exists in the catalog.");
                isAdded = false;
                break;
            }
        }
        if (isAdded != false) {
            items.add(item);
        }
        return isAdded;
    }
    boolean isnotExist;
    public boolean removeItem(int removeItemId) {
        for (T item : items) {
            if ((int) item.getItemID() == removeItemId) {
                items.remove(item);
                isnotExist = false;
                break;
            }
            
        }
        if (isnotExist == true) {
            System.out.println("Item with the given ID does not exist in the catalog.");
                
            }
        return isnotExist;
    }

    public void listItems() {
        for (T item : items) {
            System.out.println(item.getItemID() 
             + " : " +  item.getBookTitle()
             + " : " + item.getAuthor());
        }
    }   



    

    
}
