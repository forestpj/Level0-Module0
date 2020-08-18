package _02_code_flow._2_robot_spiral;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */


import org.jointheleague.graphical.robot.Robot;

public class RobotSpiral {

	public static void main(String[] args) {
		
		// Create a new Robot
		Robot idk = new Robot();
		// Set your robot's pen down 
		idk.penDown();
		// SPEED. Set the robot to go at max speed (100)
		idk.setSpeed(1000000000);
        // LOOP. Use a for loop to repeat ALL the following lines of code 50 times. 
		for (int i = 0; i < 1000000000; i++) {
				// Change the robot pen color to random
		idk.setRandomPenColor();
				// DRAW.    Move the robot (5*i) pixels
				//          "i" is the variable in the for loop	
		idk.move(2*i);
				// TURN.    Turn the robot (360/7) degrees to the right
		idk.turn(720/5);
				// Change the robot pen width to (i)
        idk.setPenWidth(i);
		}
		// Check the pattern against the picture in the recipe. If it matches, you are done!
		
	}
}
