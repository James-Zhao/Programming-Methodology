package assignment1;

/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	// You fill in this part
	/*
	 * idea:依次在街的两端开始放方块，然后检查空余的位置是否小于2 循环这个操作直到空余的位置小于2。有2个空格的话选择一个，
	 * 在这个位置放置2个方块，然后再每个位置执执行pickbeeper（）； 最后将karel移动到剩下的方块上。
	 */
	public void run() {
		while (noBeepersPresent() && frontIsClear()) {
			putEachSide();
			move();

		}
		turnAround();
		move();
		putBeeper();
		cleanOther();
		moveToStone();
		while (beepersPresent()) {
			pickBeeper();
		}
		putBeeper();
	}

	private void putEachSide() {
		while (notFacingEast()) {
			turnLeft();
		}
		moveToBlank();
		putNextSite();
		while (notFacingWest()) {
			turnLeft();
		}
		moveToBlank();
		putNextSite();
	}

	/*
	 * Move Karel to near the diamonds.
	 */
	private void moveToBlank() {
		move();
		while (noBeepersPresent() && frontIsClear()) {
			move();
		}
	}

	/* put beeper on the next site near the middle site */
	private void putNextSite() {
		turnAround();
		move();
		putBeeper();
	}

	/* 清除其它位置的方块，留下中间的 */
	private void cleanOther() {
		moveToWall();
		turnAround();
		while (frontIsClear()) {
			if (beepersPresent()) {
				pickBeeper();
			}
			move();
		}
		if (beepersPresent()) {
			pickBeeper();
		}
	}

	/* 移动karel到中间的方块上 */
	private void moveToStone() {
		turnAround();
		while (noBeepersPresent()) {
			move();
		}
	}

	private void moveToWall() {
		while (frontIsClear()) {
			move();
		}
	}

}
