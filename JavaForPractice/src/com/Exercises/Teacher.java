package com.Exercises;

public class Teacher {
	
	String name;
	String gender;
	int phnNumber;
	
	// Peramaterized constructor
	
//	Teacher(String n, String g, int p){
//		
//		name=n;
//		gender=g;
//		phnNumber=p;
//		
//	}
	
	public void displayInfo() {
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Cell: "+phnNumber);
	}
	
	//Default constructor
	
//	Teacher(){
//		System.out.println("No value");
//	}
	public void setInfo(String n,String g, int p) {
		name=n;
		gender=g;
		phnNumber=p;
	}

}
