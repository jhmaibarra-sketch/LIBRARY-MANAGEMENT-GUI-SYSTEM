public class Book {

    private String id;
    private String title;
    private String author;
    private int copies;

    public Book(String id,
                String title,
                String author,
                int copies) {

        this.id = id;
        this.title = title;
        this.author = author;
        this.copies = copies;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getCopies() {
        return copies;
    }

    public boolean borrowBook() {

        if(copies > 0){
            copies--;
            return true;
        }

        return false;
    }

    public void returnBook() {
        copies++;
    }
}