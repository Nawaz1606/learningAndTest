package com.javapractice;

import java.util.Scanner;

public class ZodiacSign {
	
	/*your program should ask your user to give zodiac sign name. and based on this information, your program should let the user know what is his/her zodiac signs date range/*/

	public static void main(String[] args) {
		
//		String zodiac1= "Aries";
//		String zodiac2= "Taurus";
//		String zodiac3= "Gemini";
//		String zodiac4= "Cancer";
//		String zodiac5= "Leo";
//		String zodiac6= "Virgo";
//		String zodiac7="Libra";
//		String zodiac8= "Scorpio";
//		String zodiac9= "Sagittarius";
//		String zodiac10="Capricorn";
//		String zodiac11= "Aquarius";
//		String zodiac12= "Pisces";
		
//		Scanner scanner= new Scanner(System.in);
//		
//		System.out.println("Please enter your zodiac name...");
//		
//		String zodiac=scanner.next();
//		
//		if(zodiac.equals(zodiac1)) {
//			System.out.println("March 21 - April 20");
//		}else if(zodiac.equals(zodiac2)) {
//			System.out.println("April 21 - May 20");
//		}else if(zodiac.equals(zodiac3)) {
//			System.out.println("May 21 - June 20");
//		}else if(zodiac.equals(zodiac4)) {
//			System.out.println("June 21 - July 22");
//		}else if(zodiac.equals(zodiac5)) {
//			System.out.println("July 23 - Aug 22");
//		}else if(zodiac.equals(zodiac6)) {
//			System.out.println("Aug 23 - Sep 22");
//		}else if(zodiac.equals(zodiac7)) {
//			System.out.println("Sep 23 - Oct 22");
//		}else if(zodiac.equals(zodiac8)) {
//			System.out.println("Oct 23 - Nov 22");
//		}else if(zodiac.equals(zodiac9)) {
//			System.out.println("Nov 23 - Dec 21");
//		}else if(zodiac.equals(zodiac10)) {
//			System.out.println("Dec 22 - Jan 19");
//		}else if(zodiac.equals(zodiac11)) {
//			System.out.println("Jan 20 - Feb 19");
//		}else if(zodiac.equals(zodiac12)) {
//			System.out.println("Feb 20 - Mar 20");
//		}else
//			System.out.println("No data found");
//		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter your zodiac name: ");
		
		String Zodiac=sc.next();
		
		
		switch(Zodiac) {
		case "Aries" :
			System.out.println("March 21 - April 20");
			break;
		case "Taurus":
			System.out.println("April 21 - May 20");
			break;
		case "Gemini":
			System.out.println("May 21 - June 20");
			break;
		case "Cancer":
			System.out.println("June 21 - July 22");
			break;
		case "Leo":
			System.out.println("July 23 - Aug 22");
			break;
		case "Virgo":
			System.out.println("Aug 23 - Sep 22");
			break;
		case "Libra":
			System.out.println("Sep 23 - Oct 22");
			break;
		case "Scorpio":
			System.out.println("Oct 23 - Nov 22");
			break;
		case "Sagittarius":
			System.out.println("Nov 23 - Dec 21");
			break;
		case "Capricorn":
			System.out.println("Dec 22 - Jan 19");
			break;
		case "Aquarius":
			System.out.println("Jan 20 - Feb 19");
			break;
		case "Pisces":
			System.out.println("Feb 20 - Mar 20");
			break;
		
			
			
			default:
			System.out.println("Not a Zodiac name");
			
		}
		
		
		
		
		
		
		
		}
}
