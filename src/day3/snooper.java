package day3;

import javax.swing.JOptionPane;

public class snooper {
	public static void main(String[] args) {
		String answers = JOptionPane.showInputDialog("Hi, can I please have your credit card number?");
		System.out.println("Hi, can I please have your credit card number?");
		System.out.println(answers);
		String response = JOptionPane.showInputDialog("Is the number " + answers + " correct?");
		System.out.println("Is the number " + answers + " correct?");
		System.out.println(response);
		String final1 = JOptionPane.showInputDialog("Can you provide me with more information?");
		System.out.println("Can you provide me with more information?");
		System.out.println(final1);
		JOptionPane.showMessageDialog(null, "Very well then.");
		System.out.println("Very well then.");

	}
}
