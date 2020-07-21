package _11_whack_a_mole;

import javax.swing.JPanel;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Whack implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton mole = new JButton();
	Dimension o = new Dimension(350,250);
	int Pionts;
	Date timeAtStart = new Date();
	int plays;
public void run() {
	frame.setVisible(true);
	frame.setResizable(false);
	mole.setText("mole!");
	frame.add(panel);
	mole.addActionListener(this);
	Random r = new Random();
	int ran;
	ran = r.nextInt(24);
	createButton(ran);
	frame.setSize(o);
}
public void createButton(int moleLocation) {
	for (int i = 0; i < 24; i++) {
		if (i==moleLocation) {
			panel.add(mole);
		}else {
			JButton a = new JButton();
			a.setText("          ");
			panel.add(a);
			a.addActionListener(this);
		}
		}
	
}
static void speak(String words) {
    if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
        String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                + words + "');\"";
        try {
            Runtime.getRuntime().exec( cmd ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    } else {
        try {
            Runtime.getRuntime().exec( "say " + words ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if (buttonPressed.equals(mole)) {
		frame.remove(panel);
		panel = new JPanel();
		playSound("Slap-SoundMaster13-49669815.wav");
		mole.removeActionListener(this);
		frame.dispose();
		Pionts++;
		plays++;
		run();
	}else {
		speak("NOPE!");
		frame.remove(panel);
		panel = new JPanel();
		mole.removeActionListener(this);
		frame.dispose();
		plays++;
		run();
	}
	if (Pionts==10) {
		endGame(timeAtStart,Pionts);
	}
		
}
private void endGame(Date timeAtStart, int molesWhacked) { 
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                  + " moles per second.");
    System.exit(0);
}
private void playSound(String fileName) { 
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}
}
