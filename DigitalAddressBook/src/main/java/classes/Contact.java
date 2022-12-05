/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author Momen..G.Ar
 */
public class Contact {

    private static ArrayList<AddressBook> contact = new ArrayList<>();
    static int numberOfContacts = 0;

    public void addBusiness(Business b) {
        contact.add(b);
        numberOfContacts++;
    }

    public void addPerson(Person p) {
        contact.add(p);
        numberOfContacts++;
    }

    public void deleteBusiness() {
        
    }

}
