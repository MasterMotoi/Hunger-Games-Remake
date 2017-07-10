package Contract;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

import Controller.*;
import View.pane;

public class contract extends JFrame{
	private static final long serialVersionUID = 1L;
	battleFTW fight = new battleFTW(); // Will be use to modify the battleFTW's variables
	JFrame fen = new JFrame(); // The window
	private pane pan = new pane(); // The panel
	JButton but1 = new JButton("Damager"); // Button 1
	JButton but2 = new JButton("Healer"); // Button 2
	JButton but3 = new JButton("Tank"); // Button 3
	
	public void start(){ // Principal method
		pan.setBoth("", ""); // Set the sprites to blank
		build(); // Create the window
		but1.addActionListener(new buttonEventYou(1, fight)); // Adding the action listener to choose your character
		but2.addActionListener(new buttonEventYou(2, fight)); // Same
		but3.addActionListener(new buttonEventYou(3, fight)); // Same
		fight.setTestNext(0); // Set testNext for the next loop
		
		System.out.println("Choisissez votre personnage (damager, healer, tank)"); // Asks you what class you want to play
		
		while (fight.getNext() == fight.getTestNext()){ // Infinite loop to wait you choose your class
			System.out.print(""); 
		}
		
		clean(); // remove the actionListeners on your buttons
		but1.addActionListener(new butEventIa(1, fight)); // Adding the action listener to choose the character of the IA
		but2.addActionListener(new butEventIa(2, fight)); // Same
		but3.addActionListener(new butEventIa(3, fight)); // Same
		
		pan.setBoth(fight.getSpriteYou(), ""); // Give the panel your sprite
		pan.repaint(); // Actualise the window
		
		fight.setTestNext(1); // Set testNext for the next loop
		System.out.println("Choisissez le personnage de l'IA (damager, healer, tank)"); // Asks you what class you want the IA to play
		
		while (fight.getNext() == fight.getTestNext()) { // Infinite class to wait you choose IA's class
			System.out.print("");
		}
		
		// Repeat your choices and give you the stats (hp and ap)
		System.out.println("\nVotre classe est " + fight.getYou().getName() + ". Vos HP sont " + fight.getYou().getHp() + " et vos AP sont " + fight.getYou().getAp() + ".");
		System.out.println("La classe de l'ia est " + fight.getIa().getName() + ". Ses HP sont " + fight.getIa().getHp() + " et ses AP sont " + fight.getIa().getAp() + ".\n");
		
		
		but1.setText("Attack"); // Change the text of your buttons so it's the different actions in fight
		but2.setText("Block");
		but3.setText("Special");
		clean(); // remove the actionListeners on your buttons
		but1.addActionListener(new butEventDance(1, fight)); // Adding the action listener to choose your actions in fight
		but2.addActionListener(new butEventDance(2, fight)); // Same
		but3.addActionListener(new butEventDance(3, fight)); // Same
		
		pan.setBoth(fight.getSpriteYou(), fight.getSpriteIa()); // Give the panel your's and IA's sprite
		System.out.println("What do you want to do, attack, block or use your special power ?"); // Asks what you want to do
		while (fight.getEnd() == false){ // Infinite loop, the code won't exit here
			pan.setBoth(fight.getSpriteYou(), fight.getSpriteIa()); // Give again the sprites to the panel
			pan.repaint(); // Actualise the window
		}
	}
	
	public void build(){ // Create the window
		fen.setTitle("Hunger Games of Mother Russia"); // Name the window
		fen.setSize(1000, 500); // Set the size of the window
		fen.setLocation(250, 340); // Locate the window
		fen.setResizable(false); // Prevent the user for resizing the window
		fen.setContentPane(pan); // Add a panel
		fen.getContentPane().add(but1); // Add a button
		fen.getContentPane().add(but2); // Same
		fen.getContentPane().add(but3); // Same
		fen.setDefaultCloseOperation(EXIT_ON_CLOSE); // quit the app when you click the red cross
		fen.setVisible(true); // Make the window visible
	}
	
		public void clean(){ // Mathod whoch will clean the butons by removing the actionlistener
			ActionListener[] i; // Create a list of action listener
			ActionListener[] j; // A second one
			ActionListener[] k; // And a third one
			i = but1.getActionListeners(); // Take all the actions Listeners on a button (there's always only one here)
			j = but2.getActionListeners(); // Same
			k = but3.getActionListeners(); // Same
			but1.removeActionListener(i[0]); // Remove the first one
			but2.removeActionListener(j[0]); // Same
			but3.removeActionListener(k[0]); // Same
		} 
}