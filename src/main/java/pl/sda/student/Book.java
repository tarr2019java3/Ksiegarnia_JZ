package pl.sda.student;

public class Book {
    private String name;
    private Autor autor;
    private Category category;

    public Book(String name, Autor autor, Category category) {
        this.name = name;
        this.autor = autor;
        this.category = category;
    }
    public Book(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
