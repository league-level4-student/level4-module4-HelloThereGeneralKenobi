package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
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
   	 Polymorph movinMorph = new movingPolymorph(350, 350, 100, 100);
   	 
   	 morphList.add(bluePoly);
   	 morphList.add(redPoly);
   	 morphList.add(movinMorph);

   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
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
}
