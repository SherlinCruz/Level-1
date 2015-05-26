

import java.io.IOException;



import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

import javax.swing.JPanel;



public class AutomatedPhoneSystem {

public static void main(String[] args) {

JPanel JPanel = new JPanel();

JFrame JFrame = new JFrame();

JLabel JLabel = new JLabel();

JButton JButton = new JButton();

JButton JButton2 = new JButton();



/*

* JPanel.add(JFrame); JFrame.add(JLabel); JFrame.add(JButton);

*/



JPanel.show();

JFrame.show();

// JLabel.show();

JButton.show();



JLabel.setVisible(true);



JLabel.setText("Wintriss Bank");

JLabel.setSize(10, 10);



JButton.setVisible(true);

JButton2.setVisible(true);

JButton.setText("0");

JButton2.setText("1");




JFrame.pack();



/*

* speak("Welcome to the Wintriss Bank ");

* 

* speak(

* "For account information, enter “1”.  To speak to a representative, enter “0"

* );

*/



}



private static void pack() {

// TODO Auto-generated method stub



}



static void speak(String words) {

try {

Runtime.getRuntime().exec("say " + words);

} catch (IOException e) {

e.printStackTrace();

}

}



}