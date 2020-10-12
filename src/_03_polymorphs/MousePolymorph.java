package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MousePolymorph extends Polymorph{
	
	int angle = 0;
	
	MousePolymorph(int x, int y, int width, int height) {
		super(x, y,width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(PolymorphWindow.mouseX,PolymorphWindow.mouseY, getWidth(), getHeight());
	}
	
}
