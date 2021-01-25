package com.Exercises;

import java.util.Scanner;

public class PatternDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter line number: ");
		
		int n=sc.nextInt();
		
//		for(int row=1; row<=n; row++) {
//			
//			for(int col=1;col<=row;col++) {
//				
//				System.out.print("*");
//				
//			}System.out.println();
//		}
       for(int row=n; row>=1;row--) {
    	   for(int col=1;col<=row;col++) {
    		   System.out.print(" "+col);
    	   }System.out.println();
       }
	}

}
