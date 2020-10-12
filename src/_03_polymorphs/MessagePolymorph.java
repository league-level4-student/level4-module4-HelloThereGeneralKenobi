package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class MessagePolymorph extends Polymorph{
	
	int angle = 0;
	
	MessagePolymorph(int x, int y, int width, int height) {
		super(x, y,width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update(){
	   	 if((getX() + getWidth()) > PolymorphWindow.mouseClickedX && PolymorphWindow.mouseClickedX > getX()) {
	   		if((getY() + getHeight()) > PolymorphWindow.mouseClickedY && PolymorphWindow.mouseClickedY > getY()) {
		   		 JOptionPane.showMessageDialog(null, "hello");
		   	 } 
	   	 }
    }
	
}
