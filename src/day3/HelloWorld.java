package day3;

import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello World!!!");
		System.out.println("Hello World!!!");
		String talking = JOptionPane.showInputDialog("What's your name?");
		System.out.println(talking);
		JOptionPane.showInputDialog("Hi " + talking);
	}
}
