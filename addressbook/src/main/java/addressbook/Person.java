/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addressbook;

/**
 * @author Momin Arafa && Tamim Salhab
 */
public class Person extends AddressBook {

    private String firstName;
    private String lastName;
    private BirthDate personBirthDate;

    public Person(String firstName, String lastName, BirthDate personBirthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personBirthDate = personBirthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BirthDate getPersonBirthDate() {
        return personBirthDate;
    }

    public void setPersonBirthDate(BirthDate personBirthDate) {
        this.personBirthDate = personBirthDate;
    }

    public String getInfo() {
        return this.firstName + " " + this.lastName + " " + this.personBirthDate.getInfo();
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

}
