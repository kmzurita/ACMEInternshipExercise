/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controller;

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
public class FileControllerTest {

    public FileControllerTest() {
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
     * Test of readFile method, of class FileController.
     */
    @Test
    public void testReadFile() throws Exception {
        System.out.println("readFile");
        FileController instance = new FileController();
        ArrayList<EmployeeSchedule> expResult = new ArrayList<EmployeeSchedule>();
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
        expResult.add(eTest1);
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
        expResult.add(eTest2);
        EmployeeSchedule eTest3 = new EmployeeSchedule();
        eTest3.setEmployeeName("ANDRES");
        ArrayList<WorkingHours> whArray3 = new ArrayList<WorkingHours>();
        WorkingHours wh9 = new WorkingHours();
        wh9.setDay("MO");
        Time tCheckIn9 = new Time();
        Time tCheckOut9 = new Time();
        tCheckIn9.setHour(10);
        tCheckIn9.setMinute(0);
        tCheckOut9.setHour(12);
        tCheckOut9.setMinute(0);
        wh9.setCheckInTime(tCheckIn9);
        wh9.setCheckOutTime(tCheckOut9);
        whArray3.add(wh9);
        WorkingHours wh10 = new WorkingHours();
        wh10.setDay("TH");
        Time tCheckIn10 = new Time();
        Time tCheckOut10 = new Time();
        tCheckIn10.setHour(12);
        tCheckIn10.setMinute(0);
        tCheckOut10.setHour(14);
        tCheckOut10.setMinute(0);
        wh10.setCheckInTime(tCheckIn10);
        wh10.setCheckOutTime(tCheckOut10);
        whArray3.add(wh10);
        WorkingHours wh11 = new WorkingHours();
        wh11.setDay("SU");
        Time tCheckIn11 = new Time();
        Time tCheckOut11 = new Time();
        tCheckIn11.setHour(20);
        tCheckIn11.setMinute(0);
        tCheckOut11.setHour(21);
        tCheckOut11.setMinute(0);
        wh11.setCheckInTime(tCheckIn11);
        wh11.setCheckOutTime(tCheckOut11);
        whArray3.add(wh11);
        eTest3.setDaysWorked(whArray3);
        expResult.add(eTest3);
        EmployeeSchedule eTest4 = new EmployeeSchedule();
        eTest4.setEmployeeName("HENRY");
        ArrayList<WorkingHours> whArray4 = new ArrayList<WorkingHours>();
        WorkingHours wh12 = new WorkingHours();
        wh12.setDay("MO");
        Time tCheckIn12 = new Time();
        Time tCheckOut12 = new Time();
        tCheckIn12.setHour(10);
        tCheckIn12.setMinute(15);
        tCheckOut12.setHour(12);
        tCheckOut12.setMinute(0);
        wh12.setCheckInTime(tCheckIn12);
        wh12.setCheckOutTime(tCheckOut12);
        whArray4.add(wh12);
        WorkingHours wh13 = new WorkingHours();
        wh13.setDay("TU");
        Time tCheckIn13 = new Time();
        Time tCheckOut13 = new Time();
        tCheckIn13.setHour(10);
        tCheckIn13.setMinute(0);
        tCheckOut13.setHour(12);
        tCheckOut13.setMinute(0);
        wh13.setCheckInTime(tCheckIn13);
        wh13.setCheckOutTime(tCheckOut13);
        whArray4.add(wh13);
        WorkingHours wh14 = new WorkingHours();
        wh14.setDay("TH");
        Time tCheckIn14 = new Time();
        Time tCheckOut14 = new Time();
        tCheckIn14.setHour(13);
        tCheckIn14.setMinute(0);
        tCheckOut14.setHour(13);
        tCheckOut14.setMinute(15);
        wh14.setCheckInTime(tCheckIn14);
        wh14.setCheckOutTime(tCheckOut14);
        whArray4.add(wh14);
        WorkingHours wh15 = new WorkingHours();
        wh15.setDay("SA");
        Time tCheckIn15 = new Time();
        Time tCheckOut15 = new Time();
        tCheckIn15.setHour(14);
        tCheckIn15.setMinute(0);
        tCheckOut15.setHour(18);
        tCheckOut15.setMinute(0);
        wh15.setCheckInTime(tCheckIn15);
        wh15.setCheckOutTime(tCheckOut15);
        whArray4.add(wh15);
        WorkingHours wh16 = new WorkingHours();
        wh16.setDay("SU");
        Time tCheckIn16 = new Time();
        Time tCheckOut16 = new Time();
        tCheckIn16.setHour(20);
        tCheckIn16.setMinute(0);
        tCheckOut16.setHour(21);
        tCheckOut16.setMinute(0);
        wh16.setCheckInTime(tCheckIn16);
        wh16.setCheckOutTime(tCheckOut16);
        whArray4.add(wh16);
        eTest4.setDaysWorked(whArray4);
        expResult.add(eTest4);
        EmployeeSchedule eTest5 = new EmployeeSchedule();
        eTest5.setEmployeeName("ADRIANA");
        ArrayList<WorkingHours> whArray5 = new ArrayList<WorkingHours>();
        WorkingHours wh17 = new WorkingHours();
        wh17.setDay("MO");
        Time tCheckIn17 = new Time();
        Time tCheckOut17 = new Time();
        tCheckIn17.setHour(10);
        tCheckIn17.setMinute(0);
        tCheckOut17.setHour(12);
        tCheckOut17.setMinute(0);
        wh17.setCheckInTime(tCheckIn17);
        wh17.setCheckOutTime(tCheckOut17);
        whArray5.add(wh17);
        WorkingHours wh18 = new WorkingHours();
        wh18.setDay("TH");
        Time tCheckIn18 = new Time();
        Time tCheckOut18 = new Time();
        tCheckIn18.setHour(12);
        tCheckIn18.setMinute(0);
        tCheckOut18.setHour(14);
        tCheckOut18.setMinute(0);
        wh18.setCheckInTime(tCheckIn18);
        wh18.setCheckOutTime(tCheckOut18);
        whArray5.add(wh18);
        WorkingHours wh19 = new WorkingHours();
        wh19.setDay("SU");
        Time tCheckIn19 = new Time();
        Time tCheckOut19 = new Time();
        tCheckIn19.setHour(20);
        tCheckIn19.setMinute(0);
        tCheckOut19.setHour(21);
        tCheckOut19.setMinute(0);
        wh19.setCheckInTime(tCheckIn19);
        wh19.setCheckOutTime(tCheckOut19);
        whArray5.add(wh19);
        eTest5.setDaysWorked(whArray5);
        expResult.add(eTest5);
        ArrayList<EmployeeSchedule> result = instance.readFile();
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of separateDays method, of class FileController.
     */
    @Test
    public void testSeparateDays() {
        System.out.println("separateDays");
        String workingHours = "MO10:00-12:00,TU10:00-12:00,TH01:00-03:00,SA14:00-18:00,SU20:00-21:00";
        FileController instance = new FileController();
        ArrayList<WorkingHours> expResult = new ArrayList<WorkingHours>();
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
        expResult.add(wh1);
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
        expResult.add(wh2);
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
        expResult.add(wh3);
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
        expResult.add(wh4);
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
        expResult.add(wh5);
        ArrayList<WorkingHours> result = instance.separateDays(workingHours);
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
    }

}
