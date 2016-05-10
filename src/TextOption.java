import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextOption {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();

	public static void main(String[] args) {

	}

	TextOption() {

		frame.add(panel);
		panel.add(label);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);

		frame.setVisible(true);
		frame.setTitle("COLOR ");

		b1.setText("Blue");
		b2.setText("Red");
		b3.setText("Silver");

		
		frame.pack();
	}

}
