package javadate;

import java.time.LocalTime;

public class LocalTimeExample1 {

	public static void main(String[] args) {
		
		// Java LocalTime Example: now():
		
		LocalTime time= LocalTime.now();
		System.out.println(time);
		int gh=time.getHour();
		System.out.println(gh);
		int gm=time.getMinute();
		System.out.println(gm);
		LocalTime mh= time.minusHours(5);
		System.out.println(mh);
		LocalTime pm=time.plusMinutes(4);
		System.out.println(pm);
		LocalTime time1=LocalTime.of(11, 33, 45);
		System.out.println(time1);
		
	}

}
