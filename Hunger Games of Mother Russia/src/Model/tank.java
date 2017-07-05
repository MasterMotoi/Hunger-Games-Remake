package Model;

public class tank implements player{
	protected int hp = 18;
	protected int ap = 2;
	protected int dp = 0;
	private String name = "Tank"; 
	
	public void special (int apEnnemy) {
		System.out.println("Nothing to see here, but you take no damage when you block\n");
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
	
	public int getDp(){
		return dp;
	}
}
