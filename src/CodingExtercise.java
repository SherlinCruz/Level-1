import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CodingExtercise implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton yellow = new JButton();
	JButton red = new JButton();
	JButton blue = new JButton();
	JButton green = new JButton();

	public static void main(String[] args) {
		CodingExtercise code = new CodingExtercise();
	}

	CodingExtercise() {

		frame.add(panel);
		panel.add(yellow);
		panel.add(red);
		panel.add(blue);
		panel.add(green);

		frame.setVisible(true);
		yellow.setVisible(true);
		red.setVisible(true);
		blue.setVisible(true);
		green.setVisible(true);

		yellow.setBackground(Color.yellow);
		yellow.setOpaque(true);
		red.setBackground(Color.red);
		red.setOpaque(true);
		blue.setBackground(Color.blue);
		blue.setOpaque(true);
		green.setBackground(Color.GREEN);
		green.setOpaque(true);

		yellow.addActionListener(this);
		red.addActionListener(this);
		blue.addActionListener(this);
		green.addActionListener(this);

		frame.pack();

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		if (arg0.getSource().equals(yellow)) {
			
			speak("yellow");

		} else if (arg0.getSource().equals(red)) {
			speak("red");

		} else if (arg0.getSource().equals(blue)) {

			speak("blue");
		} else if (arg0.getSource().equals(green)) {

			speak("green");
		}

	}

}
