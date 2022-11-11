/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addressbook;

import java.util.ArrayList;

/**
 * @author Momin Arafa && Tamim Salhab
 */
public class Business extends AddressBook {

    private String title;
    private String genre;
    private Person contactPerson;
    private String webSite;

    public Business(String title, String genre, Person contactPerson, String webSite, String country, String city, String postalCode, String email, ArrayList<String> telephoneNumbers) {
        super(country, city, postalCode, email, telephoneNumbers);
        this.title = title;
        this.genre = genre;
        this.contactPerson = contactPerson;
        this.webSite = webSite;
    }

    public Business(String title, String genre, Person contactPerson, String webSite, String country, String city, String postalCode, String email, String TelephoneNumber) {
        super(country, city, postalCode, email, TelephoneNumber);
        this.title = title;
        this.genre = genre;
        this.contactPerson = contactPerson;
        this.webSite = webSite;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Person getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(Person contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    @Override
    public String getCountry() {
        return this.country;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String getCity() {
        return this.city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getPostalCode() {
        return this.postalCode;
    }

    @Override
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void addTelephoneNumber(String number) {
        this.telephoneNumbers.add(number);
    }

    @Override
    public void deleteTelephoneNumber(String number) {
        this.telephoneNumbers.remove(this.telephoneNumbers.indexOf(number));
    }

    @Override
    public ArrayList<String> getTelephoneNumbers() {
        return telephoneNumbers;
    }

    @Override
    public void setTelephoneNumbers(ArrayList<String> telephoneNumbers) {
        this.telephoneNumbers = telephoneNumbers;
    }

    @Override
    public String getInfo() {
        String ret = "Contact Person Information : \n" + this.contactPerson.getInfo()
                + "Work Information : \n"
                + "Title : " + this.title
                + "\nGenre : " + this.genre
                + "\nCountry : " + this.country + ", City " + this.city
                + "\nEmail : " + this.email
                + "\nPostal Code : " + this.postalCode
                + "\nTelephone numbers :\n";
        for (String number : this.telephoneNumbers) {
            ret += number + "\n";
        }
        return ret;
    }

}
