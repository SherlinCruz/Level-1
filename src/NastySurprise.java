import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*Make a user interface that has 2 buttons.
 One says “Trick” the other says “Treat”. 
 When the user clicks on the Trick button, show them a picture of a cute puppy. 
 When they click Treat, show them a scary image.
 To show the pictures, use the showPictureFromTheInternet() method below.*/

public class NastySurprise implements ActionListener {
	JButton JB = new JButton();
	JButton JB2 = new JButton();

	public static void main(String[] args) {
		NastySurprise NastySurprise = new NastySurprise();

		NastySurprise.ui();

	}

	void ui() {

		JFrame JF = new JFrame();

		JF.setVisible(true);
		JPanel JP = new JPanel();
		JP.setVisible(true);

		JB.setVisible(true);

		JB2.setVisible(true);

		JB.removeActionListener((ActionListener) this);
		JB.setText("Trick");
		JB2.setText("Treat");
		JB2.addActionListener(this);

		JF.add(JP);
		JP.add(JB);
		JP.add(JB2);
		JF.pack();
	}

	private static void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == JB) {

			NastySurprise
					.showPictureFromTheInternet("http://shechive.files.wordpress.com/2014/01/cute-pups-6.jpg?w=500&h=327");
			System.out.println("good");
		} else if (e.getSource() == JB2) {
			System.out.println("print me ");
			NastySurprise
					.showPictureFromTheInternet("http://img2.wikia.nocookie.net/__cb20120124020742/creepypasta/images/2/23/Scary_05.gif");
		}
	}
}
