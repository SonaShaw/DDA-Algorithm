package assignment_3_dda;

import javax.swing.JFrame;

public class Gui_2 {
	
	Dda dda;
	JFrame jfrm;
	

	Gui_2(int x1,int y1,int x2,int y2){
		
		
		jfrm = new JFrame();
		jfrm.setSize(800,800);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		dda = new Dda(x1, y1, x2, y2);
		jfrm.add(dda);
		
		jfrm.setVisible(true);
		
	}

}
