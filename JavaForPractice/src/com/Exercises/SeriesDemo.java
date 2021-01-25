package com.Exercises;

import java.util.Scanner;

public class SeriesDemo {
	
	// 1+3+5+7+..........n
	// 2.5+4.5+6.5+.......n
	// 1^2+4^2+7^2+......n^2
	// 2X5X8X11X........X n

	public static void main(String[] args) {

		
		
//		int n,sum=0;
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the last number: ");
//		n=sc.nextInt();
//		
//		for(int i=1; i<=n; i=i+2) {
//			
//			sum=sum+i;
//			System.out.print(" "+i);
//		}
//		System.out.println();
//
//		System.out.println("The sum is: "+sum);
//		}

//		double n;
//	double sum=0;
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the last number: ");
//	     n=sc.nextDouble();
//	     
//	     for(double i=2.5; i<=n; i=i+2) {
//	    	 System.out.print(i+" ");
//	    	 sum=sum+i;
//	    	 
//	    	 
//	     }System.out.println();
//	     System.out.println("The sum is: "+sum);
//		
		
//		int n;
//		int sum=0;
//		
//		Scanner sc=new Scanner(System.in);		
//		System.out.println("Enter the last number: ");		
//		n=sc.nextInt();
//		
//		for(int i=1;i<=n;i=i+3) {
//			
//			System.out.print(i+"x"+i+" ");
//			sum=sum+i*i;
//			
//		}
//		System.out.println();
//		System.out.println("The sum is: "+sum);
		
		int n;
	       int result=1;
	      Scanner sc= new Scanner(System.in);
	      
	      System.out.println("Enter the number: ");
	      n=sc.nextInt();
	      
	      for(int i=2; i<=n;i=i+3) {
	    	  
	    	  System.out.print(" "+i);
	    	  result=result*i;
	      }
	      System.out.println();
	      System.out.println("The result is: "+result);
		
}}
                  