package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	System.out.println("Hello World!!!");
	Robot sWAG = new Robot();
	sWAG.sparkle();
	sWAG.penDown();
	sWAG.setRandomPenColor();
	sWAG.setSpeed(90);
	
	
	for (int i = 0; i < 4; i++) {
		
	
	sWAG.move(150);
	sWAG.turn(90);

	}
		
	}
}
