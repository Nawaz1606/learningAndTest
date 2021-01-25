package com.javapractice;

import java.util.Scanner;

public class MiniCarTest {

	public static void main(String[] args) {
		
		
		MiniCar mycar= new MiniCar();
		Scanner sc=new Scanner(System.in);
		
		mycar.availableGas();
		mycar.theCarCanRunTotal();
		
		System.out.print("How many mile will you drive?");
	     int mile=sc.nextInt();
		
		mycar.milesToDrive(mile);
		mycar.alreadyDriven(39);
		mycar.drive();
		
	
		
	
	
	
	}}
		
		
    

	


