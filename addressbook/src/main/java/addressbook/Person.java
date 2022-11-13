/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addressbook;

import java.util.ArrayList;

/**
 * @author Momin Arafa && Tamim Salhab
 */
public class Person extends AddressBook {

    private String firstName;
    private String lastName;
    private BirthDate personBirthDate;

    public Person(String firstName, String lastName, BirthDate personBirthDate, String country, String city, String postalCode, String email, ArrayList<String> telephoneNumbers) {
        super(country, city, postalCode, email, telephoneNumbers);
        this.firstName = firstName;
        this.lastName = lastName;
        this.personBirthDate = personBirthDate;
    }

    public Person(String firstName, String lastName, BirthDate personBirthDate, String country, String city, String postalCode, String email, String TelephoneNumber) {
        super(country, city, postalCode, email, TelephoneNumber);
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
        String ret = "Name : " + this.firstName + ' ' + this.lastName
                + "\nBirth Date : " + this.personBirthDate.getInfo()
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
