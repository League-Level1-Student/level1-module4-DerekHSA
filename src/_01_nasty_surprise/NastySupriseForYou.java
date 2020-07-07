package _01_nasty_surprise;

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

public class NastySupriseForYou implements ActionListener, Runnable {
	JFrame Framed = new JFrame();
	JPanel ThePaneIsReal = new JPanel();
	JButton butONE = new JButton();
	 JButton butTWO = new JButton();
public void run() {
	Framed.setVisible(true);
	butONE.addActionListener(this);
	butTWO.addActionListener(this);
	Framed.add(ThePaneIsReal);
	ThePaneIsReal.add(butONE);
	ThePaneIsReal.add(butTWO);
	butONE.setText("Trick");
	butTWO.setText("Treat");
	Framed.pack();
	
}
private void showPictureFromTheInternet(String imageUrl) {
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
	JButton buttonPressed = (JButton) e.getSource();
	if (buttonPressed.equals(butONE)) {
		showPictureFromTheInternet("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSXBtP-8KnuUVffA0UHe8yjBY5cOjRV4MbbtQ&usqp=CAU");
	}else if(buttonPressed.equals(butTWO)) {
		showPictureFromTheInternet("https://ewscripps.brightspotcdn.com/dims4/default/a08aa50/2147483647/strip/true/crop/693x364+8+0/resize/1200x630!/quality/90/?url=https%3A%2F%2Fx-default-stgec.uplynk.com%2Fausw%2Fslices%2Fdf3%2F2fbf8a5e953e4a01960f2f5161cc4953%2Fdf3fac3772804c18abb9d7b3b8083898%2Fposter_0c526fa9258e48a8a97db15d4e4dad87.png");
	}
}
}
