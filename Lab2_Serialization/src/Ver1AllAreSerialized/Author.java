package Ver1AllAreSerialized;

public class Author extends Human{
    private static final long serialVersionUID = 1L;

    public Author (String name, String lastname){
        super (name, lastname);
    }

    @Override
    public String toString(){
        return "Author: " + super.toString();
    }
}
