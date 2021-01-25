package com.javapractice;

import java.util.Scanner;

public class LogicalOperatorDemo {
	
	/* In OR operator (||), it will work if any of the condition is true
	 * In AND operator(&&), it will work when all of the condition is true.
	 */

	public static void main(String[] args) {
		
        Scanner sc= new Scanner(System.in);
		
		char ch;
		
		System.out.println("Enter a letter: ");
		
		ch=sc.next().charAt(0);
		
//		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
//			System.out.println("The letter is vowel");
//		}else
//			System.out.println("The letter is consonent");
		
		if(ch>='a' && ch<='z') {
			System.out.println("Small letter");
		}else if(ch>='A' && ch<='Z') {
			System.out.println("Capital letter");
		}else
			System.out.println("Invalid input");

	}

}
