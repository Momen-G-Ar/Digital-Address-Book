/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;

/**
 * @author Momin Arafa && Tamim Salhab
 */
public class Business extends Contact {

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
    public boolean equals(Contact a) {
        return a.getInfo().equals(this.getInfo());
    }

    @Override
    public String getInfo() {
        String ret = "Contact Person Information : \n" + this.contactPerson.getInfo()
                + "Work Information : \n"
                + "Title : " + this.title
                + "\nGenre : " + this.genre
                + "\nCountry : " + super.getCountry() + ", City " + super.getCity()
                + "\nEmail : " + super.getEmail()
                + "\nWebsite : " + this.webSite
                + "\nPostal Code : " + super.getPostalCode()
                + "\nTelephone numbers :\n";
        for (String number : super.getTelephoneNumbers()) {
            ret += number + "\n";
        }
        return ret;
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public String getFullName() {
        return getTitle();
    }

}
