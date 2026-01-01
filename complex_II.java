
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

abstract class Item  {
   private String id;
    private String title;
    private LocalDate publicationDate;
    private int MaxCheckoutDays;

    public Item(String var1, String var2, LocalDate var3, int var4) {
        this.id = var1;
        this.title = var2;
        this.publicationDate = var3;
        this.MaxCheckoutDays = var4;
    }

    public String getId(){
        return this.id;

    }

    public String getTitle(){
        return this.title;
    }

    public LocalDate getPublicationDate() {
        return this.publicationDate;
    }

    public int getMaxCheckoutDays() {
        return this.MaxCheckoutDays;
    }   
}

class Book extends Item {
    private String author;
    private int pages;

    public Book(String id, String title, LocalDate publicationDate, int maxCheckoutDays, String author) {
        super(id, title, publicationDate, maxCheckoutDays);
        this.author = author;
        this.pages = pages; 
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPages() {
        return this.pages;
    }
}

class DVD extends Item {
    private String director;
    private int runningTime;

    public DVD(String id, String title, LocalDate publicationDate,  String director, int runningTime) {
        super(id, title, publicationDate, 7);
        this.director = director;
        this.runningTime = runningTime;
    }

    public String getDirector() {
        return director;
    }

    public int getRunningTime() {
        return runningTime;
    }
}
class CD extends Item {
    private String artist;
    private int tracks;

    public CD(String id, String title, LocalDate publicationDate, String artist, int tracks) {
        super(id, title, publicationDate, 7);
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist() {
        return artist;
    }

    public int getTracks() {
        return tracks;
    }


}

class Patron {
    private String name;
    private int patronId;
    private List<Item> checkedOutItems;

    public Patron(String name, int patronId) {
        this.name = name;
        this.patronId = patronId;
        this.checkedOutItems =new ArrayList<>();
    }

    public void checkoutItem(Item item) {
        if(checkedOutItems.size() < 10) {
            checkedOutItems.add(item);
        }
    }

    public void returnItem(Item item) {
        checkedOutItems.remove(item);
    }

    public int getNumItemsCheckedOut() {
        return checkedOutItems.size();
    }

    public String getName() { return name; }
    public int getId() { return patronId; }
     public List<Item> getCheckedOutItems() { return checkedOutItems; }
}

public class complex_II {
    public static void main(String[] args) {
        Book book = new Book("B001", "The Great Gatsby", LocalDate.of(1925, 4, 10), 21, "F. Scott Fitzgerald");
        DVD dvd = new DVD("D001", "Inception", LocalDate.of(2010, 7, 16), "Christopher Nolan", 148);
        CD cd = new CD("C001", "Thriller", LocalDate.of(1982, 11, 30), "Michael Jackson", 9);

       Patron alex= new Patron("alice",4567);
        alex.checkoutItem(book);
        alex.checkoutItem(dvd);
        System.out.println("Alice's Checked Out Items:"+ alex.getCheckedOutItems());

        // Returning an item
        alex.returnItem(dvd);
        System.out.println("Alice's Checked Out Items after returning DVD:"+ alex.getCheckedOutItems());
    }
}


