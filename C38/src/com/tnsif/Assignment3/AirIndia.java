package com.tnsif.Assignment3;



public class AirIndia implements Airfare {
	private int hours;
	private double costPerHour;

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getCostPerHour() {
		return costPerHour;
	}

	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}

	public AirIndia() {
	}

	public AirIndia(int hours, double costPerHour) {
		this.hours = hours;
		this.costPerHour = costPerHour;
	}
	  @Override
	    public double calculateAmount() {
	        return hours * costPerHour;
	    }
}
