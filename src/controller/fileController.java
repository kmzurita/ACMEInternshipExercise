/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import model.EmployeeSchedule;
import model.Time;
import model.WorkingHours;

/**
 *
 * @author zurit
 */
public class FileController {

    public FileController() {
    }

    public ArrayList<EmployeeSchedule> readFile() throws FileNotFoundException, IOException {
        ArrayList<EmployeeSchedule> employees = new ArrayList<EmployeeSchedule>();
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        try {
            String line = br.readLine();
            while (line != null) {
                String[] eSVector = line.split("=");
                EmployeeSchedule eS = new EmployeeSchedule(eSVector[0], separateDays(eSVector[1].replaceAll("\\s", "")));
                employees.add(eS);
                line = br.readLine();
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("Archivo no encontrado");
        } finally {
            br.close();
        }
        return employees;
    }

    public ArrayList<WorkingHours> separateDays(String workingHours) {
        ArrayList<WorkingHours> wHArray = new ArrayList<WorkingHours>();
        String[] wHVector = workingHours.split(",");
        for (String i : wHVector) {
            Time checkIn = new Time();
            Time checkOut = new Time();
            try {
                checkIn.setHour(Integer.parseInt(i.substring(2, 4)));
                checkIn.setMinute(Integer.parseInt(i.substring(5, 7)));
                checkOut.setHour(Integer.parseInt(i.substring(8, 10)));
                checkOut.setMinute(Integer.parseInt(i.substring(11, 13)));

            } catch (NumberFormatException nfe) {
                System.out.println("Error en formato de numeros");
            }
            WorkingHours wH = new WorkingHours(i.substring(0, 2), checkIn, checkOut);
            wHArray.add(wH);
        }
        return wHArray;
    }
}
