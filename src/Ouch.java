import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Ouch implements KeyListener {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();


public static void main(String[] args) {
	frame.setVisible(true);
	panel.setVisible(true);
frame.add(panel);


	
System.out.println("i work");

}
	void ouch(){
		frame.addKeyListener(this);
	    // 1. make a main method and put steps 2, 3 & 4 inside it

			
		
	    // 2. ask the user for a sentence
	
			
	    // 3. repeat the sentence using the speak method below
			
	    // 4. make this repeat a lot of times
			
			for (int i = 0; i < 20; i++) {
		
				speak("ouch");
			}
		}
	static void speak(String words) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + words).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	   	 }
	    }
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.isShiftDown()){
			ouch();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
