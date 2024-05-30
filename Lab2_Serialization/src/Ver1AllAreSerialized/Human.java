package Ver1AllAreSerialized;

import java.io.Serializable;

public class Human implements Serializable {
    private static final long serialVersionUID = 1L;

    public String name;
    public String lastname;

    public Human (String name, String surname){
        this.name = name;
        this.lastname = surname;
    }

    public String getName(){
        return name;
    }

    public String getLastname(){
        return lastname;
    }

    public void setName(){
        this.name = name;
    }

    public void setLastname(){
        this.lastname = lastname;
    }

    public String toString(){
        return name + ", " + lastname;
    }
}