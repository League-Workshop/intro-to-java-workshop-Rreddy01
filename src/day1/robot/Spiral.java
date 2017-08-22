package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot r2d2 = new Robot();
		// 5. Set your robot's pen to the down position
		r2d2.penDown();
		// 3. Set the robot to go at max speed (10)
		r2d2.setSpeed(10);
		// 4. Do the following (steps 6-9) 75 times

		// 7. Change the pen color to random

		// 6. Move the robot 5 times the current line number you are drawing (5*i)
		for (int i = 0; i < 75; i++) {
			r2d2.move(1 * i);
			r2d2.setRandomPenColor();
			// 2. Turn the robot 1/3 of 360 degrees to the right
			r2d2.turn(360 / 10);
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)

			// 9. Set the pen width to i
			r2d2.setPenWidth(i);
		}
	}
}
