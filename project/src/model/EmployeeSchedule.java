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
public class EmployeeSchedule {

    private String employeeName;
    private ArrayList<WorkingHours> daysWorked;

    public EmployeeSchedule() {
        this.daysWorked = new ArrayList<WorkingHours>();
    }

    public EmployeeSchedule(String employeeName, ArrayList<WorkingHours> daysWorked) {
        this.employeeName = employeeName;
        this.daysWorked = daysWorked;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public ArrayList<WorkingHours> getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(ArrayList<WorkingHours> daysWorked) {
        this.daysWorked = daysWorked;
    }

    @Override
    public String toString() {
        String result = "";
        for (WorkingHours i : this.daysWorked) {
            result += i.toString() + " ";
        }
        return employeeName + "=" + result;
    }

}
