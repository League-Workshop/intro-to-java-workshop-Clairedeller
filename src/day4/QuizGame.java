package day4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0; 
		// 2.  Ask the user a question 
		String number=JOptionPane.showInputDialog("on a scale of 1-10 how cool is claire deller?");
		// 3.  Use an if statement to check if their answer is correct
		if(number.equals("11")) {
		// 4.  if the user's answer is correct
			JOptionPane.showMessageDialog(null,"correct");
		// -- add one to their score 
		score++;} 
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String name =JOptionPane.showInputDialog("Who is the coolest person to ever live?"); 
		if(name.equals("claire deller")) {
			JOptionPane.showMessageDialog(null,"correct");
		score++;}
		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "You scored 2!!!!!!!!!!!");
	}
}
