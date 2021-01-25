package com.Exercises;

public class StringDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		String s1= "Nawaz Ahmed";
		String s2= new String("Nawaz Ahmed");
		String s3= "Nawaz Ahmed";
		
		char[] name= {'N','A','W','A','Z'} ;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(name);//it's also print a String value.
		
		int len=s2.length();//this method is for measuring the length of a String 
		System.out.println(len);
		
		boolean b=s1.contains("awaz");//the method is for checking the character is present or not.(returns true/false).
		System.out.println(b);
		
		//This method is to check equality 
		if(s1.equals(s2)) {
			System.out.println("equal");
		}else {System.out.println("not equal");}
		if (s1==s2) {
			System.out.println("equal");
		}else {System.out.println("not equal");}
		
		boolean emp=s2.isEmpty();// this method is to check either the String is empty or not.(Return true/false)
		System.out.println(emp);
		
		String FirstName= "Nawaz";
		String LastName= " Ahmed";
		
		String FullName= FirstName+LastName ;
		System.out.println(FullName);
		System.out.println(FullName.toUpperCase());
		System.out.println(FullName.toLowerCase());
		boolean f=FirstName.startsWith("Nawa");
		System.out.println(f);
		boolean l= LastName.endsWith("ed");
		System.out.println(l);
		
		String Country= "Bangladesh is my native country";
		System.out.println(Country);
		char c=Country.charAt(11);
		System.out.println(c);
		int cp=Country.compareTo(s1);
		System.out.println(cp);
		int in=Country.indexOf("my");
		System.out.println(in);
		int lin=Country.lastIndexOf("try");
		System.out.println(lin);
		
		String sp= "The way you are talking with me...it is totally unacceptable";
		char[]carr=sp.toCharArray();
		for(char x:carr) {
			Thread.sleep(200);
			System.out.print(x);
			
		}
				

		
		
	
		
		



	}

}
