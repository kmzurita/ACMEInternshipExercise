/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.employeeController;
import controller.fileController;
import java.io.IOException;
import java.util.ArrayList;
import model.employeeSchedule;

/**
 *
 * @author zurit
 */
public class employeeView {

    public employeeView() {
    }

    public void showResults() throws IOException {
        fileController fC = new fileController();
        employeeController eC = new employeeController();
        ArrayList<employeeSchedule> employees = new ArrayList<employeeSchedule>();
        employees = fC.readFile();
        System.out.println(eC.totalComparison(employees));
    }
}
