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

public class ColorMe implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JTextField text = new JTextField(10);
	boolean y;

	String option1;
	String option2;
	String option3;

	public static void main(String[] args) {
		ColorMe colorme = new ColorMe();
		TextOption colorOption = new TextOption("E", "R", "N", "D");

	}

	ColorMe() {

		frame.add(panel);
		panel.add(label);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(text);

		frame.setVisible(true);

		frame.setTitle("What COLOR? ");

		b1.setText("Blue");
		b2.setText("Red");
		b3.setText("Orange");

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		text.addActionListener(this);

		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b1) {
			if (y == true) {
				label.setText("Don't change me !");
				label.setOpaque(true);
				label.setBackground(Color.blue);
				System.out.println(y);
				y = false;
			} else {
				label.setText("Don't change me !");
				label.setForeground(Color.blue);
				System.out.println(y);
				y = true;
			}

		} else if (e.getSource() == b2) {

			if (y == true) {
				label.setText("Don't change me !");
				label.setOpaque(true);

				label.setBackground(Color.RED);
				System.out.println(y);
				y = false;
			} else {
				label.setText("RED");
				label.setForeground(Color.RED);
				System.out.println(y);
				y = true;
			}

		} else if (e.getSource() == b3) {

			label.setText("ORANGE");

			if (y == true) {
				label.setText("Don't change me !");
				label.setOpaque(true);

				label.setBackground(Color.ORANGE);
				System.out.println(y);
				y = false;
			} else {
				label.setText("RED");
				label.setForeground(Color.ORANGE);
				System.out.println(y);
				y = true;
			}

		} else if (e.getSource() == text) {

			int x = Integer.parseInt(text.getText());
			label.setFont(new Font("Times New Roman", Font.ITALIC, x));

		}

		else {
			JOptionPane.showMessageDialog(null, "CANCELLED!");
		}

	}

}
