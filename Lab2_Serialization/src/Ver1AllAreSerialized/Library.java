package Ver1AllAreSerialized;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Library implements Serializable {
    private static final long serialVersionUID = 1L;

    private String libraryName;
    private List<BookStore> bookStores;
    private List<BookReader> bookReaders;

    public Library (String libraryName){
        this.bookReaders = new ArrayList<>();
        this.bookStores = new ArrayList<>();
    }

    public String getLibraryNameName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public List<BookStore> getBookStores(){
        return bookStores;
    }

    public void setBookStores(List<BookStore> bookStores) {
        this.bookStores = bookStores;
    }

    public void setBookReaders(List<BookReader> bookReaders) {
        this.bookReaders = bookReaders;
    }

    public void addBookStore (BookStore bookStore){
        this.bookStores.add(bookStore);
    }

    public void addBookReader (BookReader bookReader){
        this.bookReaders.add(bookReader);
    }

    @Override
    public String toString(){
        return "Library name: " + libraryName + ", List of book stores: " + bookStores + ", Book readers: " + bookReaders + "\n";
    }
}