package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class butEventIa implements ActionListener{
	battleFTW fight; // Create a battleFTW object but it's null right now
	private int nbBut; // Create an null int
	
	public butEventIa(int i, battleFTW j){ // Complete the variables with the ones furnish in the creation of the object
		nbBut = i;
		fight = j;
	}
	
	
	public void actionPerformed(ActionEvent arg0) { // Use the creation character's method with the choice of the user
		if (nbBut == 1){
			fight.choixIa("damager");
		}
		
		if (nbBut == 2){
			fight.choixIa("healer");
		}
		
		if (nbBut == 3){
			fight.choixIa("tank");
		}
		fight.setNext(2);
	}
}