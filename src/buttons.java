import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class buttons
{
	public static void main(String[] args)
	{
		JFrame JF = new JFrame();
		JPanel JP = new JPanel();
		JButton JB = new JButton();
		JButton JM = new JButton();
		JButton Jm = new JButton();
		JButton Js = new JButton();
		JF.setVisible(true);
		JP.setVisible(true);

		JB.setVisible(true);
		JB.setText("Sherlin");
		JM.setText("Melissa");
		Js.setText("Lauren");
		Jm.setText("Emi");
		JF.add(JP);
		JP.add(JB);
		JP.add(JM);
		JP.add(Jm);
		JP.add(Js);
	}
}
