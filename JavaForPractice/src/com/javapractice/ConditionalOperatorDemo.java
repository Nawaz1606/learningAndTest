package com.javapractice;

import java.util.Scanner;

public class ConditionalOperatorDemo {
	
	/* (expression 1)? expression2:expression3
	 * if the first expression is true then the second expression will work
	 * if the first expression is false then the third expression will work
	 * it is similar to if else condition
	 */

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num1, num2, large;
		
		System.out.println("Enter two numbers: ");
		
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		large=(num1>num2)?num1:num2;
		 System.out.println("Large number is: "+ large);
		

	}

}
