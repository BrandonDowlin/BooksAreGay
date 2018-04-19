package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
//Specified mapped table name
@Table(name = "user")
//Map inherited class to a single table
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//Discriminator column used to define user type
@DiscriminatorColumn(name="role")
//The user type is user
@DiscriminatorValue("user")

public class Payment extends Model {
    @Id
    private String email;

    @Constraints.Required
    private String firstName;

    @Constraints.Required
    private String lastName;

    @Constraints.Required
    private String addL1;

    @Constraints.Required
    private String addL2;

    @Constraints.Required
    private String city;

    @Constraints.Required
    private String county;

    @Constraints.Required
    private String zipCode;

    @Constraints.Required
    private String country;

    // Constructor to initialise object
    public  Payment(String email, String firstName, String lastName, String addL1, String addL2, String city, String county, String zipCode, String country) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addL1 = addL1;
        this.addL2 = addL2;
        this.city = city;
        this.county = county;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String getemail(){
        return email;
    }

    public void setemail(String email){
        this.email = email;
    }

    public String getfirstName(){
        return firstName;
    }

    public void setfirstName(String firstName){
        this.firstName = firstName;
    }

    public String getlastName(){
        return lastName;
    }

    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public String getaddL1(){
        return addL1;
    }

    public void setaddL1(String addL1){
        this.addL1 = addL1;
    }
    public String getaddL2(){
        return addL2;
    }

    public void setaddL2(String addL2){
        this.addL2 = addL2;
    }
    public String getcity(){
        return city;
    }

    public void setcity(String city){
        this.city = city;
    }
    public String getcounty(){
        return county;
    }

    public void setcounty(String county){
        this.county = county;
    }
    public String getzipCode(){
        return zipCode;
    }

    public void setzipCode(String zipCode){
        this.zipCode = zipCode;
    }
    public String getcountry(){
        return country;
    }

    public void setcountry(String country){
        this.country = country;
    }
}