/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addressbook.addressbook;

/**
 * @author Momen..G.Ar
 */
public class Business extends AdressBook{
    private String title;
    private String genre;
    private String contactPerson;
    private String webSite;

    public Business(String title, String genre, String contactPerson, String webSite, String country, String city, String postalCode, String email) {
        super(country, city, postalCode, email);
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

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
}
