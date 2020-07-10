package _07_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
int r = new Random().nextInt(4);
System.out.println(r);
if (r==0) {
	JOptionPane.showMessageDialog(null, "Yes");
}else if (r==1) {
 JOptionPane.showMessageDialog(null, "No");
}else if (r==2) {
	JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
}else if (r==3) {
	JOptionPane.showMessageDialog(null, "Idk");
}}}
