package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class butEventDance implements ActionListener{
	battleFTW fight;
	private int nbBut;
	
	public butEventDance(int i, battleFTW j){
		nbBut = i;
		fight = j;
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		if (nbBut == 1){
			fight.letsDance("attack");
		}
		
		if (nbBut == 2){
			fight.letsDance("block");
		}
		
		if (nbBut == 3){
			fight.letsDance("special");
		}
		fight.setNext(2);
	}
}
