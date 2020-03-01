package pl.sda.student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Autor autor = new Autor("Umberto", "Eco");
        Autor autor1 = new Autor("Czesław", "Miłosz");

        Category category = new Category("literatura włoska");
        Category category1 = new Category("literatura polska");

        Book book = new Book("Imie Rozy", autor, category);
        Book book1 = new Book("Zniewolony Umysł", autor1, category1);
        Book book2 = new Book("Zniewolony umysł po latach", autor1, category1);

        List<Book> listaksiazek = new ArrayList<>();
        listaksiazek.add(book);
        listaksiazek.add(book1);
        listaksiazek.add(book2);

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.writeValue(new File("listaksiazek.json"), listaksiazek);
            objectMapper.writeValue(new File("book.json"), book);
            objectMapper.writeValue(new File("book1.json"), book1);
            objectMapper.writeValue(new File("book2.json"), book2);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}