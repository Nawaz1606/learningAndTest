package javadate;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample2 {

	public static void main(String[] args) {
		
		ZoneId zone1= ZoneId.of("Asia/Dhaka");
		ZoneId zone2= ZoneId.of("Australia/Sydney");
		ZoneId zone3= ZoneId.of("Europe/London");
		ZoneId zone4= ZoneId.of("Europe/Paris");
		
		LocalTime time1 =LocalTime.now(zone1);
		LocalTime time2 =LocalTime.now(zone2);
		LocalTime time3 =LocalTime.now(zone3);
		LocalTime time4 =LocalTime.now(zone4);
		
		System.out.println("Bangladesh current titime1me is: "+ time1);
		System.out.println("Australia current time is: "+ time2);
		System.out.println("UK current time is: "+ time3);
		System.out.println("France current time is: "+ time4);
		
		long gap=ChronoUnit.HOURS.between(time1, time2);
		System.out.println("The time gap between the two countries: "+gap+ " Hrs");


	}

}
