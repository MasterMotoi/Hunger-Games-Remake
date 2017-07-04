package Contract;

import java.util.Scanner;

import Model.*;

public class contract {
	Scanner sc = new Scanner(System.in);
	damager damage = new damager();
	tank tanker = new tank();
	healer heal = new healer();
	
	public void start(){
		System.out.println("La classe Damager a : " + damage.getHp() + " hp et " + damage.getAp() + " ap.");
		System.out.println("La classe tank a : " + tanker.getHp() + " hp et " + tanker.getAp() + " ap.");
		System.out.println("La classe healer a : " + heal.getHp() + " hp et " + heal.getAp() + " ap.");
		String str = sc.nextLine();
		System.out.println("Vous avez tapez : " + str);
	}
}
