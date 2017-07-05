package Controller;

import Model.player;

public class jarvis {
	private boolean end; // Same utility than 'end' in battleFTW
	
	public boolean whatNow (String action, player friday, player you){ // Method which will allow the ia to choose his action
		String testAction = "Tank"; // Create a String we will use a lot to test other string
		int actionIa; // If the ia is a Tank, forbid him to use his special attack. The purpose is to prevent him from useless turns
		if (friday.getName().equals(testAction)){ // If the name of the ia's class is Tank
			 actionIa = (int)(Math.random() * 2); // His random will be between 0 or 1
		}
		
		else {
			 actionIa = (int)(Math.random() * 3); // Else, his random will be between 0, 1 and 2
		}
		
		testAction = "attack"; // Will be use to test if you attacked
		
		
		switch (actionIa){ // Test ia's action
			case 0:  // 0, the enemy attack
				System.out.println("The enemy attack\n"); // Warns the user
				testAction = "block"; // Will be use to test if you block
				if (action.equals(testAction)){ // If you block
					System.out.println("You blocked the enemy's attack."); // Warns the user
					you.setHp(you.getHp() - you.getDp()); // You loose as much hp as your dp
				}
				
				else{
					you.setHp(you.getHp() - friday.getAp()); // Else, you loose as much hp as your enemy's ap
				}
				
				break;
			
			case 1: // 1, the enemy block
				if (action.equals(testAction)){ // If you attacked
					friday.setHp(friday.getHp() - friday.getDp()); // The enemy loose as much hp as his dp
					action = ""; // Prevent you from attack a second time
				}
				System.out.println("The enemy blocked your attack\n"); // Warns the user
				break;
			
			case 2: // 2, the enemy use his special power if he isn't a tank
				System.out.println("The enemy uses his special power."); // Warns the user
				friday.special(); // Execute ia's special attack
				break;
				
		}
		
		testAction = "attack"; // Reset testAction
		
		if (action.equals(testAction)){ // If you attacked
			friday.setHp(friday.getHp() - you.getAp()); // The enemy loose as much hp as your ap
		} // Nota Bene : if the enemy blocked your attack, this won't be executed because 'action = "";'
		
		System.out.println("You have " + you.getHp() + " HP left."); // Warns the user
		System.out.println("The ennemy have " + friday.getHp() + " HP left.\n"); // Warns the user
		
		if(you.getHp() <= 0){ // If you or the ia has no hp left, warn the system that the fight is over by setting 'end' on true and tell who died ?
			end = true;
			System.out.println("You died!");
		}
		if(friday.getHp() <= 0){
			end = true;
			System.out.println("You killed the ennemy!");
		}
		return end;
	}

}
