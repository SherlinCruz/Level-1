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
	JTextField text = new JTextField();
	

	public static void main(String[] args) {
		ColorMe colorme = new ColorMe();
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
		
		

	}

	void inputs(int font) {

		text.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b1) {

			label.setText("You chose BLUE");
			label.setForeground(Color.BLUE);

		} else if (e.getSource() == b2) {

			label.setText("You chose RED");
			label.setForeground(Color.RED);

		} else if (e.getSource() == b3) {

			label.setText("You chose ORANGE");
			label.setForeground(Color.ORANGE);
		} else {
			JOptionPane.showMessageDialog(null, "CANCELLED!");
		}

		int x = Integer.parseInt(text.getText());

		label.setFont(new Font("Times New Roman", 0, x));

	}

}
