package Model;

public class tank implements player{
	protected int hp = 5;
	protected int ap = 1;
	
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
}
