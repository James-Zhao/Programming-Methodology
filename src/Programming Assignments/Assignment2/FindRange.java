package assignment2;
/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {

	private static final int SENTINEL = 0;

	public void run() {
		/* You fill this in */
		// first value assigned to smallest and largest
		println("This program finds the largest and smallest numbers");
		int val = readInt("? ");
		if (val == SENTINEL) {
			println("you enter the sentinel on the very first input line");
		} else {
			int smallest = val;
			int largest = val;
			while (true) {
				val = readInt("? ");
				if (val == SENTINEL)
					break;
				smallest = smallest < val ? smallest : val;
				largest = largest > val ? largest : val;
			}
			println("smallest: " + smallest);
			println("largest: " + largest);
		}
	}
}
