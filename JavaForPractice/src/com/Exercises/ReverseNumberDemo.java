package com.Exercises;

import java.util.Scanner;

public class ReverseNumberDemo {

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
			sum=sum*10+r;
			temp=temp/10;
			
		}
		System.out.println("The reverse number is: "+sum);

	}

}
