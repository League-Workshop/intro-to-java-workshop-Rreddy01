package day3;

import javax.swing.JOptionPane;

public class knockknock {
	public static void main(String[] args) {
		String response = JOptionPane.showInputDialog("Knock Knock");
		if (response.equals("who's there?")) {
			String response2 = JOptionPane.showInputDialog("A broken pencil");
			if (response2.equals("A broken pencil who?")) {
				JOptionPane.showMessageDialog(null, "Never mind, it's pointless");
				speak("hahahahahahahahahahahahaha");
			} else {
				JOptionPane.showMessageDialog(null, "That's not correct, let's try gain.");
			}

		} else {
			JOptionPane.showMessageDialog(null, "That's not correct, let's try gain.");
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
