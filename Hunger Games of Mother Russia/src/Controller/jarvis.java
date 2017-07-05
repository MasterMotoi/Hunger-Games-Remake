package Controller;

public class jarvis {
	private boolean end;
	private int hpPlayer;
	private int hpFriday;
	
	public boolean whatNow (int hpPlay, int apPlay, int hpIa, int apIa, String action){
		int actionIa = (int)(Math.random() * 2);
		String testAction = "attack";
		
		switch (actionIa){
			case 0:
				System.out.println("The ennemy attack\n");
				testAction = "block";
				if (action.equals(testAction)){
					apIa = 1;
					System.out.println("lol");
				}
				testAction = "attack";
				hpPlay = hpPlay - apIa;
				break;
			
			case 1:
				testAction = "attack";
				if (action.equals(testAction)){
					apPlay = 1;
				}
				System.out.println("The ennemy blocked your attack\n");
				break;
		}
		
		if (action.equals(testAction)){
			hpIa = hpIa - apPlay;
		}
		
		System.out.println("You have " + hpPlay + " HP left.");
		System.out.println("The ennemy have " + hpIa + " HP left.\n");
		hpPlayer = hpPlay;
		hpFriday = hpIa;

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

	public int getHpPlayer() {
		return hpPlayer;
	}

	public void setHpPlayer(int hpPlayer) {
		this.hpPlayer = hpPlayer;
	}

	public int getHpFriday() {
		return hpFriday;
	}

	public void setHpFriday(int hpFriday) {
		this.hpFriday = hpFriday;
	}

}
