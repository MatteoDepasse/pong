import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.awt.event.*;

public class pong implements MouseListener, ActionListener, KeyListener{

//properties

JFrame theframe;
AnimationPanel3 thepanel;
Timer thetimer;

//methods
public void mouseMoved(MouseEvent evt){
	thepanel.intBallX = evt.getX();
	thepanel.intBallY = evt.getY();
}
public void mouseDragged(MouseEvent evt){
}
public void actionPerformed(ActionEvent evt){
	if(evt.getSource() == thetimer){
		thepanel.repaint();
	}
}
public void keyReleased(KeyEvent evt){
	//System.out.println("key released");
	//if(evt.getKeyCode() == 37){
	//	thepanel.blnGoLeft = false;
	//}
	if(evt.getKeyCode() == 38){
		thepanel.blnGoUp = false;
	}
	//if(evt.getKeyCode() == 39){
	//	thepanel.blnGoRight = false;
	//}
	if(evt.getKeyCode() == 40){
		thepanel.blnGoDown = false;
	}
}
public void mouseClicked(MouseEvent evt){
	thepanel.intBallY2 = evt.getY();
}
public void mousePressed(MouseEvent evt){
	thepanel.intBallY2 = evt.getY();
}
public void mouseReleased(MouseEvent evt){
	thepanel.intBallY2 = evt.getY();
}
public void mouseEntered(MouseEvent evt){
	thepanel.intBallY2 = evt.getY();
}
public void mouseExited(MouseEvent evt){
	thepanel.intBallY2 = evt.getY();
}
public void keyPressed(KeyEvent evt){
		//System.out.println("key pressed");
		//37 left
		//38 up
		//39 right
		//40 down 
		if(evt.getKeyCode() == 37){
			thepanel.blnGoLeft = true;
		}
		if(evt.getKeyCode() == 38){
			thepanel.blnGoUp = true;
		}
		if(evt.getKeyCode() == 39){
			thepanel.blnGoRight = true;
		}
		if(evt.getKeyCode() == 40){
			thepanel.blnGoDown = true;
		}
}
public void keyTyped(KeyEvent evt){
		//System.out.println("key typed");
		/*
		if(evt.getKeyChar() == 'w'){
			thepanel.intBallY = thepanel.intBallY -5 ; 
		}else if(evt.getKeyChar() == 's'){
			thepanel.intBallY = thepanel.intBallY +5 ; 
		}else if(evt.getKeyChar() == 'a'){
			thepanel.intBallX = thepanel.intBallX -5 ; 
		}else if(evt.getKeyChar() == 'd'){
			thepanel.intBallX = thepanel.intBallX +5 ; 

jar compreses and creates an executable 


		}
		* */
}
//constructor
public pong(){
	theframe = new JFrame ("animation with keyboard and mouse");
	thepanel = new AnimationPanel3();
	thepanel.setLayout(null);
	thepanel.addMouseListener(this); 
	theframe.addKeyListener(this);
	thepanel.setPreferredSize(new Dimension(600,400));
	
	theframe.setContentPane(thepanel);
	theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	theframe.pack();
	theframe.setVisible(true);
	
	thetimer = new Timer(1000/60,this);
	thetimer.start();
}
//main method 
public static void main(String[] args){
	new pong(); 
}

 


}




