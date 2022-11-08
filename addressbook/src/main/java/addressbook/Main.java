/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package addressbook;

/**
 * @author Momin Arafa && Tamim Salhab
 */
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Momen", "Arafeh", new BirthDate(2 , 3 ,2022));
        System.out.println(p1.getInfo());
    }
}
