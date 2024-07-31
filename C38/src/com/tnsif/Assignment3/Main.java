package com.tnsif.Assignment3;



import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter choice:");
		int choice = sc.nextInt();
		System.out.print("enter hours:");
		int hours = sc.nextInt();
		System.out.print("enter cost per hour:");
		double costPerHour = sc.nextDouble();

		Airfare airfare;
		double amount = 0.0;

		switch (choice) {
		case 1:
			airfare = new AirIndia(hours, costPerHour);
			amount = airfare.calculateAmount();
			break;
		case 2:
			airfare = new KingFisher(hours, costPerHour);
			amount = airfare.calculateAmount();
			break;
		case 3:
			airfare = new Indigo(hours, costPerHour);
			amount = airfare.calculateAmount();
			break;
		default:
			System.out.println("Invalid choice");
			sc.close();

			return;
		}

		System.out.printf("Total amount is: "+ amount);

		
	}
}
