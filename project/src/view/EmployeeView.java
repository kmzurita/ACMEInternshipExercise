/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.EmployeeController;
import controller.FileController;
import java.io.IOException;
import java.util.ArrayList;
import model.EmployeeSchedule;

/**
 *
 * @author zurit
 */
public class EmployeeView {

    public EmployeeView() {
    }

    public void showResults() throws IOException {
        FileController fC = new FileController();
        EmployeeController eC = new EmployeeController();
        ArrayList<EmployeeSchedule> employees = new ArrayList<EmployeeSchedule>();
        employees = fC.readFile();
        System.out.println(eC.totalComparison(employees));
    }
}
