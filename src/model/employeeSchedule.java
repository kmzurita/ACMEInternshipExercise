/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author zurit
 */
public class employeeSchedule {

    private String employeeName;
    private ArrayList<workingHours> daysWorked;

    public employeeSchedule() {
        this.daysWorked = new ArrayList<workingHours>();
    }

    public employeeSchedule(String employeeName, ArrayList<workingHours> daysWorked) {
        this.employeeName = employeeName;
        this.daysWorked = daysWorked;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public ArrayList<workingHours> getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(ArrayList<workingHours> daysWorked) {
        this.daysWorked = daysWorked;
    }

    @Override
    public String toString() {
        String result = "";
        for (workingHours i : this.daysWorked) {
            result += i.toString() + " ";
        }
        return employeeName + "=" + result;
    }

}
