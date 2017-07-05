package Model;

public class damager implements player{
	protected int hp = 15; // The hp (health point) are your life you have left.
	protected int ap = 3; // The ap (attack point) are the damage you'll make when you attack
	protected int dp = 1; // The dp (defense point) are the damage you'll take when you block an attack
	private String name = "Damager"; // name is the name of the class
	private String Sprite = "image/damager.png";
	
	public void special () {
		this.ap ++ ; // Pass 1 turn, but gain 1 ap
		System.out.println("You concentrate and gain 1 ap, you now make " + this.ap + " damage.\n"); // The user is warned
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
