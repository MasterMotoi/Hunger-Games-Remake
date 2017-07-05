package Controller;

import Model.player;

public class jarvis {
	private boolean end;
	
	public boolean whatNow (String action, player friday, player you){
		String testAction = "Tank";
		int actionIa;
		if (friday.getName().equals(testAction)){
			 actionIa = (int)(Math.random() * 2);
		}
		
		else {
			 actionIa = (int)(Math.random() * 3);
		}
		
		testAction = "attack";
		
		
		switch (actionIa){
			case 0:
				System.out.println("The ennemy attack\n");
				testAction = "block";
				if (action.equals(testAction)){
					you.setHp(you.getHp() - you.getDp());
				}
				
				else{
					you.setHp(you.getHp() - friday.getAp());
				}
				
				break;
			
			case 1:
				testAction = "attack";
				if (action.equals(testAction)){
					friday.setHp(friday.getHp() - friday.getDp());;
				}
				System.out.println("The ennemy blocked your attack\n");
				break;
			
			case 2:
				System.out.println("The ennemy uses his special power.");
				friday.special(you.getAp());
				break;
				
		}
		
		testAction = "attack";
		
		if (action.equals(testAction)){
			friday.setHp(friday.getHp() - you.getAp());
		}
		
		System.out.println("You have " + you.getHp() + " HP left.");
		System.out.println("The ennemy have " + friday.getHp() + " HP left.\n");
		
		if(you.getHp() <= 0){
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
