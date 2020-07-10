package _09_latest_tweet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.TwitterFactory;
import twitter4j.api.SearchResource;
import twitter4j.auth.AccessToken;
import twitter4j.auth.OAuthSupport;

public class Twitter implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField textBox = new JTextField(10);
	JButton twitterIsNotForMe = new JButton();
	JLabel label = new JLabel();

	public void run() {
		frame.add(panel);
		frame.setVisible(true);
		panel.add(textBox);
		panel.add(twitterIsNotForMe);
		twitterIsNotForMe.setText("Search the Twitterverse");
		frame.pack();
		twitterIsNotForMe.addActionListener(this);
		panel.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Tweet, Tweet");
 String output = getLatestTweet(textBox.getText());
 label.setText(output);
 frame.pack();
	}

	private String getLatestTweet(String searchingFor) {

	    twitter4j.Twitter twitter = new TwitterFactory().getInstance();

	    AccessToken accessToken = new AccessToken(
	        "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
	        "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
	    ((OAuthSupport) twitter).setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
	        "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
	    ((OAuthSupport) twitter).setOAuthAccessToken(accessToken);

	Query query = new Query(searchingFor);
	    try {
	        QueryResult result = ((SearchResource) twitter).search(query);
	        return result.getTweets().get(0).getText();
	    } catch (Exception e) {
	        System.err.print(e.getMessage());
	        return "What the heck is that?";
	    }
	}
}
