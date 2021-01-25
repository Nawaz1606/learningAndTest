package com.Exercises;

import java.util.Scanner;

public class Exercise2 {
	
	// Print sum of all the numbers from m to n.

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int m, n;
		int sum=0;
		
		System.out.println("Please enter the first number: ");
		m=sc.nextInt();
		System.out.println("Please enter the second number: ");
		n=sc.nextInt();
		
		for(int i=m; i<=n; i++) {
			
			sum=sum+i;
			System.out.println("The number is: "+" "+i);
		}
		
		System.out.println("The sum is: "+sum);
		

	}

}
