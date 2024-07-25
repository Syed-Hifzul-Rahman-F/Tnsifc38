package com.syedhifzul.assignment;

import com.syedhifzul.assignment.employees.Developer;
import com.syedhifzul.assignment.employees.Manager;
import com.syedhifzul.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setEmployeeId(1);
        manager.setname("SYED HIFZUL RAHMAN");
        manager.setSalary(90000);
        manager.setteams(10);

        Developer developer = new Developer();
        developer.setEmployeeId(2);
        developer.setname("mohd izzat");
        developer.setSalary(80000);
        developer.setcode("JAVA");

        System.out.println("Manager Details:");
        EmployeeUtilities.printEmployeeDetails(manager);

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.printEmployeeDetails(developer);

        EmployeeUtilities.increaseSalary(manager, 10);
        EmployeeUtilities.increaseSalary(developer, 15);

        System.out.println("\nAfter Salary Increase:");
        System.out.println("Manager Details:");
        EmployeeUtilities.printEmployeeDetails(manager);

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}
