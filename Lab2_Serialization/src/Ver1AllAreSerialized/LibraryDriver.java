package Ver1AllAreSerialized;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LibraryDriver {

    public static void serializeObject(String fileName, Object obj){
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
            os.writeObject(obj);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object deSerializeObject(String fileName){
        Object obj = null;
        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName));
            obj = is.readObject();
            is.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return obj;
    }

    public static void main (String[] args){
        Author firstAuthor = new Author("Степан", "Хмара");
        Author secondAuthor = new Author("Дмитро", "Перекотиполе");

        Book firstBook = new Book("Interesting book", List.of(firstAuthor), 2010, 2);
        Book secondBook = new Book("Another interesting book", List.of(secondAuthor), 2015, 1);

        List<Author> bookAuthors = new ArrayList<>();
        bookAuthors.add(firstAuthor);
        bookAuthors.add(secondAuthor);

        List<Book> books = new ArrayList<>();
        books.add(firstBook);
        books.add(secondBook);

        BookStore bookStore = new BookStore("First BookStore", books);

        BookReader bookReader = new BookReader("Петро", "Стефанчук", 1983);

        Library firstLibrary = new Library("First library");

        firstLibrary.addBookStore(bookStore);
        firstLibrary.addBookReader(bookReader);

        LibraryDriver.serializeObject("Version1Lib.ser", firstLibrary);
        System.out.println("The library was successfully serialized!");

        Object deSer = LibraryDriver.deSerializeObject("Version1Lib.ser");
        System.out.println("Result of deserialization:\n" + deSer);
    }
}