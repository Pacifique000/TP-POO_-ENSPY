package core;
import java.util.Date;

/**
 *
 * @author erwan
 */
public class Contact {
    String code;
    String nom;
    Date date_de_naissance;
    String address;
    String email;
    String telNumber;

    public Contact(String code, String nom, Date date_de_naissance, String address, String email, String telNumber) {
        this.code = code;
        this.nom = nom;
        this.date_de_naissance = date_de_naissance;
        this.address = address;
        this.email = email;
        this.telNumber = telNumber;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(Date date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

}
