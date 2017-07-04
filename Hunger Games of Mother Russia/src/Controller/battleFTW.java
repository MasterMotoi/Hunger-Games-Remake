package Controller;

import java.util.Scanner;

import Model.*;

public class battleFTW {
	private String choice;
	Scanner sc = new Scanner(System.in);
	player you;
	player ia;
	private boolean end = false;
	jarvis friday = new jarvis();
	
	public void letsDance() {
		System.out.println("Choisissez votre personnage (damager, healer, tank)");
		choice = sc.nextLine();
		you = choix(choice);
		
		System.out.println("Choisissez le personnage de l'IA (damager, healer, tank)");
		choice = sc.nextLine();
		ia = choix(choice);
		
		System.out.println("Votre classe est " + you.getName() + ". Vos HP sont " + you.getHp() + ". Vos AP sont " + you.getAp() + ".");
		System.out.println("La classe de l'ia est " + ia.getName() + ". Ses HP sont " + ia.getHp() + ". Ses AP sont " + ia.getAp() + ".");
		
		while (end == false){
			System.out.println("What do you want to do, attack or block ?");
			choice = sc.nextLine();

			switch (choice) {
			
			case "attack":
				System.out.println("You attack the ennemy");
				ia.setHp(ia.getHp()-1);
				break;
			
			case "block":
				System.out.println("You block the attack of the ennemy");
				you.setHp(you.getHp()-1);
				break;
			}
			
			end = friday.whatNow(you.getHp(), ia.getHp(), "yo");
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
