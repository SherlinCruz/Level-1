import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class chucklecliker  implements ActionListener{
	JButton button;
	JButton but;
	
public static void main(String[] args) {
	
	
	chucklecliker makeButton = new chucklecliker();
	makeButton.makeButton();
}

void makeButton()
{
		 button = new JButton();
		 but= new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	
	frame.add(panel);
	panel.add(button);
	panel.add(but);
	
	frame.setVisible(true);
	panel.setVisible(true);
	button.setVisible(true);
	but.setVisible(true);
	
	button.setText("joke");
	but.setText("punchline");
	
	button.addActionListener(this);
	but.addActionListener(this);
	
	
	
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

	if(e.getSource() == button)
	{
		JOptionPane.showMessageDialog(null, "hi !!! ");
		
		JOptionPane.showMessageDialog(null, "Most people believe that if it ain't broke, don't fix it.");
	}
	if(e.getSource() == but)
	{
		JOptionPane.showMessageDialog(null, "hi !!!! ");
		JOptionPane.showMessageDialog(null, " Engineers believe that if it ain't broke, it doesn't have enough features yet.");
	}
	
	
	
}
}
