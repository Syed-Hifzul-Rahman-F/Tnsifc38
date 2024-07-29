package com.tnsif.assignment2;

import java.util.Scanner;

public class StudentDetails {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their full name with initial
        System.out.print("Enter your full name with initial: ");
        String fullName = scanner.nextLine();
        
        // Prompt the user to enter their roll number
        System.out.print("Enter your roll number: ");
        String rollNumber = scanner.nextLine();
        
        // Prompt the user to enter their grade
        System.out.print("Enter your grade: ");
        String grade = scanner.nextLine();
        
        // Prompt the user to enter their percentage
        System.out.print("Enter your percentage: ");
        String percentage = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Print the details in the specified format
        System.out.println();
        System.out.println(fullName);
        System.out.println(rollNumber);
        System.out.println(grade);
        System.out.println(percentage);
    }
}
