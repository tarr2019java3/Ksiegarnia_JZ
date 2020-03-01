package pl.sda.student;

public class Autor {
    private String name;
    private String lastname;

    public Autor(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    public Autor(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
