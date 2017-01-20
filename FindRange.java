/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	//declaring the SENTINEL value
	private static final int SENTINEL = 0;
	
	//Running the program
	public void run() {
		println("This program finds the largest and smallest numbers.");
		//establish the first value
		int value = readInt(" ? ");
		//use first value as reference or pivoting point
		int max = value;
		int min = value;
		while(true){
			//if first value is the SENTINEL, then print error message and break loop
			if(value == SENTINEL){
				println("Error: No input found!");
				break;
			}
			//read in second value and compare to max, min, and SENTINEL
			int value2 = readInt(" ? ");
			if(value2 > max && value2 != SENTINEL)
				max = value2;
			else if(value2 < min && value2 != SENTINEL)
				min = value2;
			else if(value2 == SENTINEL)
				break;
		}
		//print out final values of max and min
		println("smallest: " + min);
		println("largest: " + max);
	}
	
}

