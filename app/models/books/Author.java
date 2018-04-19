package models.books;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Author extends Model {
    @Id
    private Long id;
    @Constraints.Required
    private String fname;
    @Constraints.Required
    private String lname;

    @OneToMany
    public List<Book> books;

    public Author() {
    }

    public Author(Long id, String fname, String lname, List<Book> books) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.books = books;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return this.fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return this.lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public List<Book> getProducts() {
        return books;
    }

    public void setProducts(List<Book> books) {
        this.books = books;
    }

    public static Finder<Long, Author> find = new Finder<Long, Author>(Author.class);

    public static List<Author> findAll() {
        return Author.find.query().where().orderBy("lname asc").findList();
    }

    public static Map<String, String> options(){
        LinkedHashMap<String, String> options = new LinkedHashMap();
        for (Author a : Author.findAll()){
            options.put(a.getId().toString(), a.getLname());
        }
        return options;
    }
}