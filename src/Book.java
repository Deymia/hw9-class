public class Book {
    private String bookName;
    private String author;
    private int publicYear;

    public Book(String bookName, String author, int publicYear) {
        this.bookName = bookName;
        this.author = author;
        this.publicYear = publicYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPublicYear() {
        return this.publicYear;
    }

    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;
    }

}








