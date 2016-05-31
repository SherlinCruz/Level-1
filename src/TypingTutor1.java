import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor1 implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel jlabel = new JLabel();
	char currentLetter = generateRandomLetter();

	public static void main(String[] args) {
		TypingTutor1 ok = new TypingTutor1();

	}

	TypingTutor1() {

		jlabel.setText("" + currentLetter);
		jlabel.setFont(jlabel.getFont().deriveFont(28.0f));
		jlabel.setHorizontalAlignment(JLabel.CENTER);

		frame.add(panel);
		frame.setVisible(true);
		frame.addKeyListener(this);

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(e)) {

			jlabel.setText("New text");

			currentLetter = 0;

			currentLetter = currentLetter;
		}

	}
}
