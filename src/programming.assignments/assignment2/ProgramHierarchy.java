package assignment2;
/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	
	private static final double RECT_WIDTH = 120;
	private static final double RECT_HEIGHT = 30;
	private static final double SPACE_WIDTH = 12;//矩形间隔在x轴的大小
	private static final double SPACE_HEIGHT = 30;//矩形间隔在y轴的大小
	
	@Override
	public void run() {
		/* You fill this in. */
		addProgramHierarchy(getWidth() / 2, getHeight() / 2);
	}
	
	private void addProgramHierarchy(double cx, double cy) {
		addRectWithLabel(cx - RECT_WIDTH / 2, cy - SPACE_HEIGHT / 2 - RECT_HEIGHT, "Program");
		addRectWithLabel(cx - 3 * RECT_WIDTH / 2 - SPACE_WIDTH, cy + SPACE_HEIGHT / 2, "GraphicsProgram");
		addRectWithLabel(cx - RECT_WIDTH / 2, cy + SPACE_HEIGHT / 2, "ConsoleProgram");
		addRectWithLabel(cx + RECT_WIDTH / 2 + SPACE_WIDTH, cy + SPACE_HEIGHT / 2, "DialogProgram");
		addLine(cx, cy - SPACE_HEIGHT / 2, cx, cy + SPACE_HEIGHT / 2);
		addLine(cx, cy - SPACE_HEIGHT / 2, cx - RECT_WIDTH - SPACE_WIDTH, cy + SPACE_HEIGHT / 2);
		addLine(cx, cy - SPACE_HEIGHT / 2, cx + RECT_WIDTH + SPACE_WIDTH, cy + SPACE_HEIGHT / 2);
	}
	/*paint a rectangle with label in it  */
	private void addRectWithLabel(double cx, double cy, String label) {
		GRect grect = new GRect(cx, cy, RECT_WIDTH, RECT_HEIGHT);
		GLabel glabel = new GLabel(label);
		System.out.println(glabel.getWidth());
		System.out.println(glabel.getAscent());
		glabel.setLocation(cx + RECT_WIDTH / 2 - glabel.getWidth() / 2, cy + RECT_HEIGHT / 2 + glabel.getAscent() / 2);
		add(grect);
		add(glabel);
	}	
	
	/*paint a line */
	private void addLine(double x0, double y0, double x1, double y1) {
		GLine gline = new GLine(x0, y0, x1, y1);
		add(gline);
	}
}

