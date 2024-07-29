package com.tnsif.assignment2;

import java.util.Scanner;

public class Student {
    public Student() {
        System.out.println("Student object is created");
    }
}

class Commission {
    private String name;
    private String address;
    private String phone;
    private double salesAmount;

    public void getDetails() {
        try(Scanner scanner = new Scanner(System.in);){
        
        System.out.print("Enter sales amount: ");
        salesAmount = scanner.nextDouble();
    }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and setter for phone
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void calculateCommission() {
        double commission;
        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        } else {
            commission = 0;
        }
        System.out.println("The commission is: " + commission);
    }


    public static void main(String[] args) {
     
        Commission commission = new Commission();
        commission.getDetails();
        commission.calculateCommission();
    }
    }
