package com.javapractice;

import java.util.Scanner;

public class CheckingVowelConsonentDemo {
	
	public static void main(String[] arg) {
		
		Scanner sc= new Scanner(System.in);
		
		char ch;
		
		System.out.println("Enter a letter: ");
		
		ch=sc.next().charAt(0);
		
		switch(ch) {
		
		case 'a':
		System.out.println("Vowel");
		break;
		
		case'e':
			System.out.println("Vowel");
			break;
			
		case 'i':
			System.out.println("Vowel");
			break;
			
		case 'o':
			System.out.println("Vowel");
			break;
			
		case 'u':
			System.out.println("Vowel");
			break;
			
			default:
			System.out.println("It's a consonent");
			
		}
		
	}

}
