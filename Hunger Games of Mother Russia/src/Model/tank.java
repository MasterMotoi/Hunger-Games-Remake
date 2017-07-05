package Model;

public class tank implements player{
	protected int hp = 18; // The hp (health point) are your life you have left.
	protected int ap = 2; // The ap (attack point) are the damage you'll make when you attack
	protected int dp = 0; // The dp (defense point) are the damage you'll take when you block an attack
	private String name = "Tank";  // name is the name of the class
	private String Sprite = "image/tank.png";
	
	public void special () {
		System.out.println("Nothing to see here, but you take no damage when you block\n"); // The special does nothing cause it's passive. The tank take no damage when he block an attack
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
