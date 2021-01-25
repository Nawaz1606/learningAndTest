package com.Exercises;

import java.util.Scanner;

public class ArmstrongNumberDemo {

	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
		
		int num;
		int sum=0;
		int r;
		int temp;
		
		System.out.println("Enter the number: ");
		
		num=sc.nextInt();
		
		temp=num;
		
		while(temp!=0) {
			r=temp%10;
			sum=sum+r*r*r;
			temp=temp/10;
			
		}if(num==sum) {
			System.out.println("The number is Armstrong");
		}else {
			System.out.println("Invalid");
		}
	}

}
