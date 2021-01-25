package com.javapractice;

public class MiniCar {
	
	/*Develop a mini car to drive
	Our mini car should come with 50 liters of gas
	We should be able to drive that car but we need to tell it how many miles we want to drive
	The car can drive and should be able to tell us, how many miles it has driven
	For 1 liter of gas that car can drive 10 miles, now we should be able to drive as many time as we want as long as the car has gas/*/
      
	private int gas=50;
	
	public void availableGas() {
		System.out.println("My car has " + gas + " liters of gas ");
	} 
	
	public void milesToDrive(int miles) {
		System.out.println("We will drive for "+ miles + " miles");
	}
	
	public void theCarCanRunTotal() {
		System.out.println("The car can run total: " + 10*gas +" miles ");
	}
	
	public void alreadyDriven(int remainingGas) {
		System.out.println("The car has alresdy run :" + (500-10*remainingGas) + "miles");
	}
	 public void drive() {
		 for(int i=50; i>=1; i--)
			 System.out.println("The car is running good..");
		 System.out.println("You need to refuel again");
	 }
	

	}













	
	
	


	
			
		
	
	

	       
	


