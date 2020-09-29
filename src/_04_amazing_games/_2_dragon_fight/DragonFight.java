package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random();    //This will be used later to make random numbers. 

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/dragonPicture.jpg");
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);

		// 1. Create some variables to hold health levels
		int playerhealth=100;
			// playerHealth to store your health - set it equal to 100
	
			// dragonHealth to store the dragon's health - set it equal to 100
		int dragonhealth=100;
		// 2. Create some variables to hold the attack strengths. These will be given different values later. 
		
			// playerAttack to store the damage the player's attack will do - set it equal
			// to 0 for now.
		int playerattack=0;
			// dragonAttack to store the damage the dragon's attack will do - set it equal
			// to 0 for now.
		int dragonattack=0;
		
		//  This while statement will cause the game to repeat until the player or dragon run out of health
		while (true) {

			// THE PLAYER ATTACKS THE DRAGON

				// 3. Ask the player in a pop-up if they want to attack the dragon with a yell
				// or a kick
			String input = JOptionPane.showInputDialog(null, "do you want to yell or kick at the dragon?");
				// 4. If they typed in "yell":
		if(input.equals("yell")) {
					// -- Find a random number between 0 and 10 and store it in playerAttack. Use
					// ran.nextInt(10)
				playerattack = ran.nextInt(10);
					// -- Subtract the player attack value from the dragon's health
				dragonhealth-=playerattack;
			}
				// 5. If they typed in "kick":
				if(input.equals("kick")) {
					// -- Find a random number between 0 and 25 and store it in playerAttack.
				playerattack=ran.nextInt(25);
					// -- Subtract the player attack value from the dragon's health
				
				dragonhealth-=playerattack;
		}
			// THE DRAGON RETALIATES

				// 6. Find a random number between 0 and 35 and store it in dragonAttack
				dragonattack=ran.nextInt(35);
				// 7. Subtract the dragon attack value from the player's health
				playerhealth-=dragonattack;
			// ASSESS THE DAMAGE CAUSED 
				
				// 8. If the player's health is less than or equal to 0
				// call the playerLost() method
				if (playerhealth <= 0) {
					playerLost();
				}
				// 9. Else if the dragon's health is less than or equal to 0
				// call the dragonLost() method
				else if (dragonhealth <= 0){
					dragonLost();
					
				}
			
			// 10.  Pop up a message that tells the player the health levels of player and
			// 		dragon.
				JOptionPane.showMessageDialog(null, "you have done " + playerattack + " damage to the dragon");
				
				JOptionPane.showMessageDialog(null, "the dragon now has " + dragonhealth + " health");
				
				JOptionPane.showMessageDialog(null, "the dragon has attacked! you've taken " + dragonattack + " health");
				
				JOptionPane.showMessageDialog(null, "you now have "+ playerhealth + " health");
				
			// (Bonus: Also display the amount of health that was lost by each in this
			// round)
		}
	}

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no
		// treasure

		JOptionPane.showMessageDialog(null, "You have been defeated by the dragon and have no treasure");
		
		System.exit(0); // This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of
		// gold!
		JOptionPane.showMessageDialog(null, "you have defeted the dragon! You now have a ton of treasure!");
		System.exit(0); // This code ends the program
	}

}
