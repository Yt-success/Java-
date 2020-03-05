package pro1;

import java.awt.*;
import  javax.swing.*;

public class ballgame2 extends JFrame{
	Image ball=Toolkit.getDefaultToolkit().getImage("image/ball.png");
	Image desk=Toolkit.getDefaultToolkit().getImage("image/desk.jpg");
	double x=100;
	double y=100;
	double degree=3.14/3;
	//画窗口的方法
	public void paint(Graphics g) {
		System.out.println("窗口被画了一次！");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		x=x+10*Math.cos(degree);
		y=y+10*Math.sin(degree);
		
		//碰到上下边界
		if(y>500-40-30||y<40) {
			degree=-degree;
		}
		//碰到左右边界
		if(x<40||x>856-40-30) {
			degree=3.14-degree;
		}
		
		
	}
	
	
	
	//窗口加载
		void  launchFrame() {
		setSize(856,500);
		setLocation(100,100);
		setVisible(true);
		while(true) {
			repaint();
			try {
				Thread.sleep(40);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//main方法是程序执行的入口
	public static void main(String[] args){
		System.out.println("你好，我叫于腾，以后多多指教！");
		ballgame2 game =new ballgame2();
		game.launchFrame();
	}
	
	
}