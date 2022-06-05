/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controller;

import java.io.IOException;
import java.util.ArrayList;
import model.EmployeeSchedule;
import model.Time;
import model.WorkingHours;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zurit
 */
public class EmployeeControllerTest {

    public EmployeeControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of totalComparison method, of class EmployeeController.
     */
    @Test
    public void testTotalComparison() throws IOException {
        FileController fC = new FileController();
        System.out.println("totalComparison");
        ArrayList<EmployeeSchedule> employees = fC.readFile();
        EmployeeController instance = new EmployeeController();
        String expResult = "RENE-ASTRID: 2\n"
                + "RENE-ANDRES: 2\n"
                + "RENE-HENRY: 4\n"
                + "RENE-ADRIANA: 2\n"
                + "ASTRID-ANDRES: 3\n"
                + "ASTRID-HENRY: 3\n"
                + "ASTRID-ADRIANA: 3\n"
                + "ANDRES-HENRY: 3\n"
                + "ANDRES-ADRIANA: 3\n"
                + "HENRY-ADRIANA: 3\n";
        String result = instance.totalComparison(employees);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of employeesComparison method, of class EmployeeController.
     */
    @Test
    public void testEmployeesComparison() {
        System.out.println("employeesComparison");
        EmployeeSchedule eTest1 = new EmployeeSchedule();
        eTest1.setEmployeeName("RENE");
        ArrayList<WorkingHours> whArray1 = new ArrayList<WorkingHours>();
        WorkingHours wh1 = new WorkingHours();
        wh1.setDay("MO");
        Time tCheckIn1 = new Time();
        Time tCheckOut1 = new Time();
        tCheckIn1.setHour(10);
        tCheckIn1.setMinute(0);
        tCheckOut1.setHour(12);
        tCheckOut1.setMinute(0);
        wh1.setCheckInTime(tCheckIn1);
        wh1.setCheckOutTime(tCheckOut1);
        whArray1.add(wh1);
        WorkingHours wh2 = new WorkingHours();
        wh2.setDay("TU");
        Time tCheckIn2 = new Time();
        Time tCheckOut2 = new Time();
        tCheckIn2.setHour(10);
        tCheckIn2.setMinute(0);
        tCheckOut2.setHour(12);
        tCheckOut2.setMinute(0);
        wh2.setCheckInTime(tCheckIn2);
        wh2.setCheckOutTime(tCheckOut2);
        whArray1.add(wh2);
        WorkingHours wh3 = new WorkingHours();
        wh3.setDay("TH");
        Time tCheckIn3 = new Time();
        Time tCheckOut3 = new Time();
        tCheckIn3.setHour(1);
        tCheckIn3.setMinute(0);
        tCheckOut3.setHour(3);
        tCheckOut3.setMinute(0);
        wh3.setCheckInTime(tCheckIn3);
        wh3.setCheckOutTime(tCheckOut3);
        whArray1.add(wh3);
        WorkingHours wh4 = new WorkingHours();
        wh4.setDay("SA");
        Time tCheckIn4 = new Time();
        Time tCheckOut4 = new Time();
        tCheckIn4.setHour(14);
        tCheckIn4.setMinute(0);
        tCheckOut4.setHour(18);
        tCheckOut4.setMinute(0);
        wh4.setCheckInTime(tCheckIn4);
        wh4.setCheckOutTime(tCheckOut4);
        whArray1.add(wh4);
        WorkingHours wh5 = new WorkingHours();
        wh5.setDay("SU");
        Time tCheckIn5 = new Time();
        Time tCheckOut5 = new Time();
        tCheckIn5.setHour(20);
        tCheckIn5.setMinute(0);
        tCheckOut5.setHour(21);
        tCheckOut5.setMinute(0);
        wh5.setCheckInTime(tCheckIn5);
        wh5.setCheckOutTime(tCheckOut5);
        whArray1.add(wh5);
        eTest1.setDaysWorked(whArray1);
        EmployeeSchedule eTest2 = new EmployeeSchedule();
        eTest2.setEmployeeName("ASTRID");
        ArrayList<WorkingHours> whArray2 = new ArrayList<WorkingHours>();
        WorkingHours wh6 = new WorkingHours();
        wh6.setDay("MO");
        Time tCheckIn6 = new Time();
        Time tCheckOut6 = new Time();
        tCheckIn6.setHour(10);
        tCheckIn6.setMinute(0);
        tCheckOut6.setHour(12);
        tCheckOut6.setMinute(0);
        wh6.setCheckInTime(tCheckIn6);
        wh6.setCheckOutTime(tCheckOut6);
        whArray2.add(wh6);
        WorkingHours wh7 = new WorkingHours();
        wh7.setDay("TH");
        Time tCheckIn7 = new Time();
        Time tCheckOut7 = new Time();
        tCheckIn7.setHour(12);
        tCheckIn7.setMinute(0);
        tCheckOut7.setHour(14);
        tCheckOut7.setMinute(0);
        wh7.setCheckInTime(tCheckIn7);
        wh7.setCheckOutTime(tCheckOut7);
        whArray2.add(wh7);
        WorkingHours wh8 = new WorkingHours();
        wh8.setDay("SU");
        Time tCheckIn8 = new Time();
        Time tCheckOut8 = new Time();
        tCheckIn8.setHour(20);
        tCheckIn8.setMinute(0);
        tCheckOut8.setHour(21);
        tCheckOut8.setMinute(0);
        wh8.setCheckInTime(tCheckIn8);
        wh8.setCheckOutTime(tCheckOut8);
        whArray2.add(wh8);
        eTest2.setDaysWorked(whArray2);
        EmployeeController instance = new EmployeeController();
        int expResult = 2;
        int result = instance.employeesComparison(eTest1, eTest2);
        assertEquals(expResult, result);
    }

}
