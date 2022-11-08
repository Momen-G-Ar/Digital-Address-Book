/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addressbook;

/**
 * @author Momin Arafa && Tamim Salhab
 */
public abstract class AddressBook {

    protected String country;
    protected String city;
    protected String postalCode;
    protected String email;

    public abstract String getCountry();

    public abstract void setCountry(String country);

    public abstract String getCity();

    public abstract void setCity(String city);

    public abstract String getPostalCode();

    public abstract void setPostalCode(String postalCode);

    public abstract String getEmail();

    public abstract void setEmail(String email);

}
