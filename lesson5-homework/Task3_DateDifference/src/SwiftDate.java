/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stanislav
 */
public class SwiftDate {

    private int year;
    int month;
    int day;

    public SwiftDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    void setYear(int year) {
        if (0 <= year && year <= 9999) {
            this.year = year;
        } else {
            System.out.println("sorry pich");;
        }
    }

    boolean isLeapYear() {

        if (year % 400 == 0) {
            return true;
        }

        if (year % 4 != 0 && year % 100 != 0) {
            return true;
        }
        return false;

    }

    int getCentury() {
        int result = this.year / 100 + 1;
        return result;

    }

    int getDaysDifference(SwiftDate other) {
        int x = this.getDaysFromBeginningOfTime();
        int y = other.getDaysFromBeginningOfTime();

        if (x < y) {
            return y - x + 1;
        } else {
            return x - y + 1;
        }

    }

    private int getDaysFromBeginningOfTime() {
        int x = (year-1) * 365 + (year-1) / 4 - (year-1) / 100 + (year-1) / 400;

        switch (month - 1) {

            case 11:
                x += 30;
            case 10:
                x += 30;
            case 9:
                x += 30;
            case 8:
                x += 31;
            case 7:
                x += 31;
            case 6:
                x += 30;
            case 5:
                x += 31;
            case 4:
                x += 30;
            case 3:
                x += 31;
            case 2:
                x += 28;
                if (isLeapYear()) {
                    x += 1;
                }
            case 1:
                x += 31;

        }
        x += day;
        return x;
    }

    String getInfo() {
        String result = String.format(
                "%d %d %d - %d century.", this.year, this.month, this.day, this.getCentury());

        if (this.isLeapYear()) {
            result += " It is a LEAP year. ";
        }
        return result;
    }

}
