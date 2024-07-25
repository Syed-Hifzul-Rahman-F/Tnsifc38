package com.syedhifzul.assignment.utilities;

import com.syedhifzul.assignment.employees.Employee;
import com.syedhifzul.assignment.employees.Manager;
import com.syedhifzul.assignment.employees.Developer;

public class EmployeeUtilities {

    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getname());
        System.out.println("Salary: " + employee.getSalary());

        if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Teams: " + manager.getteams());
        } else if (employee instanceof Developer) {
            Developer developer = (Developer) employee;
            System.out.println("codelines: " + developer.getcode());
        }
    }

    public static void increaseSalary(Employee employee, int percentage) {
        int newSalary = employee.getSalary() * (1 + percentage / 100);
        employee.setSalary(newSalary);
    }
}
