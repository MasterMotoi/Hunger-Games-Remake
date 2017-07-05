package Contract;

import javax.swing.JFrame;

import Controller.*;
import View.pane;

public class contract extends JFrame{
	private static final long serialVersionUID = 1L;
	private boolean end = false;
	battleFTW fight = new battleFTW();
	JFrame fen = new JFrame();
	pane pan = new pane();
	
	
	public void start(){
		fight.initiation();
		pan.setBoth(fight.getYou(), fight.getIa());
		build();
		while (end == false){
			end = fight.letsDance();
		}
	}
	
	public void build(){
		fen.setTitle("g.draw sucks");
		fen.setSize(1000, 500);    
		fen.setLocation(250, 340);
		fen.setResizable(false);
		fen.setContentPane(pan);
		fen.setDefaultCloseOperation(EXIT_ON_CLOSE);
		fen.setVisible(true);
	}
}
