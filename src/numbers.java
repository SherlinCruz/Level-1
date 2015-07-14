import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class numbers implements ActionListener {
	
	JButton add;
	JButton sub;
	JButton mul;
	JButton div;
	
	
public static void main(String[] args) {
	
	
}

void methods(){
	JFrame frame = new JFrame();
	frame.setVisible(true);
	
	JPanel panel = new JPanel();
	panel.setVisible(true);
	
	panel.setVisible(true);
	
	JButton add = new JButton ();
	JButton sub = new JButton();
	JButton mul = new JButton ();
	JButton div = new JButton();
	
	
	frame.add(panel);
	panel.add(sub);
	panel.add(add);
	panel.add(mul);
	panel.add(div);
	
	add.setText("+");
	sub.setText("-");
	mul.setText("*");
	div.setText("/");

	add.addActionListener(this);

	sub.addActionListener(this);

	mul.addActionListener(this);

	div.addActionListener(this);
	
	frame.pack();
	
	

}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
//	if(e.getSource() == add)
//	{
//		total +=  1 ;
//		System.out.println(total);
//	}
//	if(e.getSource() == sub)
//	{
//		total -= 1 ;
//		System.out.println(total);
//	}
//	if(e.getSource() == mul)
//	{
//		total =   ;
//		System.out.println(total);
//	}
//	if(e.getSource() == sub2)
//	{
//		total -= 2 ;
//		System.out.println(total);
//	}
}
}
