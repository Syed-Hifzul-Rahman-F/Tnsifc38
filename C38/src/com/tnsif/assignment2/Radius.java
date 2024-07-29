package com.tnsif.assignment2;

import java.util.Scanner;

class Circle {
    private double radius;
    private String colour;

    public void getInput() {
        try(Scanner scanner = new Scanner(System.in);){

        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();
        }
    }
        public String getcolour() {
            return colour;
        }

        public void setName(String colour) {
            this.colour = colour;
        }

    public void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }


    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getInput();
        circle.calcArea();
    }
}
