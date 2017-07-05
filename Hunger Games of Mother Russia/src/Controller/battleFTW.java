package Controller;

import java.util.Scanner;
import Model.*;

public class battleFTW {
	private String choice; // This variable will take everything the user will write in the console
	Scanner sc = new Scanner(System.in); // Essential if you want to make a Scanner
	player you; // Create an object for your class even if the code don't know what you'll play
	player ia; // Create an object for the class of the ia even if the code don't know what he'll play
	private boolean end = false; // Will be use to terminate the program when needed
	jarvis friday = new jarvis(); // Create the ia
	
	public void initiation() { // Method which will let you choose the classes
		System.out.println("Choisissez votre personnage (damager, healer, tank)"); // Asks you what class you want to play
		choice = sc.nextLine(); // Read your answer
		you = choix(choice); // Execute the method which will load the class
		
		// Same for the ia
		System.out.println("Choisissez le personnage de l'IA (damager, healer, tank)");
		choice = sc.nextLine();
		ia = choix(choice);
		
		// Repeat your choices and give you the stats (hp and ap)
		System.out.println("\nVotre classe est " + you.getName() + ". Vos HP sont " + you.getHp() + " et vos AP sont " + you.getAp() + ".");
		System.out.println("La classe de l'ia est " + ia.getName() + ". Ses HP sont " + ia.getHp() + " et ses AP sont " + ia.getAp() + ".\n");
	}
		
	public boolean letsDance(){ // Method which let you choose your action (attack, block or special)
		System.out.println("What do you want to do, attack, block or use your special power ?"); // Asks what you want to do
		choice = sc.nextLine(); // Read your answer

		switch (choice) { // test your answer
		
		// If you want to attack or block, the system will just print your choice and save your answer for now
		
		case "attack": 
			System.out.println("You attack the ennemy");
			break;
		
		case "block":
			System.out.println("You block the attack of the ennemy");
			break;
			
		case "special": // If you want to execute the special attack
			you.special(); // The System will execute the Special attack of your class 
			break;
			
		case "exit": // Hiden command to terminate the programm
			System.out.println("Everybody dies, time to stop now");
			you.setHp(0); // Do this by setting your's and your ennemy's hp at 0 --
			ia.setHp(0); // -- no winner
			break;
		}
		
		end = friday.whatNow(choice, ia, you); // Launch the ia
		return end; // Return end to the contract in order to know if the program has to stop
	}
	
	private player choix (String i){ // Method which load the class you chosen
		player dude; // Create an object with the interface player
		switch (i){ // Test your answer
		
		case "damager": // If you want the damager
			dude = new damager(); // The object will be a damager 
			break;
			
		case "healer": // Same
			dude = new healer();
			break;
			
		case "tank": // Same
			dude = new tank();
			break;
		
		default: // If your answer doesn't match with a class (because you made a typo for example) the default class is damager
			System.out.println("Votre choix n'est pas valide, le choix par défaut est Damager"); // Warn the player
			dude = new damager();
		}
		return dude; // Return the object with the right class
		
	}
	public String getYou() { // Setters for the name of your class and the ia's. Will be useful for the design
		return you.getSprite();
	}
	public String getIa() {
		return ia.getSprite();
	}
}
