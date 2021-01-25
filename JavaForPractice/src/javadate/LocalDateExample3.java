package javadate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateExample3 {

	public static void main(String[] args) {
		
		//Java LocalDate Example: atTime()
		
		LocalDate date=LocalDate.of(2019, 10, 30);
		LocalDateTime datetime=date.atTime(13, 30, 45);
		System.out.println( datetime );
		
		LocalDateTime datetime1=date.atStartOfDay();
		System.out.println(datetime1);
		
		int xy=date.getDayOfMonth();
		System.out.println(xy);
		DayOfWeek doe=date.getDayOfWeek();
		System.out.println(doe);
		int doy=date.getDayOfYear();
		System.out.println(doy);
		Month month=date.getMonth();
		System.out.println(month);
		int lom=date.lengthOfMonth();
		System.out.println(lom);
		int loy=date.lengthOfYear();
		System.out.println(loy);
		LocalDate md=date.minusDays(25);
		System.out.println(md);
		LocalDate mm=date.minusMonths(6);
		System.out.println(mm);

	}

}
