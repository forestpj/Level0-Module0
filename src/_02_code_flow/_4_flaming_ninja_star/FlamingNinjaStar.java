package _02_code_flow._4_flaming_ninja_star;

import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;

public class FlamingNinjaStar {
	public static void main(String[] args) {

		int baseSize = 200; // the size of the black part of the star
		int flameSize = 130; // the length of the flaming arms

		// Make a new robot, and set it's pen down.
		Robot irrdk = new Robot();
		irrdk.penDown();
		// Set the robot speed to 100
		irrdk.setSpeed(1000000000);
		// Set the robot window size to 800 x 800
		irrdk.setWindowSize(800, 800);
		// Use a for loop to repeat all of the code below ONE time (we will change this
		// later)
		irrdk.hide();
		for (int i = 0; i < 357; i++) {
			// TURN RIGHT Turn the robot 1/8 of a circle (hint: 360 degrees will turn a full
			// circle)
			irrdk.turn(360 / 8);
			// DRAW Move the robot 64 pixels
			irrdk.move(64);
			// TURN LEFT Turn the robot 40 degrees to the LEFT. (Negative numbers will turn
			// the robot counter-clockwise.)
			irrdk.turn(-40);
			// DRAW FLAME Move the robot the distance in the variable flameSize
			irrdk.setPenColor(Color.RED);
			irrdk.move(50);
			irrdk.setPenColor(Color.ORANGE);
			irrdk.move(30);
			irrdk.setPenColor(Color.YELLOW);
			irrdk.move(30);
			// Turn the robot 170 degrees
			irrdk.turn(170);
			// Move the robot the distance in the variable flameSize (again)
			
			irrdk.move(flameSize);
			// TURN RIGHT Turn the robot 64 degrees to the right
			irrdk.turn(64);
			// DRAW Move the robot the distance in the variable baseSize
			irrdk.setPenColor(Color.BLACK);
			irrdk.move(baseSize);
		}
		// TEST Run the program. Check that your shape is the same as the first picture
		// in the recipe.
		// This is one arm of the ninja star.

		// COLOR Change the Robot's pen color so that the flame is a different color to
		// the rest of the star.
		// Run the program again. Check the second picture in the recipe.

		// LOOP When you have one arm looking right, change your for loop to repeat 25
		// times.

	}

}
