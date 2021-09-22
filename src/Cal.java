import java.awt.Color;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;





public class Cal {
	
	//frame of calculator
	
	JFrame calFrame;
	//display
	JLabel display;
	//numeric button
	JButton onebut,twobut,threebut,fourbut,fivebut,sixbut,sevenbut,eightbut,ninebut,zerobut,dotbut;
	//arithmetic operation button
	JButton plusbut,minusbut,mulbut,divbut,equalbut,clearbut;
	
	public Cal() {
		//frame config
		calFrame=new JFrame("Calculator");
		calFrame.setSize(500,700);
		calFrame.setLocation(300, 200);
		calFrame.setLayout(null);
		calFrame.setVisible(true);
		calFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		//display
		
		display =new  JLabel();
		display.setBounds(5, 5, 480, 50);
		display.setBackground(Color.GRAY);
		display.setOpaque(true);
		calFrame.add(display);
		display.setForeground(Color.white);
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		
		
		
		
		//buttons
		//numeric buttons
		
		sevenbut=new JButton("7");
		sevenbut.setBounds(5,65,80,80);
		calFrame.add(sevenbut);	  
				
		eightbut=new JButton("8");
		eightbut.setBounds(90,65,80,80);
		calFrame.add(eightbut);
				
		ninebut=new JButton("9");
		ninebut.setBounds(175,65,80,80);
		calFrame.add(ninebut);
		

		
		
		
		
		
		
		fourbut=new JButton("4");
		fourbut.setBounds(5,150,80,80);
		calFrame.add(fourbut);	  
				
		fivebut=new JButton("5");
		fivebut.setBounds(90,150,80,80);
		calFrame.add(fivebut);
				
		sixbut=new JButton("6");
		sixbut.setBounds(175,150,80,80);
		calFrame.add(sixbut);
		

		
		
		
		
		
		
		onebut=new JButton("1");
		onebut.setBounds(5,235,80,80);
		calFrame.add(onebut);	  
				
		twobut=new JButton("2");
		twobut.setBounds(90,235,80,80);
		calFrame.add(twobut);
				
		threebut=new JButton("3");
		threebut.setBounds(175,235,80,80);
		calFrame.add(threebut);
		

		
		
		
		
		
		
		dotbut=new JButton(".");
		dotbut.setBounds(5,320,80,80);
		calFrame.add(dotbut);	  
				
		zerobut=new JButton("0");
		zerobut.setBounds(90,320,80,80);
		calFrame.add(zerobut);
				
		equalbut=new JButton("=");
		equalbut.setBounds(175,320,80,80);
		calFrame.add(equalbut);

		
		
		
		
		//arithematic buttons
		
		plusbut=new JButton("+");
		plusbut.setBounds(260,65,80,80);
		calFrame.add(plusbut);	 
		
		minusbut=new JButton("-");
		minusbut.setBounds(260,150,80,80);
		calFrame.add(minusbut);	 
		
		mulbut=new JButton("X");
		mulbut.setBounds(260,235,80,80);
		calFrame.add(mulbut);	 
		
		divbut=new JButton("/");
		divbut.setBounds(260,320,80,80);
		calFrame.add(divbut);
		
		clearbut=new JButton("CE");
		clearbut.setBounds(345, 65, 80, 165);
		calFrame.add(clearbut);
		
	}
	public static void main(String[] args) {
		new Cal();
		
	}

}
