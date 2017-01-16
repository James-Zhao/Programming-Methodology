package assignment1;

/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	public void run() {
		oneLineAction();
		while (frontIsClear()) {
			if (beepersPresent()) {
				move(); // 2,4,6,8,10.... 
				turnLeft();
				move();
				turnRight();
				oneLineAction();
			} else {
				move(); // 3,5,7,9,11.... 
				oneLineAction();
			}
		}
	}

	/* oneLineAction decomposition */
	private void oneLineAction() {
		turnLeft();
		goAction(); 
		turnAround();
		returnAction(); 
		turnLeft();
	}

	/* goAction decomposition, key idea for this question */
	private void goAction() {
		while (frontIsClear()) { 
			putBeeper(); 
			move();
			if (frontIsClear()) {
				move();
			}
		}

		turnAround(); 
		if (frontIsClear()) {
			move();
			if (noBeepersPresent()) {
				turnAround();
				move();
				putBeeper();
			} else { 
				turnAround();
				move();
			}

		} else {
			oneLineAction(); 
		} 
	}

	/* returnAction decomposition */
	private void returnAction() {
		while (frontIsClear()) {
			move();
		}
	}

}
