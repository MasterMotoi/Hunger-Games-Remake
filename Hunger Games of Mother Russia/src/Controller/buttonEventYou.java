package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttonEventYou implements ActionListener{
	battleFTW fight;
	private int nbBut;
	
	public buttonEventYou(int i, battleFTW j){
		nbBut = i;
		fight = j;
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		if (nbBut == 1){
			fight.choix("damager");
		}
		
		if (nbBut == 2){
			fight.choix("healer");
		}
		
		if (nbBut == 3){
			fight.choix("tank");
		}
		fight.setNext(1);
	}
}