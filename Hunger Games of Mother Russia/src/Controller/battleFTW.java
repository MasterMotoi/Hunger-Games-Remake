package Controller;

import java.util.Scanner;

import Model.*;

public class battleFTW {
	private int choice;
	private String action;
	Scanner sc = new Scanner(System.in);
	player you;
	player ia;
	private boolean end = false;

	
	public void letsDance() {
		System.out.println("Choisissez votre personnage (1 = damager, 2 = healer, 3 = tank)");
		
		choice = sc.nextInt();
		you = choix(choice);
		
		System.out.println("Choisissez le personnage de l'IA (1 = damager, 2 = healer, 3 = tank)");
		
		choice = sc.nextInt();
		ia = choix(choice);
		
		System.out.println("Votre classe est " + you.getName() + ". Vos HP sont " + you.getHp() + ". Vos AP sont " + you.getAp() + ".");
		System.out.println("La classe de l'ia est " + ia.getName() + ". Vos HP sont " + ia.getHp() + ". Vos AP sont " + ia.getAp() + ".");
		
		while (end == false){
			System.out.println("What do you want to do, attack or block or kill enemy or suicide?");
			action = sc.nextLine();

			switch (action) {
			
			case "attack":
				System.out.println("You attack the ennemy");
				ia.setHp(ia.getHp()-1);
				break;
			
			case "block":
				System.out.println("You block the attack of the ennemy");
				you.setHp(you.getHp()-1);
				break;
			}
			
			if(you.getHp() <= 0 || ia.getHp() <= 0){
				end = true;
			}
		}
	}
	private player choix (int i){
		player dude;
		switch (i){
		
		case 1:
			dude = new damager();
			break;
			
		case 2:
			dude = new healer();
			break;
		case 3:
			dude = new tank();
			break;
		
		default:
			System.out.println("Votre choix n'est pas valide, le choix par défaut est Damager");
			dude = new damager();
		}
		return dude;
		
	}
}
