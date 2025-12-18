class Book {
    private String title;
    private String author;
    private double numPages; 

    public Book(String t, String a, double np) {
        title = t;
        author = a;
        numPages = np;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getNumPages() {
        return numPages;
    }

}

class Books{
    public static void main(String[] args) {
        Book book = new Book("The Mobbit", "J.R.R. Tolkien", 295);
        
        System.out.println("\nBook information:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("no. Pages: " + book.getNumPages());

    }
}
