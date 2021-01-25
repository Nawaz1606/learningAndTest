package javadate;

import java.time.LocalDate;

public class LocalDateExample2 {

	public static void main(String[] args) {
		
 // Java LocalDate Example: isLeapYear()
		
		LocalDate date1= LocalDate.of(2020, 2, 24);
		boolean b=date1.isLeapYear();
		System.out.println(b);
	}

}
