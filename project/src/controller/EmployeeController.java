/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.EmployeeSchedule;
import model.WorkingHours;

/**
 *
 * @author zurit
 */
public class EmployeeController {

    public EmployeeController() {

    }

    public String totalComparison(ArrayList<EmployeeSchedule> employees) {
        String comparisonResult = "";
        for (int i = 0; i < employees.size() - 1; i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                int count = employeesComparison(employees.get(i), employees.get(j));
                comparisonResult += employees.get(i).getEmployeeName() + "-" + employees.get(j).getEmployeeName() + ": " + count;
                comparisonResult += "\n";
            }
        }
        return comparisonResult;
    }

    public int employeesComparison(EmployeeSchedule eS1, EmployeeSchedule eS2) {
        int count = 0;
        for (WorkingHours i : eS1.getDaysWorked()) {
            for (WorkingHours j : eS2.getDaysWorked()) {
                if (i.getDay().equals(j.getDay())) {
                    if (i.getCheckInTime().getHour() >= j.getCheckInTime().getHour() && i.getCheckInTime().getHour() <= j.getCheckOutTime().getHour()) {
                        count += 1;
                    } else if (j.getCheckInTime().getHour() >= i.getCheckInTime().getHour() && j.getCheckInTime().getHour() <= i.getCheckOutTime().getHour()) {
                        count += 1;
                    } else if (i.getCheckInTime().getHour() == j.getCheckOutTime().getHour() || j.getCheckInTime().getHour() == i.getCheckOutTime().getHour()) {
                        if (i.getCheckInTime().getMinute() <= j.getCheckOutTime().getMinute()) {
                            count += 1;
                        } else if (j.getCheckInTime().getMinute() <= i.getCheckOutTime().getMinute()) {
                            count += 1;
                        }
                    }
                }
            }

        }
        return count;
    }

}
