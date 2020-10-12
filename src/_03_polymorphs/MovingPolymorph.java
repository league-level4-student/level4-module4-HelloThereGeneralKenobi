package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingPolymorph extends Polymorph{
	
	int angle = 0;
	
	MovingPolymorph(int x, int y, int width, int height) {
		super(x, y,width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect((int)(getX() + Math.cos(angle) * 5), (int)(getY() + Math.sin(angle) * 5), getWidth(), getHeight());
	}
	
	public void update(){
	   	 angle++;
    }
	
}
