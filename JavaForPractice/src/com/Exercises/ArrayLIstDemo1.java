package com.Exercises;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLIstDemo1 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer>number=new ArrayList<>();
		
		number.add(10);
		number.add(9);
		number.add(30);
		number.add(25);
		number.add(40);
		
		
		number.add(5, 1);
		
		System.out.println("Before sorting: "+number);
		
		Collections.sort(number);
		System.out.println("After sorting in ascending order: "+number);
		
		Collections.sort(number, Collections.reverseOrder());
		System.out.println("After sorting in descending order: "+number);
		
		
		
		

	}

}
