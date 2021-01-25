package javadate;

import java.time.LocalDate;

public class LocalDateExample1 {

	public static void main(String[] args) {
		
		/*Java LocalDate example: Java LocalDate class is an immutable class that represents Date with a default format of yyyy-MM-dd.
		 *  It inherits Object class and implements the ChronoLocalDate interface
		 */
		
		LocalDate date=LocalDate.now();
		LocalDate yesterday=date.minusDays(1);
		LocalDate tommorow= date.plusDays(1);
		System.out.println("Todays date is: "+ date);
		System.out.println("Yesterday was: "+ yesterday);
		System.out.println("Tommorow will be: "+ tommorow);
		
		System.out.println("----------");
		
     

	}

}
