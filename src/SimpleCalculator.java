import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator {
	JTextField first = new JTextField();

	JTextField second = new JTextField();

	public static void main(String[] args) {

		SimpleCalculator calc = new SimpleCalculator();

	}

	SimpleCalculator() {

		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.setVisible(true);
		first.setVisible(true);
		second.setVisible(true);

		// b1= add
		// b2=subtract
		// b3=multiply
		// b4=divid

		JButton b1 = new JButton();
		b1.setVisible(true);
		b1.setText("Add");
		JButton b2 = new JButton();
		b2.setVisible(true);
		b2.setText("Subtract");
		JButton b3 = new JButton();
		b3.setVisible(true);
		b3.setText("Multiply");
		JButton b4 = new JButton();
		b4.setVisible(true);
		b4.setText("Divide");

		frame.add(panel);
		panel.add(first);
		panel.add(second);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);

		frame.pack();
	}

	int addition() {
		int foo = Integer.parseInt("total");
		int total = first.getText() + second.getText(); 
		
		
		return total;

	}

}
