package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
	public static void main(String[] args) {
	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
		int randomNum;
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
		randomNum = ran.nextInt(4);   //0-3
;		// 3. Print your variable to the console
        JOptionPane.showMessageDialog(null, randomNum);
		// 4. Get the user to enter something that they think is awesome
        String something = JOptionPane.showInputDialog("Enter something you think is awsome");
		// 5. If your variable is  0
        if(randomNum==0) {
			// -- tell the user whatever they entered is awesome!
        	JOptionPane.showMessageDialog(null, "Thats awsome!");
        }
		// 6. If your variable is  1
        if(randomNum==1)  {
			// -- tell the user whatever they entered is ok.
        JOptionPane.showMessageDialog(null, "Eh, thats ok I guess.");
        }
		// 7. If your variable is  2
        if(randomNum==2)  {
			// -- tell the user whatever they entered is boring.
        JOptionPane.showMessageDialog(null, "Ugh, thats so boring.");
        }
		// 8. If your variable is  3
        if(randomNum==3)  {
			// -- invent your own message to give to the user (be nice).
        	JOptionPane.showMessageDialog(null, "...ok...");
        }
        	
}
}