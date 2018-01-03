package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String bum=JOptionPane.showInputDialog("do you know how to code?");
		// 2. If they say "yes", tell them they will rule the world.
		if(bum.equals("yes"))
			JOptionPane.showMessageDialog(null, "you will assist claire deller in ruling the world");
		// 3. Otherwise, wish them good luck washing dishes.
		else
			JOptionPane.showMessageDialog(null, "good luck scrubbing toilets");

	}

	private static void speak(String string) {
		// TODO Auto-generated method stub
		
	}
}

