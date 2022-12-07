/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package main;

import classes.*;
import GUI.*;

/**
 * @author Momin Arafa && Tamim Salhab
 */
public class Main {

    public static void main(String[] args) {
        Person momen;
        momen = new Person("Momin", "Arafa", new BirthDate(25, 6, 2002),
                "Palestine", " Hebron", "9020000", "MominArafa@gmail.com", "0597456589");
        momen.addTelephoneNumber("0599676072");

        Contact contacts = new Contact();
        contacts.add(momen);
        contacts.add(new Business("Hello", "tektok", new Person("Momen", "Arafeh", new BirthDate(25, 6, 2002),
                "Palestine", " Hebron", "9020000", "MomenArafeh@gmail.com", "0597456589"), "momen@gmail.com", "Palestine", " Hebron", "9020000", "MominArafa@gmail.com", "0597456589"));
        contacts.add(new Business("Hello", "tektok", new Person("Momen", "Arafeh", new BirthDate(25, 6, 2002),
                "Palestine", " Hebron", "9020000", "MomenArafeh@gmail.com", "0597456589"), "momen@gmail.com", "Palestine", " Hebron", "9020000", "MominArafa@gmail.com", "0597456589"));

        for (String ss : contacts.compareBy("MominArafa@gmail.com")) {
            System.out.println(ss);
        }
        // Try to use the frame
        WelcomeFrame f = new WelcomeFrame();
        f.setVisible(true);
    }
}
