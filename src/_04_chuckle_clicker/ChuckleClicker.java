package _04_chuckle_clicker;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton Button1 = new JButton();
	JButton Button2 = new JButton();
public void  run() {
	makeButtons();
}

public void makeButtons() {
	JFrame a = new JFrame();
	a.setVisible(true);
	JPanel a1 = new JPanel();
	a.add(a1);
	
	a1.add(Button1);
	a1.add(Button2);
	Dimension o = new Dimension(100,100);
	Button1.setPreferredSize(o);
	Button2.setPreferredSize(o);
	Button1.setText("Joke");
	Button2.setText("Punchline");
	Button1.addActionListener(this);
	Button2.addActionListener(this);
	a.pack();
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if (buttonPressed.equals(Button1)) {
	JOptionPane.showMessageDialog(null, "My wife told me to stop acting like a flamingo.");
	}else if (buttonPressed.equals(Button2)) {
	JOptionPane.showMessageDialog(null, "I had to put my foot down.");
	}
}
}
