package Ver1AllAreSerialized;

import java.io.Serializable;
import java.util.List;

public class BookStore implements Serializable {
    private static final long serialVersionUID = 1L;

    private String storeName;
    private List<Book> books;

    public BookStore(String storeName, List<Book> books){
        this.storeName = storeName;
        this.books = books;
    }

    public String getStoreName (){
        return storeName;
    }

    public void setStoreName(String storeName){
        this.storeName = storeName;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString(){
        return "Name of BookStore: " + storeName + ", Books: " + books + "\n";
    }
}