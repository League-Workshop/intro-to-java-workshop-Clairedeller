package day2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot sWAG = new Robot();
		
		// 5. Set your robot's pen to the down position
		sWAG.penDown();
		// 3. Set the robot to go at max speed (10)
		sWAG.setSpeed(1000);
		// 4. Do the following (steps 6-8) 75 times
		for (int i = 0; i < 125; i++) {
			// 7. Change the pen color to random
		sWAG.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
			sWAG.move(i*5);
			// 2. Turn the robot 1/7 of 360 degrees to the right
		sWAG.turn(90);
			// 8. Set the pen width to i
		sWAG.setPenWidth(i);
		}
	}
}

