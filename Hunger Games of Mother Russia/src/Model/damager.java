package Model;

public class damager implements player{
	protected int hp = 15;
	protected int ap = 3;
	private String name = "Damager"; 
	
	public void special (int apEnnemy) {
		this.ap ++ ;
		System.out.println("You concentrate and gain 1 ap, you now make " + this.ap + " damage.\n");
	}
	
	public int getHp() {
		return hp;
	}
	
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	public int getAp() {
		return ap;
	}
	
	
	public void setAp(int ap) {
		this.ap = ap;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
