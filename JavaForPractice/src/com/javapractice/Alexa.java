package com.javapractice;

public class Alexa {
	
	private String name= "Alexa";
	
	public void whatIsYourName() {
		System.out.println("My name is "+ name);
		}
	
	public void playRadio() {
		System.out.println("Playin z-100");
	}
	
	public void tellWhatDayIsToday() {
		System.out.println("Today is Friday");
	}
	
	public void howManyInchesInFeet(Double feet) {
		System.out.println(feet*12 +"Inches");
		
	}
	
	public void thankYou() {
		System.out.println("My pleasure");
	}

}
