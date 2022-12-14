/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.*;
import java.io.IOException;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 *
 * @author Momin Arafa && Tamim Salhab
 */
public class AddressBook implements Compare, Serializable {

    private static ArrayList<Contact> contacts = new ArrayList<>();

    public static ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void sort() {
        contacts.sort(new Comparator<Contact>() {
            @Override
            public int compare(Contact c1, Contact c2) {
                String s1, s2;
                if (c1 instanceof Business) {
                    s1 = ((Business) c1).getTitle();
                } else {
                    s1 = ((Person) c1).getLastName();
                }
                if (c2 instanceof Business) {
                    s2 = ((Business) c2).getTitle();
                } else {
                    s2 = ((Person) c2).getLastName();
                }
                return s1.compareToIgnoreCase(s2);
            }
        });
    }

    public String[] getAllContactsWithInfo() {
        String arr[] = new String[contacts.size()];
        int i = 0;
        for (Contact a : contacts) {
            arr[i++] = a.getInfo();
        }
        return arr;
    }

    public String[] getAllContacts() {
        String arr[] = new String[contacts.size()];
        int i = 0;
        for (Contact a : contacts) {
            arr[i++] = a.getFullName();
        }
        return arr;
    }

    public String[] getAllBusinesses() {
        String arr[] = new String[getNumOfBusinesses()];
        int i = 0;
        for (Contact a : contacts) {
            if (a instanceof Business) {
                arr[i++] = a.getFullName();
            }
        }
        return arr;
    }

    public String[] getAllPersons() {
        String arr[] = new String[getNumOfPersons()];
        int i = 0;
        for (Contact a : contacts) {
            if (a instanceof Person) {
                arr[i++] = a.getFullName();
            }
        }
        return arr;
    }

    public void add(Contact a) {
        if (a instanceof Person) {
            addPerson((Person) a);
        } else {
            addBusiness((Business) a);
        }
    }

    public void addBusiness(Business b) {
        contacts.add(b);
    }

    public void addPerson(Person p) {
        contacts.add(p);
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

    public void delete(int[] indices) {
        try {
            for (int index : indices) {
                contacts.remove(index);
            }
        } catch (Exception e) {
            // if there isn't any selected one so this may cause an exception and if it happen we didn't want to do anything
        }
    }

    @Override
    public String[] compareBy(String s) {
        ArrayList<String> res = new ArrayList<>();
        for (Contact a : contacts) {
            if (a instanceof Person) {
                Person p = (Person) a;
                boolean match = p.getFirstName().toLowerCase().contains(s.toLowerCase())
                        || p.getLastName().toLowerCase().contains(s.toLowerCase())
                        || s.equals("");

                if (match) {
                    res.add(a.getFullName());
                }
            } else {
                Business b = (Business) a;
                boolean match = b.getTitle().toLowerCase().contains(s.toLowerCase())
                        || s.equals("");
                if (match) {
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
