/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addressbook.addressbook;

/**
 *
 * @author Momen..G.Ar
 */
public class AdressBook {
    private String country;
    private String city;
    private String postalCode;
    private String email;

    public AdressBook(String country, String city, String postalCode, String email) {
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        this.email = email;
    }
    
    public String getCountry(){
        return this.country;
    }   
    public void setCountry(String country){
        this.country = country;
    }
    public String getCity(){
        return this.city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getPostalCode(){
        return this.postalCode;
    }

    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }   
    
}
