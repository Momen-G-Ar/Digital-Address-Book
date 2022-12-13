/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package main;

import classes.*;
import GUI.*;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * @author Momin Arafa && Tamim Salhab
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Contact c = new Contact();
        c.add(new Person("Momen", "Arafeh", new BirthDate(25, 6, 2002), "Palestine", "Hebron", "s234", "mosamf", "23456"));
        c.add(new Person("Momen", "Arafeh", new BirthDate(25, 6, 2002), "Palestine", "Hebron", "s234", "mosamf", "23456"));
        c.add(new Person("Momen", "Arafeh", new BirthDate(25, 6, 2002), "Palestine", "Hebron", "s234", "mosamf", "23456"));
        c.add(new Person("Momen", "Arafeh", new BirthDate(25, 6, 2002), "Palestine", "Hebron", "s234", "mosamf", "23456"));

//        try {
//            Common.SerializationUtil.serialize(c, "src\\main\\java\\data\\data.txt");
//        } catch (IOException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//        Contact c2;
//        try {
//            c2 = (Contact) Common.SerializationUtil.deserialize("src\\main\\java\\data\\data.txt");
//            JOptionPane.showMessageDialog(null, c2.getAllContacts());
//        } catch (IOException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        } catch (ClassNotFoundException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
        MainFrame f = new MainFrame();
        f.setVisible(true);
    }
}
