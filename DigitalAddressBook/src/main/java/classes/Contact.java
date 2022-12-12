/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.*;
import java.io.IOException;
import java.io.Serializable;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Momen..G.Ar
 */
public class Contact implements Compare, Serializable {

    private static ArrayList<AddressBook> contact = new ArrayList<>();
    static int numOfBusinesses = 0, numOfPersons = 0;

    public void add(AddressBook a) {
        if (a instanceof Person) {
            addPerson((Person) a);
        } else {
            addBusiness((Business) a);
        }
    }

    public String[] getAllContacts() {
        String s[] = new String[contact.size()];
        for (int i = 0; i < contact.size(); i++) {
            s[i] = contact.get(i).getInfo();
        }
        return s;
    }

    public void addBusiness(Business b) {
        contact.add(b);
        numOfBusinesses++;
    }

    public int getNumOfBusinesses() {
        return numOfBusinesses;
    }

    public int getNumOfPersons() {
        return numOfPersons;
    }

    public void addPerson(String firstName, String lastName, BirthDate bd, String country, String city, String postalCode, String email, String telephoneNumber) {
        Person p = new Person(firstName, lastName, bd, country, city, postalCode, email, telephoneNumber);
        contact.add(p);
        numOfPersons++;
    }

    public void addPerson(Person p) {
        contact.add(p);
        numOfPersons++;
    }

    public void delete(int[] indices) {
        try {
            for (int index : indices) {
                contact.remove(index);
            }
        } catch (Exception e) {
            // if there isn't any selected one so this may cause an exception and if it happen we didn't want to do anything
        }
    }

    public static ArrayList<AddressBook> getContact() {
        return contact;
    }

    @Override
    public String[] compareBy(String s) {
        ArrayList<String> res = new ArrayList<>();
        for (AddressBook a : contact) {
            if (a instanceof Person) {
                Person p = (Person) a;
                if (p.getFirstName().contains(s) || p.getLastName().contains(s) || s.equals("")) {
                    res.add(a.getFullName());
                }
            } else {
                Business b = (Business) a;
                if (b.getTitle().contains(s) || s.equals("")) {
                    res.add(b.getTitle());
                }
            }
        }
        String[] ans = new String[res.size()];
        for (int i = 0; i < res.size(); ++i) {
            ans[i] = res.get(i);
        }
        return ans;
    }

    public void writeDataToFile() {
        try {
            Common.SerializationUtil.serialize(contact, "src\\main\\java\\data\\data.txt");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void readDataFromFile() {
        try {
            contact = (ArrayList<AddressBook>) Common.SerializationUtil.deserialize("src\\main\\java\\data\\data.txt");
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
