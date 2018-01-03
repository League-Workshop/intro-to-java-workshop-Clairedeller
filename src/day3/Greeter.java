package day3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("Whatis your name?");
	JOptionPane.showMessageDialog(null, " hello "+name);
}
}
