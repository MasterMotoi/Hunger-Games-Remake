package Model;

public class healer implements player{
	protected int hp = 12;
	protected int ap = 3;
	protected int dp = 1;
	private String name = "Healer"; 
	
	public void special (int apEnnemy){
		if (hp<=5){
			System.out.println("You regain 3 hp.\n");
			hp = hp + 3;
		}
		
		else{
			System.out.println("You're in too good shape.\n");
		}
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
