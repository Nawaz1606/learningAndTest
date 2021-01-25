package javadate;

import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class OffsetTimeAndOffsetDateTimeExample {

	public static void main(String[] args) {
		 
		
		
		OffsetTime time= OffsetTime.now();
		int hr=time.getHour();
		int mn=time.getMinute();
		int sec= time.getSecond();
		System.out.println("Now it is: "+hr+ "hr " +mn+ "min " +sec+ "sec ");
		
		System.out.println("-----------");
		
		ZoneId zone1=ZoneId.of("Asia/Dhaka");
		
		DateTimeFormatter format= DateTimeFormatter.ofPattern("MM-dd-yyyy / HH-mm-ss");
		
		OffsetDateTime dtime= OffsetDateTime.now();
		String dt=dtime.format(format);
		OffsetDateTime dtime1=OffsetDateTime.now(zone1);
		String dt1=dtime1.format(format);
		System.out.println("Now here, it is: "+ dt+" hr"+" And in Bangladesh, it is: "+dt1+" hr");
		
		System.out.println("----------");
		
		int gdm=dtime1.getDayOfMonth();
		System.out.println(gdm);
		
		System.out.println(dtime1.getDayOfWeek());
		System.out.println(dtime1.format(format));
		System.out.println(dtime1.toLocalDate());
		
		OffsetDateTime value=dtime1.minusDays(230);
		String v=value.format(format);
		System.out.println(v);
		
		ZoneId z = ZoneId.systemDefault();  
	    String s = z.getId();  
	    System.out.println(s);  
		
		
		

	}

}
