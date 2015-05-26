import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CandyMan2 implements ActionListener {
	static JButton button = new JButton();
	int pressed = 0;

	public static void main(String[] args) {

		CandyMan2 candyman = new CandyMan2();
		JFrame frame = new JFrame();

		frame.add(button);
		frame.setVisible(true);
		button.setText("Candy Man");

		candyman.mouse();

	}

	void mouse() {

		button.addActionListener(this);
	}

	private void image(String imageUrl) {
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
	public void actionPerformed(ActionEvent args) {
		// TODO Auto-generated method stub

		pressed = pressed + 1;

		System.out.println(pressed);
		if (pressed == 5) {
			image("http://content6.flixster.com/question/48/54/67/4854676_std.jpg");
			System.out.println("show");

			playSound(1);

		}

	}

	static final int CREEPY = 0;
	static final int SCREAM = 1;

	public static void playSound(int whichSound) {
		String soundURL = "";
		if (whichSound == CREEPY)
			soundURL = "http://school.wintrisstech.org/sounds/creepynoise.wav";
		else if (whichSound == SCREAM)
			soundURL = "http://school.wintrisstech.org/sounds/scream.wav";

		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new URL(soundURL));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
