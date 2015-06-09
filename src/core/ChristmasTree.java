package core;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ChristmasTree extends Applet implements ActionListener, MouseListener, MouseMotionListener
{
    int[] xPoints = {200,50,350};
    int[] yPoints = {35,400,400};
    Button lights;
    Button decorations;
    Button stars;
    int mx;
    int my;
    Object source;


    public void init()
    {
        lights = new Button("Add Lights");
        decorations = new Button("Add Decorations");
        stars = new Button("Add Stars");
        add(lights);
        add(decorations);
        add(stars);
        lights.setLocation(50, 450);
        addMouseListener( this );
        addMouseMotionListener( this );
        lights.addActionListener(this);
        decorations.addActionListener(this);
    }

	
	// Code to draw the shapes
    public void paint (Graphics g){
	
        g.setColor(Color.green);
        g.fillPolygon(xPoints, yPoints, 3);
        g.setColor(Color.black);
        g.fillRect(175, 400, 50, 50);
        g.drawString(Integer.toString(mx), 25, 85);
        g.drawString(Integer.toString(my), 25, 100);
        
		if (source == lights){
            g.setColor(Color.yellow);
            g.fillOval(mx, my, 20, 20);
        }
        
		if (source == decorations){
            g.setColor(Color.blue);
            g.fillOval(mx, my, 50, 50);
        }

    }
	
	
	// Do action 
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == lights){
            source = lights;
        }
        if (ev.getSource() == decorations){
            source = decorations;
        }
        repaint();

    }

	
	// Mouse events
    public void mousePressed(MouseEvent e) {
        mx = e.getX();
        my = e.getY();
        repaint();
    }

    public void mouseReleased(MouseEvent e) {

    }
	
	
    public void mouseEntered(MouseEvent e) {
	
	}
	
    public void mouseExited(MouseEvent e) {
	
	}
	
    public void mouseMoved(MouseEvent e) {
	
	}
	
    public void mouseClicked(MouseEvent e) {

    }
	
    public void mouseDragged(MouseEvent e) {
	
	}

}