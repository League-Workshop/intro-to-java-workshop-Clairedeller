package day3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("spell claire is cool beans");
		// 2. Catch the user's answer in a String
String word = JOptionPane.showInputDialog("type the sentence ");
		// 3. If the user spelled the word correctly, speak "correct"
if(word.equals("claire is cool beans"))
speak("correct");
		// 4. Otherwise say "wrong"
else
speak("wrong");
		// 5. repeat the process for other words
speak("spell weenie");
// 2. Catch the user's answer in a String
word = JOptionPane.showInputDialog("type the sentence ");
// 3. If the user spelled the word correctly, speak "correct"
if(word.equals("weenie"))
speak("correct");
// 4. Otherwise say "wrong"
else
speak("wrong");

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say "+ words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
	}

}
	}




