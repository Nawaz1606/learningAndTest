package com.javapractice;




import java.time.LocalDate;
import java.util.Scanner;

public class TinyObject {
	
//	If we tell to that tiny object how old am I, this object should tell me which year I born

	public static void main(String[] args) {
		
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your age");
		
		int age=sc.nextInt();
		
		LocalDate currentdate= LocalDate.now();
		int currentYear=currentdate.getYear();
		
		System.out.println("Your birth year is :" + (currentYear-age) );
		
		
		

		
	}

}
