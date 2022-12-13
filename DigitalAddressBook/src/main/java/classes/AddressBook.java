/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.*;
import java.io.IOException;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import javax.swing.JOptionPane;

/**
 *
 * @author Momin Arafa && Tamim Salhab
 */
public class AddressBook implements Compare, Serializable {

    private static ArrayList<Contact> contacts = new ArrayList<>();

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

            @Override
            public Comparator<Contact> reversed() {
                return Comparator.super.reversed(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }

            @Override
            public Comparator<Contact> thenComparing(Comparator<? super Contact> other) {
                return Comparator.super.thenComparing(other); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }

            @Override
            public <U> Comparator<Contact> thenComparing(Function<? super Contact, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
                return Comparator.super.thenComparing(keyExtractor, keyComparator); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }

            @Override
            public <U extends Comparable<? super U>> Comparator<Contact> thenComparing(Function<? super Contact, ? extends U> keyExtractor) {
                return Comparator.super.thenComparing(keyExtractor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }

            @Override
            public Comparator<Contact> thenComparingInt(ToIntFunction<? super Contact> keyExtractor) {
                return Comparator.super.thenComparingInt(keyExtractor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }

            @Override
            public Comparator<Contact> thenComparingLong(ToLongFunction<? super Contact> keyExtractor) {
                return Comparator.super.thenComparingLong(keyExtractor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }

            @Override
            public Comparator<Contact> thenComparingDouble(ToDoubleFunction<? super Contact> keyExtractor) {
                return Comparator.super.thenComparingDouble(keyExtractor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }
        });
    }

    public int comparator(Contact c1, Contact c2) {
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

    public static ArrayList<Contact> getContacts() {
        return contacts;
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
