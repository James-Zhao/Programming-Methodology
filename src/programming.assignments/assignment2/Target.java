package assignment2;
/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	
	private static final double OUTER_CIRCLE_RADIUS = 72;
	private static final double MIDDLE_CIRCLE_RADIUS = OUTER_CIRCLE_RADIUS * 0.65;
	private static final double INNER_CIRCLE_RADIUS = OUTER_CIRCLE_RADIUS * 0.3;

	@Override
	public void run() {
		/* You fill this in. */
		addTarget(getWidth() / 2, getHeight() / 2);
	}
	
	//paint three GOval in the correct order
	private void addTarget(double cx, double cy) {
		paintGOval(cx - OUTER_CIRCLE_RADIUS, cy - OUTER_CIRCLE_RADIUS, OUTER_CIRCLE_RADIUS * 2, OUTER_CIRCLE_RADIUS * 2, Color.red);
		paintGOval(cx - MIDDLE_CIRCLE_RADIUS, cy - MIDDLE_CIRCLE_RADIUS, MIDDLE_CIRCLE_RADIUS * 2, MIDDLE_CIRCLE_RADIUS * 2, Color.white);
		paintGOval(cx - INNER_CIRCLE_RADIUS, cy - INNER_CIRCLE_RADIUS, INNER_CIRCLE_RADIUS * 2, INNER_CIRCLE_RADIUS * 2, Color.red);
	}
	
	/*paint one GOval */
	private void paintGOval(double cx, double cy, double width, double height ,Color color) {
		GOval goval = new GOval(cx, cy, width, height);
		goval.setFilled(true);
		goval.setFillColor(color);
		add(goval);
	}
}
