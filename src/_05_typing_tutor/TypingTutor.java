package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame();
	JLabel cl = new JLabel();
	JPanel panel = new JPanel();
	Color color = new Color(250,0,0);
	Color color2 = new Color(0,250,0);
	char currentLetter;
 public void run() {
	 frame.setVisible(true);
	 frame.add(panel);
	panel.add(cl);
 frame.addKeyListener(this);
currentLetter = generateRandomLetter();
 cl.setText(currentLetter+"");
 cl.setFont(cl.getFont().deriveFont(50.0f));
 cl.setHorizontalAlignment(JLabel.CENTER);
 frame.pack();
 }
 //😁
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
	
	System.out.println("Key Pressed: "+e.getKeyChar());

if (currentLetter==e.getKeyChar()) {
	System.out.println("correct");
	
	panel.setBackground(color2);
}else {
	panel.setBackground(color);
}
currentLetter=generateRandomLetter();
cl.setText(currentLetter+"");
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
