

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
	public static void main(String[] args) {
		drawButton(12);
	}

	private static void drawButton() {
		JFrame JFrame = new JFrame();
		JPanel JPanel = new JPanel();

		for (int i = 0; i < 24; i++) {

			JButton JButton = new JButton();
			JButton.setVisible(true);
			JPanel.add(JButton);

		}

		JFrame.setVisible(true);

		JPanel.setVisible(true);

		JFrame.setSize(10, 10);

	}

}
