package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	
    private int x;
    private int y;
    private int width;
    private int height;
    
    Polymorph(int x, int y,int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    
    int getX() {
		return x;
	}
    
    int getY() {
		return y;
	}
    
    void setX(int x) {
		this.x = x;
	}
    
    void setY(int y) {
		this.y = y;
	}
    
    int getWidth() {
		return width;
	}
    
    void setWidth(int width) {
		this.width = width;
	}
    
    int getHeight() {
		return height;
	}
    
    void setHeight(int height) {
		this.height = height;
	}
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
