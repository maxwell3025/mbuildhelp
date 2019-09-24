package mbuildhelp;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class sphere extends JFrame{
	public int level;
	public int x=16;
	public int y=16;
	public int z=16;
	public sphere(){
		
		setSize(1000, 1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void paint(Graphics g){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int a=-64;a<64;){
			for(int b = -64;b<64;){
				if(a*a+b*b<1){
					g.setColor(Color.BLACK);
					g.drawRect(a+64, b+64, 1, 1);
				}
			}
		}
	}
	public static void main(String[]args){
		sphere h = new sphere();
	}

}
