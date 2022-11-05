/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addressbook.addressbook;

/**
 *
 * @author tamim
 */
public class Person  {
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
    public String getInfo()
    {
        return this.firstName + " " + this.lastName + " " + this.personBirthDate.getInfo();
    }
    
}
