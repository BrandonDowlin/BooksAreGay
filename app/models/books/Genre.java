package models.books;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Genre extends Model 
{
    @Id
    private Long id;
    
    @Constraints.Required
    private String name;

    @ManyToMany
    private List<Book> books;

    public Genre() {
    }

    public Genre(Long id, String name, List<Book> books) {
        this.id = id;
        this.name = name;
        this.books = books;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public static Finder<Long, Genre> find = new Finder<Long, Genre>(Genre.class);

    public static List<Genre> findAll() {
        return Genre.find.query().where().orderBy("name asc").findList();
    }


    public static Map<String, String> options() {
        LinkedHashMap<String, String> options = new LinkedHashMap();

        for (Genre g: Genre.findAll()) {
            options.put(g.getId().toString(), g.getName());
        }
        
        return options;
    }        
        public static boolean inGenre(Long genre, Long book) {
            return find.query().where()
                .eq("books.id", book)
                .eq("id", genre)
                .findCount() > 0;
        }
    }
