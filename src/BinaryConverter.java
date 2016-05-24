import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	 JTextField text = new JTextField(20);
	JTextField text2 = new JTextField(20);
	JButton button = new JButton();

	public static void main(String[] args) {
		BinaryConverter bye = new BinaryConverter();

	}

	BinaryConverter() {

		frame.setVisible(true);
		panel.setVisible(true);
		text.setVisible(true);
		button.setVisible(true);
		frame.add(panel);
		panel.add(text);
		panel.add(button);
		panel.add(text2);

		button.setText("Convert");

		button.addActionListener(this);

		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(button)) {

		 int otherdecimal= convert(text.getText());
		
		text2.setText("" + otherdecimal);
			
		
		}
	}

	int convert(String binary) {
		if (binary.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		if (!Pattern.matches("[01]{8}", binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return 0;
		}
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			// question.setText("");
			return 0;
		}
	}

}
