package javadate;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class MonthDayExample {

	public static void main(String[] args) {
		
		MonthDay month=MonthDay.now();
		System.out.println(month);
		LocalDate cy=month.atYear(2020);
		System.out.println(cy);
		DateTimeFormatter date= DateTimeFormatter.ofPattern("MM-dd-yyyy");
		String cy1=cy.format(date);
		System.out.println(cy1);
		
		ValueRange vr=month.range(ChronoField.DAY_OF_MONTH);
		System.out.println(vr);
		
		MonthDay month1=MonthDay.of(2, 29);
		System.out.println(month1);
		int gdm=month1.getDayOfMonth();
		System.out.println(gdm);
		int moy=month1.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(moy);
		
		LocalDate py=month.atYear(2019);
		System.out.println(py);
		
		boolean b=month1.isValidYear(2019);
		System.out.println(b);
	
	
	
	}

}
