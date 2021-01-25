package com.javapractice;

import java.util.Scanner;

public class QuizContest {

	public static void main(String[] args) {
		
	/*	Build a quiz program with 5 questions. 1 point for each question. Each question should have either true or false answer. Your program should ask to user those 5 questions
		one after another and takes answer from user. After the quiz completes, your program should let the user know how many points he/she has.../*/
           

		
		String c= "true";
		String i= "false";
		int result=0;
		
		System.out.println("****Welcome to the Quiz contest****");	
		System.out.println("--------------------------------------------");
		
		Scanner sc=new Scanner(System.in);
										
		System.out.println("Dhaka is the capital of Bangladesh");
		String Ans1=sc.next();
		System.out.println("Bronx river parkway is in Bronx");				
		String Ans2=sc.next();	
		System.out.println("Maradona died in 2019");
		String Ans3=sc.next();
		System.out.println("France is the last football world cup winner");
		String Ans4=sc.next();
		System.out.println("Donald Trump won the 2020 president election");
		String Ans5=sc.next();
		
		if(Ans1.equals(c)) {
			result ++;
	}
			//else if(Ans1.equals(i)) {
//			//result=result;
//		}
		if (Ans2.equals(c)) {
			result++;
	}
			//else if (Ans2.equals(i)) {
//			result=result;
//		}
		if (Ans3.equals(i)) {
			result++;
}
//		else if (Ans3.equals(c)) {
////			result=result;
////		}
		if (Ans4.equals(c)) {
			result++;
	}
//			else if (Ans4.equals(i)) {
//			result=result;
//	}
		if (Ans5.equals(i)) {
			result++;
		}
//			else if (Ans5.equals(c)) {
//		result=result;
//		}
		System.out.println("Your score is :" + result);
		System.out.println("You have given total " + result + " correct answer ");
	}}
		
		
										
											
											
										
										
									
									
								
								
							
							
						
						
					
					
				
				
			
			
		
		
		
		
		
		
 
