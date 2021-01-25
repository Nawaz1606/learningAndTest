package javadate;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		
		//Java LocalDateTime Example: now() with formatting
		
		LocalDateTime dateTime= LocalDateTime.now();
		System.out.println("Before formating: "+dateTime);
		
		DateTimeFormatter format= DateTimeFormatter.ofPattern("MM-dd-yyyy HH-mm-ss");
		String dtf=dateTime.format(format);
		System.out.println("After formating: "+dtf);
		
		System.out.println("--------------");
		
		//Java LocalDateTime Example: get()
		
		LocalDateTime dateTime1= LocalDateTime.of(2020, 6, 23, 15, 45);
		
		
		int dom=dateTime1.get(ChronoField.DAY_OF_MONTH);
		System.out.println(dom);
		int doy=dateTime1.getDayOfYear();
		System.out.println(doy);
		int dow=dateTime1.get(ChronoField.DAY_OF_WEEK);
		System.out.println(dow);
		int choap=dateTime1.get(ChronoField.CLOCK_HOUR_OF_AMPM);
		System.out.println(choap);
		int chod=dateTime1.get(ChronoField.CLOCK_HOUR_OF_DAY);
		System.out.println(chod);
		int awof=dateTime1.get(ChronoField.ALIGNED_WEEK_OF_MONTH);
		System.out.println(awof);
		int awoy=dateTime1.get(ChronoField.ALIGNED_WEEK_OF_YEAR);
		System.out.println(awoy);
		int mod=dateTime1.get(ChronoField.MINUTE_OF_DAY);
		System.out.println(mod);
		
		System.out.println("----------");
		
		//Java LocalDateTime Example: minusDays() & plusDays()
		
		DateTimeFormatter format1= DateTimeFormatter.ofPattern("MM-dd-yyyy HH-mm-ss");
		LocalDateTime dateTime2=LocalDateTime.of(2020, 12, 13, 14, 20, 55);
		
		String cp=dateTime2.format(format1);
		System.out.println(cp);
		
		LocalDateTime md=dateTime2.minusDays(10);
		String Updated=md.format(format1);
		System.out.println(Updated);
		
		LocalDateTime pd=dateTime2.plusDays(10);
		String Updated2=pd.format(format1);
		System.out.println(Updated2);
		
		
		
		

		
		
	}

}
