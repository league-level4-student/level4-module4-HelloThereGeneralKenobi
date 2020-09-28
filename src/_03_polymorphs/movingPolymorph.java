package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class movingPolymorph extends Polymorph{
	
	movingPolymorph(int x, int y, int width, int height) {
		super(x, y,width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update(){
	   	 setY(getY() - 1);
    }
	
}
