package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class butEventDance implements ActionListener{
	battleFTW fight; // Create a battleFTW object but it's null right now
	private int nbBut; // Create an null int
	
	public butEventDance(int i, battleFTW j){ // Complete the variables with the ones furnish in the creation of the object
		nbBut = i;
		fight = j;
	}
	
	
	public void actionPerformed(ActionEvent arg0) { // Call the battle method with the choice of the user
		if (nbBut == 1){
			fight.letsDance("attack");
		}
		
		if (nbBut == 2){
			fight.letsDance("block");
		}
		
		if (nbBut == 3){
			fight.letsDance("special");
		}
		if (fight.getEnd() == true){ // If one of the two fighters is dead, wait 3 seconds and exit the prog 
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.exit(0);
		}
	}
}
