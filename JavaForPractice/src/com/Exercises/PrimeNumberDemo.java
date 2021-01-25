package com.Exercises;

import java.util.Scanner;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any positive integer: ");
		int num=sc.nextInt();
		int count=0;
		
		for(int i=2; i<num; i++) {
			 if(num%i==0)
				 count++;
			 break;
		}if(count==0)
			System.out.println("The number is  prime");
		else 
		{System.out.println("The number is not prime");}}}
		
//		Scanner ds=new Scanner(System.in);
//		
//		int m,n;
//		int count=0;
//		int totalPrime=0;
//		
//		System.out.println("Enter the initial number: ");
//		
//		m=ds.nextInt();
//		
//		System.out.println("Enter the last number: ");
//		
//		 n=ds.nextInt();
//		 
//		 for(int i=m; i<n; i++) {
//			 
//			 for(int j=2; j<=i-1; j++) {
//				 
//				 if(i%j==0) {
//					 
//					 count++;
//					 break;
//				 }
//				 if(count==0) {
//					 System.out.println(i);
//					 
//					 totalPrime++;
//				 }
//				 count=0;
//				 
//			 }
//		 }
//		
//		 System.out.println("Total prime number= "+totalPrime);
//		
//		
//	}
//
//}
