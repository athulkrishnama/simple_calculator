import java.awt.Color;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {
	
	
	public Calculator() {
		//created a frame to calculator
		JFrame calframe=new JFrame("Calculator");
		calframe.setLocation(500, 300);
		calframe.setSize(500,800);
		calframe.setVisible(true);
		calframe.setLayout(null);
		//terminate programe on close
		calframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//a label display for calculator 
		JLabel display=new JLabel("display  ");
		display.setBounds(10, 10, 480, 40);
		display.setBackground(Color.gray);
		display.setOpaque(true);
		display.setForeground(Color.white);
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		calframe.add(display);
		
		
		
		//add buttons to frame
	
		JButton sevenebut=new JButton("9");
		sevenebut.setBounds(10, 60, 80, 80);
		calframe.add(sevenebut);
		
		JButton eightbut=new JButton("8");
		eightbut.setBounds(100, 60, 80, 80);
		calframe.add(eightbut);
		
		JButton ninebut=new JButton("7");
		ninebut.setBounds(190, 60, 80, 80);
		calframe.add(ninebut);
		
		
		
		
		
		JButton fourbut=new JButton("4");
		fourbut.setBounds(10, 150, 80, 80);
		calframe.add(fourbut);
		
		JButton fivebut=new JButton("5");
		fivebut.setBounds(100, 150, 80, 80);
		calframe.add(fivebut);
		
		JButton sixbut=new JButton("6");
		sixbut.setBounds(190, 150, 80, 80);
		calframe.add(sixbut);
		
		
		
		
		
		JButton onebut=new JButton("1");
		onebut.setBounds(10, 240, 80, 80);
		calframe.add(onebut);
		
		JButton twobut=new JButton("2");
		twobut.setBounds(100, 240, 80, 80);
		calframe.add(twobut);
		
		JButton threebut=new JButton("3");
		threebut.setBounds(190, 240, 80, 80);
		calframe.add(threebut);
		
		
		
		
		
		
		
		JButton dotbut=new JButton(".");
		dotbut.setBounds(10, 330, 80, 80);
		calframe.add(dotbut);
		
		JButton zerobut=new JButton("0");
		zerobut.setBounds(100, 330, 80, 80);
		calframe.add(zerobut);
		
		JButton equalbut=new JButton("=");
		equalbut.setBounds(190, 330, 80, 80);
		calframe.add(equalbut);
		
		
		
		
		
		
		JButton divbut=new JButton("/");
		divbut.setBounds(280, 60, 80, 80);
		calframe.add(divbut);
		
		JButton mulbut=new JButton("X");
		mulbut.setBounds(280, 150, 80, 80);
		calframe.add(mulbut);
		
		JButton minusbut=new JButton("-");
		minusbut.setBounds(280, 240, 80, 80);
		calframe.add(minusbut);
		
		JButton plusbut=new JButton("+");
		plusbut.setBounds(280, 330, 80, 80);
		calframe.add(plusbut);
		
		
		
	}
	public static void main(String[] args) {
		new Calculator();
	}

}
