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
 * @author Momin Arafa && Tamim Salhab
 */
public class AddressBook implements Compare, Serializable {

    private static ArrayList<Contact> contacts = new ArrayList<>();

    public void add(Contact a) {
        if (a instanceof Person) {
            addPerson((Person) a);
        } else {
            addBusiness((Business) a);
        }
    }

    public String[] getAllContacts() {
        String s[] = new String[contacts.size()];
        for (int i = 0; i < contacts.size(); i++) {
            s[i] = contacts.get(i).getInfo();
        }
        return s;
    }

    public void addBusiness(Business b) {
        contacts.add(b);
    }

    public int getNumOfBusinesses() {
        int numOfBusinesses = 0;
        for (Contact a : contacts) {
            if (a instanceof Business) {
                numOfBusinesses++;
            }
        }
        return numOfBusinesses;
    }

    public int getNumOfPersons() {
        int numOfPersons = 0;
        for (Contact a : contacts) {
            if (a instanceof Person) {
                numOfPersons++;
            }
        }
        return numOfPersons;
    }

    public void addPerson(String firstName, String lastName, BirthDate bd, String country, String city, String postalCode, String email, String telephoneNumber) {
        Person p = new Person(firstName, lastName, bd, country, city, postalCode, email, telephoneNumber);
        contacts.add(p);
    }

    public void addPerson(Person p) {
        contacts.add(p);
    }

    public void delete(int[] indices) {
        try {
            for (int index : indices) {
                contacts.remove(index);
            }
        } catch (Exception e) {
            // if there isn't any selected one so this may cause an exception and if it happen we didn't want to do anything
        }
    }

    public static ArrayList<Contact> getContact() {
        return contacts;
    }

    @Override
    public String[] compareBy(String s) {
        ArrayList<String> res = new ArrayList<>();
        for (Contact a : contacts) {
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
            Common.SerializationUtil.serialize((ArrayList<Contact>) contacts, "src\\main\\java\\data\\data.txt");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "serialize");
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void readDataFromFile() {
        try {
            contacts = (ArrayList<Contact>) Common.SerializationUtil.deserialize("src\\main\\java\\data\\data.txt");
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "deserialize");
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
