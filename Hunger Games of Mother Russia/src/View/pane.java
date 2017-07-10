package View;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class pane extends JPanel{
	private static final long serialVersionUID = 1L;
	public String spriteUser; // The Sprite for player's image
	public String spriteFriday; // The sprite for IA's image
	
	public void paintComponent (Graphics g){ // Method use to draw images
		Graphics2D g2d = (Graphics2D) g; // Essential, don't work without
		g2d.drawImage(truc("image/arene.png").getImage(), 0, 0, null); // Draw an arena at the origin point
		g2d.drawImage(truc(spriteUser).getImage(), 40, 250, null); // Draw the player
		g2d.drawImage(truc(spriteFriday).getImage(), 750, 250, null); // Draw the IA
	}
	
	public ImageIcon truc (String path){ // Create temporally an ImageIcon with the right sprite 
		ImageIcon test = new ImageIcon(path);
		return test;
	}

	public void setBoth (String spriteUser, String spriteFriday){ // Set the sprites
		this.spriteUser = spriteUser;
		this.spriteFriday = spriteFriday;
	}
}
