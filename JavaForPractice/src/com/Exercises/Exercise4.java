package com.Exercises;

import java.util.Scanner;

public class Exercise4 {

	// Print sum of all the odd numbers from m to n.
	
	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
		
		int m, n;
		int sum=0;
		
		System.out.println("Please enter the first number: ");
		m=sc.nextInt();
		System.out.println("Please enter the second number: ");
		n=sc.nextInt();
		
		for (int i=m; i<=n; i=i+2) {
			
			if(i%2!=0)
				sum=sum+i;
			System.out.print(" "+i);
		}
		System.out.println();
		 System.out.println("The sum is: "+ sum);
	}
		
		
		
		

	}


