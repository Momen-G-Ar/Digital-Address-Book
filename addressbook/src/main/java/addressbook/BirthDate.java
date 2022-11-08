/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addressbook;

import java.util.Date;

/**
 * @author tamim
 */
public class BirthDate {

    private int day, month, year;

    // Constructors
    public BirthDate(BirthDate b) {
        this.day = b.getDay();
        this.month = b.getMonth();
        this.year = b.getYear();
    }

    public BirthDate(int day, int month, int year) {
        if (valid(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("The date isn't valid :( ");
        }
    }

    // Setters and getters 
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (validDay(day)) {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (validMonth(month)) {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (validYear(year)) {
            this.year = year;
        }
    }

    // check if the date is valid between  1850 and 2022 and check if the year is a (365 day => once in each four years)
    private boolean validYear(int year) {
        return (year >= 1850 && year <= 2022);

    }

    private boolean validMonth(int m) {
        return (m >= 1 || m <= 12);
    }

    private boolean validDay(int d) {
        int m = this.month;
        boolean ok = true;
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            ok &= (d >= 1 && d <= 31);
        }
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            ok &= (d >= 1 && d <= 30);
        }
        return ok;
    }

    // To check if the day, month, and year is valid
    private boolean valid(int d, int m, int y) {
        boolean ok = true;

        ok = (m >= 1 || m <= 12);
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            ok &= (d >= 1 && d <= 31);
        }
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            ok &= (d >= 1 && d <= 30);
        }
        if (m == 2) {
            ok &= ((y % 4 == 0) ? (d >= 1 && d <= 29) : (d >= 1 && d <= 28));
        }

        ok &= (y >= 1850 && y <= 2022);

        return ok;
    }

    // To change the Date
    public void setDate(int day, int month, int year) {
        if (valid(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("The date isn't valid :( ");
        }
    }

    public void setDate(BirthDate b) {
        this.day = b.getDay();
        this.month = getMonth();
        this.year = getYear();
    }

    // To get the age from the date
    public String getAge() {
        Date date = new Date();
        int curDay = date.getDate(), curMonth = date.getMonth() + 1, curYear = date.getYear() + 1900;

        int d, m, y;
        if (curDay < this.day) {
            d = curDay + 30 - this.day;
            curMonth--;
        } else {
            d = curDay - this.day;
        }

        if (curMonth < this.month) {
            m = curMonth + 12 - this.month;
            curYear--;
        } else {
            m = curMonth - this.month;
        }
        y = curYear - this.year;

        return y + " year" + (y > 1 ? "s " : " ") + m + " month" + (m > 1 ? "s " : " ") + d + " day" + (d > 1 ? "s " : " ");
    }

    // get information of the birth date
    public String getInfo() {
        return "Day = " + this.day + " Month " + this.month + " Year " + this.year;
    }

}
