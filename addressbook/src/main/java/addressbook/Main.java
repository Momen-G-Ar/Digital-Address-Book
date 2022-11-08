

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
