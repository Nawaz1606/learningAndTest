package com.Exercises;

import java.util.Scanner;

public class FactorialDemo {
	
	/*Factorial of a number means...multiply the number with it's previous numbers which will end on 1.
	 * 5!= 5*4*3*2*1
	 */

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num;
		int result=1;
		
		System.out.println("Enter a positive integer: ");
		num=sc.nextInt();
		
		for(int i=num; i>=1; i--) {
			
			System.out.print(" "+i);
			result=result*i;
		}
		System.out.println();
		System.out.println("The result of the factorial number "+num+" is:"+ result);
		
				
		
		
	}

}
