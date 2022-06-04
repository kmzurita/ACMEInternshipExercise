/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zurit
 */
public class time {

    private int hour;
    private int minute;

    public time() {
    }

    public time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public boolean validateTime() {
        return ((this.hour >= 0 && this.hour <= 23) && (this.minute >= 0 && this.minute <= 59));
    }

    @Override
    public String toString() {
        return hour + ":" + minute;
    }

}
