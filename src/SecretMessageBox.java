
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your
 * friend can read it. You set up the passcode and the secret message. Your
 * friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
		String pass = "Ruhanika Dhawan";
		String girl = "Priyankaa is awesome!";// JOptionPane.showInputDialog(null,
												// "What is the secret
												// message?");
		String actor = JOptionPane.showInputDialog(null, "What is the passcode?");
		if (pass.equals(actor)) {
			JOptionPane.showMessageDialog(null, girl);

		} else {
			JOptionPane.showMessageDialog(null, "INTRUDER!!");

		}
	}
	// 1. Set the passcode in a String variable

	// 2. Using a pop-up, ask for a secret message and store it in a variable

	// 3. Ask your friend for the passcode and store it in a variable

	// 4. If the passcode matches, show the secret message

	// 5. If the passcode does not match, pop-up "INTRUDER!!"

	// [optional] 6. Have your friend also enter a username, and make sure it is
	// correct before releasing the secret message.

}
