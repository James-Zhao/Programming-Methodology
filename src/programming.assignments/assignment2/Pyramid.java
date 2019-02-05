package assignment2;
/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;

	@Override
	public void run() {
		/* You fill this in. */
		paintPyramid(getWidth() / 2, getHeight(), BRICKS_IN_BASE);
	}
	 /*add pyramid by the location of the mid of the button */
	private void paintPyramid(double cx, double cy, int base) {
		for (int x = base; x > 0; x--) {
			double startX = cx - x * BRICK_WIDTH / 2;
			double startY = cy - (base - x) * BRICK_HEIGHT;
			piantOneRow(startX, startY, x);
		}
	}
	/*paint one row by the lower-left corner*/
	private void piantOneRow(double cx, double cy, int base) {
		for (int x = 0; x < base; x++) {
			addGRect(cx + x * BRICK_WIDTH, cy - BRICK_HEIGHT);
		}
	}
	
	/*paint one rectangle */
	private void addGRect(double cx, double cy) {
		GRect grect = new GRect(cx, cy, BRICK_WIDTH, BRICK_HEIGHT);
		add(grect);		
	}
	
	
}

