package com.javapractice;

import java.util.Scanner;

public class CheckingEvenOddDemo {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter a positive integar: ");
		
		num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("The number is Even");
		}else {
			System.out.println("The number is odd");
		}
	}

}
