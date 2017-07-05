package Model;

// This is the interface for every class. It allow the program to create an object without knowing what class you or the ia will play 

public interface player {
	public void special(); // Defines the special attack 
	public int getHp(); // Setters and getters
	public void setHp(int hp); // Same
	public int getAp(); // Same
	public void setAp(int ap); // Same
	public String getName(); // Same
	public void setName(String name); // Same
	public int getDp(); // Same
}