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
import model.employeeSchedule;
import model.time;
import model.workingHours;

/**
 *
 * @author zurit
 */
public class fileController {

    public fileController() {
    }

    public ArrayList<employeeSchedule> readFile() throws FileNotFoundException, IOException {
        ArrayList<employeeSchedule> employees = new ArrayList<employeeSchedule>();
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        try {
            String line = br.readLine();
            while (line != null) {
                String[] eSVector = line.split("=");
                employeeSchedule eS = new employeeSchedule(eSVector[0], separateDays(eSVector[1].replaceAll("\\s", "")));
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

    public ArrayList<workingHours> separateDays(String workingHours) {
        ArrayList<workingHours> wHArray = new ArrayList<workingHours>();
        String[] wHVector = workingHours.split(",");
        for (String i : wHVector) {
            time checkIn = new time();
            time checkOut = new time();
            try {
                checkIn.setHour(Integer.parseInt(i.substring(2, 4)));
                checkIn.setMinute(Integer.parseInt(i.substring(5, 7)));
                checkOut.setHour(Integer.parseInt(i.substring(8, 10)));
                checkOut.setMinute(Integer.parseInt(i.substring(11, 13)));

            } catch (NumberFormatException nfe) {
                System.out.println("Error en formato de numeros");
            }
            workingHours wH = new workingHours(i.substring(0, 2), checkIn, checkOut);
            wHArray.add(wH);
        }
        return wHArray;
    }
}
