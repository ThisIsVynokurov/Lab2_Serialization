package Ver1AllAreSerialized;

import java.io.Serializable;
import java.util.List;

public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    private String bookTitle;
    private List<Author> authors;
    private int year;
    private int edition;

    public Book(String bookTitle, List<Author> authors, int year, int edition) {
        this.bookTitle = bookTitle;
        this.authors = authors;
        this.year = year;
        this.edition = edition;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getEdition() {
        return edition;
    }

    @Override
    public String toString(){
        return "Book: " + bookTitle +", Author(or authors): " + authors + ", Year: " + year + ", Edition: " + edition + "\n";
    }
}
