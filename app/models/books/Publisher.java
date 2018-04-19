package models.books;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Publisher extends Model {
    @Id
    private Long id;
    @Constraints.Required
    private String name;
    @Constraints.Required
    private String address;
    @Constraints.Required
    private String country;

    @OneToMany
    public List<Book> books;

    public Publisher(Long id, String name, String address, String country, List<Book> books) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.country = country;
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

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Book> getProducts() {
        return books;
    }

    public void setProducts(List<Book> books) {
        this.books = books;
    }

    public static Finder<Long, Publisher> find = new Finder<Long, Publisher>(Publisher.class);

    public static List<Publisher> findAll() {
        return Publisher.find.query().where().orderBy("name asc").findList();
    }

    public static Map<String, String> options(){
        LinkedHashMap<String, String> options = new LinkedHashMap();
        for (Publisher p : Publisher.findAll()){
            options.put(p.getId().toString(), p.getName());
        }
        return options;
    }
}