package com.javapractice;

import java.util.Random;


public class GenerateRandomQuote {

	public static void main(String[] args) {
		
		String[] quotes= {"The purpose of our lives is to be happy. — Dalai Lama",
				"Life is what happens when you’re busy making other plans. — John Lennon",
				"Get busy living or get busy dying. — Stephen King",
				"You only live once, but if you do it right, once is enough. — Mae West"};
		
	Random rand=new Random();

	System.out.println(quotes[rand.nextInt(4)]);
		
		
		

	}

}
