package _08_calculator;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Calculator implements ActionListener {
JFrame frame = new JFrame();

JPanel panel = new JPanel();
JButton mult = new JButton();
Dimension o =new Dimension(300,150);
JButton devi = new JButton();
JButton addi = new JButton();
JButton subt = new JButton();
JTextField num1 = new JTextField(10);
JTextField num2 = new JTextField(10);
JPanel panel2 = new JPanel();
JLabel answer = new JLabel();
Font font = new Font("sans",24,24);

	public void run() {
		frame.setResizable(false);
	frame.setVisible(true);
	frame.add(panel);
	frame.setSize(o);
	
	panel.add(num1);
	panel.add(num2);
	panel.add(addi);
	panel.add(subt);
	panel.add(mult);
	panel.add(devi);
	addi.setText("add");
	subt.setText("sub");
	devi.setText("dev");
	mult.setText("mul");
	addi.addActionListener(this);
	subt.addActionListener(this);
	devi.addActionListener(this);
	mult.addActionListener(this);
	panel.add(answer);
	answer.setFont(font);
	
		
		
	}
	public int Multiply(int num1, int num2) {
		int answerMul = num1*num2;
		return answerMul;
	}
	public int Devide(int num1, int num2) {
		int answerDev = num1/num2;
		return answerDev;
	}
	public int Addition(int num1, int num2) {
		int answerAdd = num1+num2;
		return answerAdd;
	}
	public int Subtraction(int num1, int num2) {
		int answerSub = num1-num2;
		return answerSub;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		String numeral1=num1.getText();
		String numeral2=num2.getText();
		int one = Integer.parseInt(numeral1);
		int two = Integer.parseInt(numeral2);
		if (buttonPressed.equals(addi)) {
			
			answer.setText(Addition(one,two)+"");
		}
		else if (buttonPressed.equals(subt)) {
			
			answer.setText(Subtraction(one,two)+"");
		}else if (buttonPressed.equals(mult)) {
			
			answer.setText(Multiply(one,two)+"");
		}else if (buttonPressed.equals(devi)) {
			
			answer.setText(Devide(one,two)+"");
		}
	}
	
	
	
}
