package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class butEventIa implements ActionListener{
	battleFTW fight;
	private int nbBut;
	
	public butEventIa(int i, battleFTW j){
		nbBut = i;
		fight = j;
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
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