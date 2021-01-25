package com.Exercises;

import java.util.ArrayList;

public class LyricsDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		String[]song= new String[3];
	
		song[0]="Woah livin on a prayer.";
		song[1]="Take my hand we'll make it I swear.";
		song[2]="Woah livin on a prayer..";
		
		
		
		for(String s:song) {
			
			Thread.sleep(200);
			System.out.println(s);
			
		}
		
		
		
		for(String s:song) {
			Thread.sleep(250);
			System.out.println(s);
		}

	}

}
