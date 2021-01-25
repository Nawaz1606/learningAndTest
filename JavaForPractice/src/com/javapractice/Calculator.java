package com.javapractice;

import java.util.Scanner;

public class Calculator {
	
/* Develop a program that can take three input from user. 1st one for first number, 2nd one for second number and the 3rd one for operator such as (+,-,* and/). Finally
	display the result as user inputs. If user input 50 for first input, 10 for 2nd input and "/" for 3rd input then your program should display "calculated result is 5". Such a 
	way it should work for other operators. /*/
	
	public static void main(String[] args) {
		
		int num1;
		
		int num2;
		
		char operator1='+';
		
		char operator2='-';
		
		char operator3='*';
		
		char operator4='/';
		
		char operator5='%';
		
		
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Please enter the first number");
		
		num1=scanner.nextInt();
		
		System.out.println("Please enter the second number");
		
		num2=scanner.nextInt();
		System.out.println("Please enter operator below: ex:( +, -, *, /,%)");
		
		char operator = scanner.next().charAt(0);
		
		
		if(operator==operator1) {
			System.out.println("Calculated result is :" + (num1+num2) );
		}else if(operator==operator2) {
			System.out.println("Calculated result is :" + (num1-num2));
		}else if(operator==operator3) {
			System.out.println("Calculated result is :" + (num1*num2));
		}else if(operator==operator4) {
			System.out.println("Calculated result is :" + (num1/num2));
		}else if(operator==operator5)
			System.out.println("Calculated result is :"+ (num1%num2));
		else
			System.out.println("inavalid result");
		}
			
}
