package Contract;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

import Controller.*;
import View.pane;

public class contract extends JFrame{
	private static final long serialVersionUID = 1L;
	private boolean end = false;
	battleFTW fight = new battleFTW();
	JFrame fen = new JFrame();
	private pane pan = new pane();
	JButton but1 = new JButton("Damager");
	JButton but2 = new JButton("Healer");
	JButton but3 = new JButton("Tank");
	Scanner sc = new Scanner(System.in);
	private int testNext = 0;
	
	
	public void start(){
		pan.setBoth("", "");
		build();
		but1.addActionListener(new buttonEventYou(1, fight));
		but2.addActionListener(new buttonEventYou(2, fight));
		but3.addActionListener(new buttonEventYou(3, fight));
		fight.setTestNext(0);
		
		System.out.println("Choisissez votre personnage (damager, healer, tank)"); // Asks you what class you want to play
		
		while (fight.getNext() == fight.getTestNext()){
			System.out.print("");
		}
		
		clean();
		but1.addActionListener(new butEventIa(1, fight));
		but2.addActionListener(new butEventIa(2, fight));
		but3.addActionListener(new butEventIa(3, fight));
		
		fight.setTestNext(1);
		System.out.println("Choisissez le personnage de l'IA (damager, healer, tank)");
		
		while (fight.getNext() == fight.getTestNext()){
			System.out.print("");
		}
		
		// Repeat your choices and give you the stats (hp and ap)
		System.out.println("\nVotre classe est " + fight.getYou().getName() + ". Vos HP sont " + fight.getYou().getHp() + " et vos AP sont " + fight.getYou().getAp() + ".");
		System.out.println("La classe de l'ia est " + fight.getIa().getName() + ". Ses HP sont " + fight.getIa().getHp() + " et ses AP sont " + fight.getIa().getAp() + ".\n");
		
		
		but1.setText("Attack");
		but2.setText("Block");
		but3.setText("Special");
		clean();
		but1.addActionListener(new butEventDance(1, fight));
		but2.addActionListener(new butEventDance(2, fight));
		but3.addActionListener(new butEventDance(3, fight));
		
		pan.setBoth(fight.getSpriteYou(), fight.getSpriteIa());
		build();
		System.out.println("What do you want to do, attack, block or use your special power ?"); // Asks what you want to do
		
		while (fight.getEnd() == fight.getTestEnd()){
			pan.setBoth(fight.getSpriteYou(), fight.getSpriteIa());
			actualise();
		}
	}
	
	public void build(){
		fen.setTitle("Hunger Games of Mother Russia");
		fen.setSize(1000, 500);    
		fen.setLocation(250, 340);
		fen.setResizable(false);
		fen.setContentPane(pan);
		fen.getContentPane().add(but1);
		fen.getContentPane().add(but2);
		fen.getContentPane().add(but3);
		fen.setDefaultCloseOperation(EXIT_ON_CLOSE);
		fen.setVisible(true);
	}
	
	public void actualise(){
		pan.repaint();
	}	
	
		public void clean(){
			ActionListener[] i;
			ActionListener[] j;
			ActionListener[] k;
			i = but1.getActionListeners();
			j = but2.getActionListeners();
			k = but3.getActionListeners();
			but1.removeActionListener(i[0]);
			but2.removeActionListener(j[0]);
			but3.removeActionListener(k[0]);
		} 
}