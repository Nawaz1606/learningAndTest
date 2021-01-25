package com.Exercises;

import java.util.ArrayList;

public class ArrayLIstDemo2 {

	public static void main(String[] args) {
		
		ArrayList<Integer>number= new ArrayList<>();
		ArrayList<Integer>number1=new ArrayList<>();
		ArrayList<Integer>number2=new ArrayList<>();
		
		
		
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(50);
		
		number1.add(1);
		number1.add(5);
		number1.add(9);
		number1.add(7);
		number1.add(11);
		
		
		System.out.println("Number = "+number);
		System.out.println("Number1 = "+number1);
		
		number2.addAll(number);
		
		System.out.println("Number2 = "+number2);
		
		number1.addAll(5, number2);
		System.out.println(number1);
		
		number.add(5, 60);
		int s=number.size();
		System.out.println("The size is: "+s);
		
//		number.clear();
//		System.out.println("After clear it contains: "+number);
//		
//		boolean emp=number.isEmpty();
//		System.out.println(emp);
		
		boolean cont=number.contains(60);
		System.out.println(cont);
		
		int pos=number.indexOf(40);
		System.out.println(pos);
		
		number.set(5, 70);
		System.out.println("After replacing the index: "+number);
		
		int indnum= number.get(4);
		System.out.println(indnum);
		
		

	}

}
