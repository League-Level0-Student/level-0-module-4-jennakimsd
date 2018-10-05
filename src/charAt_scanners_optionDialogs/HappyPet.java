package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		
	
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet= JOptionPane.showInputDialog("What kind of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
	while(happinessLevel<50) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Give it food", "Walk it", "Buy a toy for it" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if(task==0) {
				giveFood();
			}
			if(task==1) {
				walkPet();
			}
			if(task==2) {
				buyToy();
			}
			
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void giveFood() {
		JOptionPane.showMessageDialog(null, "That's exactly what they needed, they were hungry");
		happinessLevel= happinessLevel+10;
		System.out.println(happinessLevel);
	}
	static void walkPet() {
		JOptionPane.showMessageDialog(null, "They really needed to go to the bathroom");
		happinessLevel= happinessLevel+20;
		System.out.println(happinessLevel);
	}
	static void buyToy() {
		JOptionPane.showMessageDialog(null, "They don't really like the toy");
		happinessLevel= happinessLevel-5;
		System.out.println(happinessLevel);
	}
}
