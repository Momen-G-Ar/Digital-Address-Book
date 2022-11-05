/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addressbook.addressbook;

/**
 * @author tamim
 */
public class BirthDate {
    private int month, day, year;

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public BirthDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public BirthDate() {
    }
    
}
