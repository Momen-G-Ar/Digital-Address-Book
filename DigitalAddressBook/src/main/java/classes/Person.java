/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

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
    public boolean equals(AddressBook a) {
        return a.getInfo().equals(this.getInfo());
    }

    @Override
    public String getInfo() {
        String ret = "Name : " + this.firstName + ' ' + this.lastName
                + "\nBirth Date : " + this.personBirthDate.getInfo()
                + "\nCountry : " + super.getCountry() + ", City " + super.getCity()
                + "\nEmail : " + super.getEmail()
                + "\nPostal Code : " + super.getPostalCode()
                + "\nTelephone numbers :\n";
        for (String number : super.getTelephoneNumbers()) {
            ret += number + "\n";
        }
        return ret;
    }

}
