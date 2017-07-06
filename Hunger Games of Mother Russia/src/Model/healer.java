package Model;

public class healer implements player{
	protected int hp = 12; // The hp (health point) are your life you have left.
	protected int ap = 3; // The ap (attack point) are the damage you'll make when you attack
	protected int dp = 1; // The dp (defense point) are the damage you'll take when you block an attack
	private String name = "Healer";  // name is the name of the class
	private String Sprite = "/healer.png";
	
	public void special (){
		if (hp<=5){ // The healer can heal himself only if he have 5 hp left or less
			System.out.println("You regain 3 hp.\n"); // The user is warned
			hp = hp + 3; // If he can, the healer give himself 3 hp back
		}
		
		else{
			System.out.println("You're in too good shape.\n"); // The user is warned
		}
	}
	
	/*
	 * 
	 * Getters and Setters
	 * 
	 */
	
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
	
	public String getSprite() {
		return Sprite;
	}

	public void setSprite(String sprite) {
		Sprite = sprite;
	}
	
	/*
	 * 
	 * 'Till here
	 * 
	 */
}
