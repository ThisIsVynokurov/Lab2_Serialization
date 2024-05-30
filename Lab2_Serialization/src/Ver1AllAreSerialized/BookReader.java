package Ver1AllAreSerialized;

import java.util.ArrayList;
import java.util.List;

public class BookReader extends Human{

    private int regNum;
    private List<Book> borrowedBooks;

    public BookReader (String name, String lastname, int regNum){
        super(name, lastname);
        this.regNum = regNum;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getRegNum(){
        return regNum;
    }

    public void setRegNum (int regNum){
        this.regNum = regNum;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(Book book) {
        this.borrowedBooks.add(book);
    }

    @Override
    public String toString(){
        return "BookReader: " + super.toString() + ", Registration number: " + regNum + ", Borrowed books: " + borrowedBooks + "\n";
    }
}