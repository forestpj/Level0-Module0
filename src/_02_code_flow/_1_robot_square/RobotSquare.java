package _02_code_flow._1_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {

	public static void main(String[] args) {

		// This code makes a new Robot
		Robot octogon = new Robot();

		// Put the robot's pen down so it can draw
		// Use the rob.penDown(); command.
		octogon.penDown();
		// SPEED. Make the robot move quickly.
		// Use the rob.setSpeed(); command.
		octogon.setSpeed(100);

		for (int i = 0; i < 10; i++) {
			// DRAW. Draw a line
			// Use the rob.move(); command
			octogon.move(100);

			// TURN. Turn 90 degrees
			// Use the rob.turn(); command
			octogon.turn(45);
		}

		Robot square = new Robot();

		square.moveTo(450, 370);

		square.penDown();

		square.setSpeed(100);

		for (int i = 0; i < 10; i++) {

			square.move(241);

			square.turn(90);
		}

		// LOOP. Now put the DRAW and TURN code into a for loop to repeat 4 times.
		// Did your Robot draw a square?
		Robot star = new Robot();

		star.moveTo(522, 370);

		star.penDown();

		star.setSpeed(100);

		for (int i = 0; i < 10; i++) {

			star.move(240);
			
			star.turn(135);
		}
	}
}
