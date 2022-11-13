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
        Person momen;
        momen = new Person("Momin", "Arafa", new BirthDate(25, 6, 2002),
                "Palestine", " Hebron", "05666", "MominArafa@gmail.com", "0597456589");
        System.out.println(momen.getInfo());
    }
}
