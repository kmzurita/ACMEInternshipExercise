## **IOET Internship Exercise**
---
### **Exercise**
---
The company ACME offers their employees the flexibility to work the hours they want. But due to some external circumstances they need to know what employees have been at the office within the same time frame

The goal of this exercise is to output a table containing pairs of employees and how often they have coincided in the office.

Input: the name of an employee and the schedule they worked, indicating the time and hours. This should be a .txt file with at least five sets of data. You can include the data from our examples below:

**Example 1**:

**INPUT**
RENE=MO10:00-12:00,TU10:00-12:00,TH01:00-03:00,SA14:00-18:00,SU20:00- 21:00
ASTRID=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00
ANDRES=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00

**OUTPUT**:
ASTRID-RENE: 2
ASTRID-ANDRES: 3
RENE-ANDRES: 2

**Example 2**:

**INPUT**:
RENE=MO10:15-12:00,TU10:00-12:00,TH13:00-13:15,SA14:00-18:00,SU20:00-21:00
ASTRID=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00

**OUTPUT**:
RENE-ASTRID: 3

---
### **Solution**
As per given in the exercise instructions, every single line has the information about one employee and his worked hours through the week, following this pattern:

  1. The employee's name.
  2. An equal sign (=).
  3. Two first letter of the day (MO,TU,WE,TH,FR,SA,SU).
  4. Check in Time, separating hours and minutes with two points (hh:mm).
  5. A dash.
  6. Check out Time, separating hours and minutes with two points (hh:mm).
  7. A comma.
  8. To add another worked day, repeat from step 3.

With this we can make an algorithm that read the data from the .txt file, processes and stores it in an arraylist for our use, ready for the next step.

The next step is comparing each employee and their working hours, we can do this in Java iterating the arraylist two time using a bubble algorithm to compare each , but we need to ensure that each possible combination is only done 1 time. After this all that is left is to show the number of coincidences on the screen.  

---
### **Architecture**
For this exercise the architecture used was MVC (Model-View-Controller), with this we can separate all functionalities to make a cleaner code.

---
### **Approach**
First 

---
### **Methodology**
The methodology used for this exercise was an objected-oriented paradigm paired with a MVC architecure. First we have 3 objects that work like models, a model for the time with hours and minutes, another one for the worked hours which has the name of the day and the check in and check out times, and the last one for the entire employee schedule, which has the name and an arraylist of the worked hours, so it can have has many hours registered as we desire.

Second we have 2 controllers, one for the reading and processing of the file and its data, and another one for the employees and the schedule comparison, and finally the view which calls the employee controller and shows the results to the user. The comparison algorithm uses the data of each employee, specifically their worked hours, it read the name of the day from both employees and if it is a match it checks the check in and check out time from both. If they are within range of each other the count will go up by one following this method:

  * If the check in hour of the 1st employee is both **greater or equal** than the check in hour of the 2nd employee and **lower or equal** than the check out hour of the 2nd employee:
    * Count + 1 
  * Else if the check in hour of the 2nd employee is both **greater or equal** than the check in hour of the 1st employee and **lower or equal** than the check out hour of the 1st employee:
    * Count + 1
  * Else if the check in hour of the 1st employee is **equal** to the check out hour of the 2nd employee or the check in hour of the 2nd employee is **equal** to the check out hour of the 1st employee:
    * If the check in minutes of the 1st employee are **lower or equal** than the check out minutes if the 2nd employee:
      * Count + 1
    * Else if the check in minutes of the 2nd employee are **lower or equal** than the check out minutes if the 1st employee:
      * Count + 1

With these conditions we can catch any coincidence between two employees at work on the same day in the same time range and get the results we want.

---
### **How to run the project**
---
First you will need to download the Netbeans IDE and JDK (Java Development Kit), you can get it from here:

  [Apache Netbeans](https://netbeans.apache.org/download/index.html "Apache Netbeans")

After getting Apache Netbeans successfully installed in your computer you just have to follow this steps:

  1. Download the github repository.
  2. Open Apache Netbeans IDE.
  3. Once you open it go to the section **File** in the top of the screen and click it.
  4. Click the option **Open Project**.
  5. Search the project in your download directory and double click it.
  6. Once the project was open run it by clicking the green arrow at the top of the Netbeans IDE.

---
### **How to run unit tests**
---
First you will need to have open the project following the instrunctions above, then:

  1. Search the folder named **Test Package** inside the open project in the Apache Netbeans IDE in the **Projects** tab.
  2. Open the **controller** package.
  3. Select one of the two test files and right click it.
  4. Search the option **Run File** and click it.

With this you can run the unit tests, there were made 4, one for each function of each controller.
