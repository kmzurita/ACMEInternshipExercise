/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zurit
 */
public class WorkingHours {

    private String day;
    private Time checkInTime;
    private Time checkOutTime;

    public WorkingHours() {
    }

    public WorkingHours(String day, Time checkInTime, Time checkOutTime) {
        this.day = day;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Time getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Time checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Time getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(Time checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public boolean validateDay() {
        return (this.day.equals("mo") || this.day.equals("tu") || this.day.equals("we") || this.day.equals("th") || this.day.equals("fr") || this.day.equals("sa") || this.day.equals("su"));
    }

    @Override
    public String toString() {
        return day + ": " + checkInTime.toString() + "-" + checkOutTime.toString();
    }

}
