package Model;

public class tank implements player{
	protected int hp = 18;
	protected int ap = 2;
	private String name = "Tank"; 
	
	public void special (int apEnnemy) {
		hp = hp + apEnnemy;
		System.out.println("You take no damage\n");
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
