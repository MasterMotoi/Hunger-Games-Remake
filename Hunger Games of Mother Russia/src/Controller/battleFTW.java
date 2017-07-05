package Controller;

import java.util.Scanner;

import Model.*;

public class battleFTW {
	private String choice;
	Scanner sc = new Scanner(System.in);
	player you;
	player ia;
	boolean speDone = false;
	private boolean end = false;
	jarvis friday = new jarvis();
	
	public void letsDance() {
		System.out.println("Choisissez votre personnage (damager, healer, tank)");
		choice = sc.nextLine();
		you = choix(choice);
		
		System.out.println("Choisissez le personnage de l'IA (damager, healer, tank)");
		choice = sc.nextLine();
		ia = choix(choice);
		
		System.out.println("\nVotre classe est " + you.getName() + ". Vos HP sont " + you.getHp() + " et vos AP sont " + you.getAp() + ".");
		System.out.println("La classe de l'ia est " + ia.getName() + ". Ses HP sont " + ia.getHp() + " et ses AP sont " + ia.getAp() + ".\n");
		
		while (end == false){
			System.out.println("What do you want to do, attack, block or use your special power ?");
			choice = sc.nextLine();

			switch (choice) {
			
			case "attack":
				System.out.println("You attack the ennemy");
				break;
			
			case "block":
				System.out.println("You block the attack of the ennemy");
				break;
				
			case "special":
				you.special(ia.getAp());
				break;
				
			case "exit":
				System.out.println("Everybody dies, time to stop now");
				you.setHp(0);
				ia.setHp(0);
				break;
			}
			
			end = friday.whatNow(choice, ia, you);
		}
	}
	private player choix (String i){
		player dude;
		switch (i){
		
		case "damager":
			dude = new damager();
			break;
			
		case "healer":
			dude = new healer();
			break;
		case "tank":
			dude = new tank();
			break;
		
		default:
			System.out.println("Votre choix n'est pas valide, le choix par défaut est Damager");
			dude = new damager();
		}
		return dude;
		
	}
}
