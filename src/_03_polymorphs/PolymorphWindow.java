package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener, MouseMotionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    ArrayList<Polymorph> morphList = new ArrayList<Polymorph>();
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 Polymorph bluePoly = new BluePolymorph(50, 50, 100, 100);
   	 Polymorph redPoly = new RedPolymorph(200, 200, 100, 100);
   	 Polymorph movingMorph = new MovingPolymorph(350, 350, 100, 100);
   	 Polymorph mouseMorph = new MousePolymorph(100, 350, 100, 100);
   	 Polymorph messageMorph = new MessagePolymorph(200, 350, 100, 100);
   	 
   	 morphList.add(bluePoly);
   	 morphList.add(redPoly);
   	 morphList.add(movingMorph);
   	 morphList.add(mouseMorph);
     //morphList.add(messageMorph);
   	 
   	 window.addMouseListener(this);
   	 window.addMouseMotionListener(this);

   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public static int mouseX;
    public static int mouseY;
    
    public static int mouseClickedX;
    public static int mouseClickedY;
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for(int i = 0; i < morphList.size(); i++) {
   		 morphList.get(i).draw(g);
   	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     repaint();
     for(int i = 0; i < morphList.size(); i++) {
   		 morphList.get(i).update();
   	 }
    }

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseX = e.getX();
		mouseY = e.getY();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseClickedX = e.getX();
		mouseClickedY = e.getY();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
