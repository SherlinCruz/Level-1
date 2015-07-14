import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class NEWCALCULATOR {
public static void main(String[] args) {

	
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JPanel panel = new JPanel();
	panel.setVisible(true);
	JTextField text = new JTextField();
	text.setVisible(true);
	JTextField text2 = new JTextField();
	text.setVisible(true);
	
	//b1= add
	//b2=subtract
	//b3=multiply
	//b4=divid
	
	JButton b1 = new JButton();
	b1.setVisible(true);
	JButton b2 = new JButton();
	b2.setVisible(true);
	JButton b3 = new JButton();
	b3.setVisible(true);
	JButton b4 = new JButton();
	b4.setVisible(true);
	
	frame.add(panel);
	panel.add(text);
	panel.add(text2);
	panel.add(b1);
	panel.add(b2);
	panel.add(b3);
	panel.add(b4);
	
	
	frame.pack();
}
}
