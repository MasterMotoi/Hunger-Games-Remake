package View;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class pane extends JPanel{
	private static final long serialVersionUID = 1L;
	public String spriteUser;
	public String spriteFriday;
	
	public void paintComponent (Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(truc("image/arene.png").getImage(), 0, 0, null);
		g2d.drawImage(truc(spriteUser).getImage(), 40, 250, null);
		g2d.drawImage(truc(spriteFriday).getImage(), 750, 250, null);
	}
	
	public ImageIcon truc (String path){
		ImageIcon test = new ImageIcon(path);
		return test;
	}

	public void setSpriteUser(String spriteUser) {
		this.spriteUser = spriteUser;
	}

	public void setSpriteFriday(String spriteFriday) {
		this.spriteFriday = spriteFriday;
	}

	public void setBoth (String spriteUser, String spriteFriday){
		this.spriteUser = spriteUser;
		this.spriteFriday = spriteFriday;
	}
}
