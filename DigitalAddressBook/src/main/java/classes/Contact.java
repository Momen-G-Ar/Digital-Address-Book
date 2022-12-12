/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.*;

import java.util.ArrayList;

/**
 *
 * @author Momen..G.Ar
 */
public class Contact implements Compare {

    private static ArrayList<AddressBook> contact = new ArrayList<>();
    static int numberOfContacts = 0;
    static int numOfBusinesses = 0, numOfPersons = 0;
    
    public void add(AddressBook a) {
        if (a instanceof Person) {
            this.addPerson((Person) a);
            numOfPersons++;
        } else {
            this.addBusiness((Business) a);
            numOfBusinesses++;
        }
    }

    public void addBusiness(Business b) {
        contact.add(b);
        numberOfContacts++;
        numOfBusinesses++;
    }
    public static void addBusiness(String title0, String genre0, String webSite0, Person p, String country, String city, String postalCode, String email, String tele ){
        Business newBusiness = new Business(title0, genre0, p, webSite0, country, city, postalCode, email, tele);
        contact.add(newBusiness);
        numOfBusinesses++;
    }
    public static void addTelephoneNumber(int ind, String tele){
        
    }
    public static int getNumOfBusinesses() {
        return numOfBusinesses;
    }

    public static int getNumOfPersons() {
        return numOfPersons;
    }

    public static void addPerson(String firstName, String lastName, BirthDate bd, String country, String city, String postalCode, String email, String telephoneNumber) {
        
        Person p = new Person(firstName, lastName, bd, country,city, postalCode, email, telephoneNumber);
        contact.add(p);
        numberOfContacts++;
        numOfPersons++;
    }
    public void addPerson(Person p){
       contact.add(p);
       numberOfContacts++; 
       numOfPersons++;
    }

    public void delete(int [] indices) {
        try{
            for(int index: indices)
            {
                contact.remove(index);
            }
        }catch(Exception e){
            // if there isn't any selected one so this may cause an exception and if it happen we didn't want to do anything
        }
    }

//    public void deleteBusiness(Business b) {
//        int indexToDelete = -1;
//        for (int i = 0; i < contact.size(); ++i) {
//            if (contact.get(i).equals(b)) {
//                indexToDelete = i;
//                break;
//            }
//        }
//        if (indexToDelete != -1) {
//            contact.remove(indexToDelete);
//            numberOfContacts--;
//        }
//    }
//
//    public void deletePerson(Person b) {
//        int indexToDelete = -1;
//        for (int i = 0; i < contact.size(); ++i) {
//            if (contact.get(i).equals(b)) {
//                indexToDelete = i;
//                break;
//            }
//        }
//        if (indexToDelete != -1) {
//            contact.remove(indexToDelete);
//            numberOfContacts--;
//        }
//    }
    

    public static ArrayList<AddressBook> getContact() {
        return contact;
    }

    @Override
    public String[] compareBy(String s) {
        ArrayList<String> res = new ArrayList<>();
        for (AddressBook a : contact) {
            if (a instanceof Person) {
                Person p = (Person) a;
                if (p.getFirstName().contains(s) || p.getLastName().contains(s)) {
                    res.add(a.getInfo());
                }
            } else {
                Business b = (Business) a;
                if (b.getTitle().contains(s)) {
                    res.add(a.getInfo());
                }
            }
        }
        String[] ans = new String[res.size()];
        for (int i = 0; i < res.size(); ++i) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}
