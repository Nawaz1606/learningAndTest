package com.Exercises;

import java.util.Scanner;

public class TimeTableDemo {

	public static void main(String[] args) {
		
//		int num;
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter a positive integer: ");
//		num=sc.nextInt();
//		
//		for(int i=1; i<=10; i++) {
//			
//			System.out.println(num+" X "+i+ "="+num*i);
//		}
         
		int m,n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the initial number: ");
		m=sc.nextInt();
		System.out.println("Enter the last number: ");
		n=sc.nextInt();
		
		for(int i=m; i<=n; i++) {
			
			for(int j=1; j<=10; j++) {
				
				System.out.println(i+" X "+j+" = "+i*j);
			}
			System.out.println("-----------");
		}
		
		
		
		
		
		
		
	}

}
