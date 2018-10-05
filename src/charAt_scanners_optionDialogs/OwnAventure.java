package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class OwnAventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"You are lost in a forest, and you must find your way back to your house using your sense of direction");
		String player = JOptionPane.showInputDialog("What will your name be?");
		JOptionPane.showMessageDialog(null, "Ok, " + player
				+ ". You are roaming through the forest when you come across a split in the path you are following. You can either walk through the forest (straight) or keep on the path you are on going either left or right.");
		int choice= JOptionPane.showOptionDialog(null, "Which way do you want to go?", "Choose", 0, JOptionPane.INFORMATION_MESSAGE, null, new String []{"Straight","Right","Left"}, null);
		int choice2 = 0;
		int choice3 = 0;
		int answer = 1;

		choice = JOptionPane.showOptionDialog(null, "Which way do you want to go?", "Choose", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Straight", "Right", "Left" }, null);
		if (choice == 0) {
			while (answer == 1 && choice == 0) {
				answer = JOptionPane.showConfirmDialog(null, "Are you sure?");
				if (answer == 0) {
					JOptionPane.showMessageDialog(null,
							"I'm sorry, but that is not the way to your house. Please try again.");
				} else {
					choice = JOptionPane.showOptionDialog(null, "Which way do you want to go?", "Choose", 0,
							JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Straight", "Right", "Left" }, null);
				}

			}
		}
		if (choice == 1) {
			JOptionPane.showMessageDialog(null,
					"The sun is setting and you need to find shelter quickly. Will you keep going or stop to find a place to sleep?");
			choice2 = JOptionPane.showOptionDialog(null, "What do you want to do?", "Pick", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Keep Going", "Stop" }, null);
			if (choice2 == 1) {
				JOptionPane.showMessageDialog(null,
						"You come across a cave and an area of flat land. Are you going to sleep on the ground or in the cave?");
				choice3 = JOptionPane.showOptionDialog(null, "Where will you sleep?", "sleep", 0,
						JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Cave", "Ground" }, null);
			}
			if (choice2 == 0) {
				JOptionPane.showMessageDialog(null,
						"You kept on going, but eventually felt sleepy. You soon fell asleep, and when you woke up you were in a cave about to be a bear's dinner");
			}
			if (choice3 == 0) {
				JOptionPane.showMessageDialog(null,
						"You soon fell asleep in the cave, and when you woke up you were about to be a bear's dinner");
				JOptionPane.showMessageDialog(null, "Did you get the ending you were hoping for?");
			}
			if (choice3 == 1) {
				JOptionPane.showMessageDialog(null,
						"You soon fell asleep, and when you woke up you could see your house. You ran all the way into your house, past your parents' worried faces and plopped down onto the couch like nothing had happened.");
			}
		}
		if (choice == 2) {
			JOptionPane.showMessageDialog(null,
					"The sun is setting and you need to find shelter quickly. Will you keep going or stop to find a place to sleep?");
			choice2 = JOptionPane.showOptionDialog(null, "What do you want to do?", "Pick", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Keep Going", "Stop" }, null);}
			if (choice2 == 1) {
				JOptionPane.showMessageDialog(null,
						"You come across a cave and an area of flat land. Are you going to sleep on the ground or in the cave?");
			}
			choice3 = JOptionPane.showOptionDialog(null, "Where will you sleep?", "sleep", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Cave", "Ground" }, null);
			if (choice2 == 0) {
				JOptionPane.showMessageDialog(null,
						"You kept on going, but eventually felt sleepy. You soon fell asleep, and when you woke up you were in a cave about to be a bear's dinner");
			}
			if (choice3 == 0) {
				JOptionPane.showMessageDialog(null,
						"You soon fell asleep in the cave, and when you woke up you were about to be a bear's dinner");
				JOptionPane.showMessageDialog(null, "Did you get the ending you were hoping for?");
			}
			if (choice3 == 1) {
				JOptionPane.showMessageDialog(null,
						"You soon fell asleep, and when you woke up you could see your house. You ran all the way into your house, past your parents' worried faces and plopped down onto the couch like nothing had happened.");
				JOptionPane.showMessageDialog(null, "Did you get the ending you were hoping for?");
			}
		}



}

