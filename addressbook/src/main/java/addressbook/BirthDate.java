/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addressbook;

/**
 * @author tamim
 */
public class BirthDate {

    private int day, month, year;

    public BirthDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public BirthDate(BirthDate b)
    {
        this.day = b.getDay();
        this.month = b.getMonth();
        this.year = b.getYear();
    }
    

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
    public String getInfo()       
    {
        return "Day = " + this.day + " Month " + this.month + " Year " + this.year;
    }
    
}
