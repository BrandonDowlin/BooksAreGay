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

public class ProcessPay extends Model {
    @Id
    private String email;

    @Constraints.Required
    private String cardholderName;

    @Constraints.Required
    private String cardNo;

    @Constraints.Required
    private String date;

    @Constraints.Required
    private String cCVNum;

    @Constraints.Required
    private String cardType;


    // Constructor to initialise object
    public  ProcessPay(String email, String cardholderName, String cardNo, String date, String cCVNum, String cardType) {
        this.email = email;
        this.cardholderName= cardholderName;
        this.cardNo=cardNo;
        this.date = date;
        this.cCVNum = cCVNum;
        this.cardType=cardType;
    }

    public String getemail(){
        return email;
    }
    public void setemail(String email){
        this.email = email;
    }

    public String getcardNo(){
        return cardNo;
    }

    public void setcardNo(String cardNo){
        this.cardNo = cardNo;
    }

    public String getcardholderName(){
        return cardholderName;
    }

    public void setcardholderName(String cardholderName){
        this.cardholderName = cardholderName;
    }

    public String getdate(){
        return date;
    }

    public void setdate(String date){
        this.date = date;
    }
    public String getcCVNum(){
        return cCVNum;
    }

    public void setcCVNum(String cCVNum){
        this.cCVNum = cCVNum;
    }
    public String getcardType(){
        return cardType;
    }

    public void setcardType(String cardType){
        this.cardType = cardType;
    }
  
}