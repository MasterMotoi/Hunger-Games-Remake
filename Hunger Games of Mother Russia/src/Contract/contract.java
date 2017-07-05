package Contract;

import Controller.*;

public class contract {
	private boolean end = false;
	battleFTW fight = new battleFTW();
	
	public void start(){
		fight.initiation();
		while (end == false){
			end = fight.letsDance();
		}
	}
}
