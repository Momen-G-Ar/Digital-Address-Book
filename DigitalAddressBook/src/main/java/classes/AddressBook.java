/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;

/**
 * @author Momin Arafa && Tamim Salhab
 */
public abstract class AddressBook {

    protected String country;
    protected String city;
    protected String postalCode;
    protected String email;
    protected ArrayList<String> telephoneNumbers;

    // Two constructors 
    // Accept evety thing and the telephone is array list 
    public AddressBook(String country, String city, String postalCode, String email, ArrayList<String> telephoneNumbers) {
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        this.email = email;
        this.telephoneNumbers = telephoneNumbers;
    }

    // Accept evety thing and the telephone is one number is integer 
    public AddressBook(String country, String city, String postalCode, String email, String TelephoneNumber) {
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        this.email = email;
        this.telephoneNumbers = new ArrayList<>();
        this.telephoneNumbers.add(TelephoneNumber);
    }

    public abstract String getCountry();

    
    public abstract ArrayList<String> getTelephoneNumbers();

    public abstract void setTelephoneNumbers(ArrayList<String> telephoneNumbers);

    public abstract void addTelephoneNumber(String number);

    public abstract void deleteTelephoneNumber(String number);

    public abstract void setCountry(String country);

    public abstract String getCity();

    public abstract void setCity(String city);

    public abstract String getPostalCode();

    public abstract void setPostalCode(String postalCode);

    public abstract String getEmail();

    public abstract void setEmail(String email);

    public abstract String getInfo();
}
