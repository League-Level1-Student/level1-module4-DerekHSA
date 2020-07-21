package _12_slot_machine;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Gambiling___Yeah implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton SpinGR = new JButton();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	Random random1 = new Random();
	Random random2 = new Random();
	Random random3 = new Random();
	int ran1;
	int ran2;
	int ran3;
public void run() throws MalformedURLException {
	frame.add(panel);
	frame.setVisible(true);
	panel.add(SpinGR);
	SpinGR.addActionListener(this);
	
	SpinGR.setText("SPIN!");
	frame.pack();
	
}


private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}
@Override
public void actionPerformed(ActionEvent e){
	// TODO Auto-generated method stub
	panel.remove(label1);
	panel.remove(label2);
	panel.remove(label3);
	ran1=random1.nextInt(3);
	ran2=random2.nextInt(3);
	ran3=random3.nextInt(3);
	System.out.println(ran1);
	System.out.println(ran2);
	System.out.println(ran3);
	
	
	
	if (ran1==0) {
	try {
		label1=createLabelImage("Orange.jpg");
	} catch (MalformedURLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	panel.add(label1);
	
	
	
	}else if (ran1==1) {
		try {
			label1=createLabelImage("Cherry.jpg");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		panel.add(label1);
		
		
		
	}else if (ran1==2) {
		try {
			label1=createLabelImage("Lime.jpg");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		panel.add(label1);
		
		
		
	}if (ran2==0) {
		try {
			label2=createLabelImage("Orange.jpg");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		panel.add(label2);
		
		
		
	}else if (ran2==1) {
		try {
			label2=createLabelImage("Cherry.jpg");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		panel.add(label2);
		
		
		
	}else if (ran2==2) {
		try {
			label2=createLabelImage("Lime.jpg");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		panel.add(label2);
		
		
		
		}if (ran3==0) {
			try {
				label3=createLabelImage("Orange.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			panel.add(label3);
			
			
			
		}else if (ran3==1) {
			try {
				label3=createLabelImage("Cherry.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			panel.add(label3);
			
			
		}else if (ran3==2) {
			try {
				label3=createLabelImage("Lime.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		panel.add(label3);
	}
	frame.pack();
	if (ran1==ran2&&ran2==ran3) {
		JOptionPane.showMessageDialog(null, "You Win!");
	}
}
}
