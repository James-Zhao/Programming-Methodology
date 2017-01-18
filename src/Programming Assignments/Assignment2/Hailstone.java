package assignment2;
/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		/* You fill this in */
		int count = 0;
		int val = readInt("Enter a number: ");
		while(true) {
			if (val == 1) {
				println("The process took " + count + " to reach 1");
				break;
			}
			if (val % 2 == 0) {				
				println(val + " is even so I take half: " + val / 2);
				val = val / 2;
			}else {
				println(val + " is odd, so I make 3n + 1: " + (val * 3 + 1));
				val = val * 3 + 1;
			}
			count += 1;			
		}
	}
}

