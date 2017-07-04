package Controller;

public class jarvis {
	private boolean end;
	
	public boolean whatNow (int hpPlay, int hpIa, String action){
		int actionIa = (int)(Math.random() * 2);
		
		switch (actionIa){
			case 0:
				System.out.println("The ennemy attack");
				break;
			
			case 1:
				System.out.println("The ennemy blocked your attack");
				break;
		}
		
		if(hpPlay <= 0){
			end = true;
			System.out.println("You died!");
		}
		if(hpIa <= 0){
			end = true;
			System.out.println("You killed the ennemy!");
		}
		return end;
	}

}
