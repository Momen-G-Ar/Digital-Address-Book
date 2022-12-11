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

    private String country;
    private String city;
    private String postalCode;
    private String email;
    private ArrayList<String> telephoneNumbers;

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

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addTelephoneNumber(String number) {
        this.telephoneNumbers.add(number);
    }

    public void deleteTelephoneNumber(String number) {
        this.telephoneNumbers.remove(this.telephoneNumbers.indexOf(number));
    }

    public ArrayList<String> getTelephoneNumbers() {
        return telephoneNumbers;
    }

    public void setTelephoneNumbers(ArrayList<String> telephoneNumbers) {
        this.telephoneNumbers = telephoneNumbers;
    }

    public abstract void display();

    public abstract String getInfo();

    public abstract String getFullName();

    public abstract boolean equals(AddressBook a);
}
