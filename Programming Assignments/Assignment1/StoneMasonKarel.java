package assignment1;

/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	// You fill in this part
	 public void run() {
         turnLeft();
         while(true){
             fixLine();
         }
     }

     private void fixLine() {
         while(frontIsClear()){
             if(noBeepersPresent()) {
                 putBeeper();
             }
             move();
         }        
         if(facingNorth()) {
             turnRight();
             if(noBeepersPresent()) {
                 putBeeper();
             }
             if(frontIsClear()) {
                 move4Steps();
                 turnLeft();
                 while(frontIsClear()) {
                     move();
                 }
                 turnRight();
                 turnRight();
             }
         }else if (facingSouth()){
                 turnLeft();
                 if(noBeepersPresent()) {
                     putBeeper();
                 }
                 if(frontIsClear()) {
                     move4Steps();
                     turnRight();
                     while(frontIsClear()) {
                         move();
                     }
                         turnLeft();
                         turnLeft();    
                 }
             }
     }

     private void move4Steps() {
         move();
         move();
         move();
         move();
     }

}
