import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class AnimationPanel3 extends JPanel{
//properties
int intBallX = 100;
int intBallY = 100;
int intBallX2 = 500;
int intBallY2 = 100;
boolean blnGoDown = false;
boolean blnGoUp = false;
boolean blnGoLeft = false;
boolean blnGoRight = false;

// methods
public void paintComponent(Graphics g){
	g.setColor(Color.WHITE);
	g.fillRect(0,0,1280,720);
	g.setColor(Color.BLUE);
	g.fillRect(intBallX, intBallY,20, 100);
	g.setColor(Color.RED);
	g.fillRect(intBallX2, intBallY2,20, 100);
	g.setColor(Color.GREEN);
	g.fillOval(300,200,20,20);
	
	//intBallX = intBallX + 1;
	if(blnGoDown){
		intBallY = intBallY +5;
		//System.out.println(intBallY);
	}
	if(blnGoUp){
		intBallY = intBallY - 5;
		//		System.out.println(intBallY);

	}
	if(intBallY > 300){
	intBallY = intBallY -5 ;
	//	System.out.println(intBallY);

}
if(intBallY < 0){
	intBallY = intBallY + 5;
}
if(intBallY2 < 0){
	intBallY2 = 0;
}
if(intBallY2 > 300){
	intBallY2 = 300;
}
	//if(blnGoLeft){
	//	intBallX--;
	//}
	//if(blnGoRight){
	//	intBallX++;
	//}
}

//constructor

public AnimationPanel3(){
super();
}




}
