package assignment_3_dda;

import java.awt.Graphics;

import javax.swing.JPanel;


public class Dda extends JPanel{
	
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	
	Dda(int x1, int y1, int x2, int y2){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	 public void paint(Graphics g){
		 
		 double dx,dy,steps,x,y,k;
		 double xc,yc;
	 
		 dx=x2-x1;
		 dy=y2-y1;
		 
		 if(Math.abs(dx)>Math.abs(dy))
			 steps=Math.abs(dx);
		 else
			 steps=Math.abs(dy);
	 
		 xc=(dx/steps);
		 yc=(dy/steps);
	 
		 x=x1;
		 y=y1;
		 //g.fillOval(200,500,5,5);
	 
		 for(k=1;k<=steps;k++){
			 x=x+xc;
			 y=y+yc;
			 g.fillOval((int)x,(int)y,5,5);
		 }
	 }
}

