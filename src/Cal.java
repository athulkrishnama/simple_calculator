import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;









public class Cal implements ActionListener{
	
	//operation
	boolean isope=false;
	//string values
	String newvar,oldvar,ope,result;
	//converted string values
	float newvarf,oldvarf,resultf;
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
		sevenbut.addActionListener(this);
		sevenbut.setBounds(5,65,80,80);
		calFrame.add(sevenbut);	  
				
		eightbut=new JButton("8");
		eightbut.setBounds(90,65,80,80);
		eightbut.addActionListener(this);
		calFrame.add(eightbut);
				
		ninebut=new JButton("9");
		ninebut.setBounds(175,65,80,80);
		ninebut.addActionListener(this);
		calFrame.add(ninebut);
		

		
		
		
		
		
		
		fourbut=new JButton("4");
		fourbut.addActionListener(this);
		fourbut.setBounds(5,150,80,80);
		calFrame.add(fourbut);	  
				
		fivebut=new JButton("5");
		fivebut.addActionListener(this);
		fivebut.setBounds(90,150,80,80);
		calFrame.add(fivebut);
				
		sixbut=new JButton("6");
		sixbut.addActionListener(this);
		sixbut.setBounds(175,150,80,80);
		calFrame.add(sixbut);
		

		
		
		
		
		
		
		onebut=new JButton("1");
		onebut.addActionListener(this);
		onebut.setBounds(5,235,80,80);
		calFrame.add(onebut);	  
				
		twobut=new JButton("2");
		twobut.addActionListener(this);
		twobut.setBounds(90,235,80,80);
		calFrame.add(twobut);
				
		threebut=new JButton("3");
		threebut.addActionListener(this);
		threebut.setBounds(175,235,80,80);
		calFrame.add(threebut);
		

		
		
		
		
		
		
		dotbut=new JButton(".");
		dotbut.addActionListener(this);
		dotbut.setBounds(5,320,80,80);
		calFrame.add(dotbut);	  
				
		zerobut=new JButton("0");
		zerobut.addActionListener(this);
		zerobut.setBounds(90,320,80,80);
		calFrame.add(zerobut);
				
		equalbut=new JButton("=");
		equalbut.addActionListener(this);
		equalbut.setBounds(175,320,80,80);
		calFrame.add(equalbut);

		
		
		
		
		//arithmetic buttons
		
		plusbut=new JButton("+");
		plusbut.addActionListener(this);
		plusbut.setBounds(260,65,80,80);
		calFrame.add(plusbut);	 
		
		minusbut=new JButton("-");
		minusbut.addActionListener(this);
		minusbut.setBounds(260,150,80,80);
		calFrame.add(minusbut);	 
		
		mulbut=new JButton("X");
		mulbut.addActionListener(this);
		mulbut.setBounds(260,235,80,80);
		calFrame.add(mulbut);	 
		
		divbut=new JButton("/");
		divbut.addActionListener(this);
		divbut.setBounds(260,320,80,80);
		calFrame.add(divbut);
		
		clearbut=new JButton("CE");
		clearbut.addActionListener(this);
		clearbut.setBounds(345, 65, 80, 165);
		calFrame.add(clearbut);
		
	}
	public static void main(String[] args) {
		new Cal();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//action for buttons
		if(e.getSource()==sevenbut) {
			if(isope) {
				oldvar=display.getText();
				display.setText("7");
				isope=false;
				
			}else {
			
			display.setText(display.getText()+"7");
			}
		}else if(e.getSource()==eightbut) {
			if(isope) {
				oldvar=display.getText();
				display.setText("8");
				isope=false;
				
			}else {
			
			display.setText(display.getText()+"8");
			}
			
		}else if (e.getSource()==ninebut) {
			if(isope) {
				oldvar=display.getText();
				display.setText("9");
				isope=false;
				
			}else {
			
			display.setText(display.getText()+"9");
			}
			
		}else if (e.getSource()==sixbut) {
			if(isope) {
				oldvar=display.getText();
				display.setText("6");
				isope=false;
				
			}else {
			
			display.setText(display.getText()+"6");
			}
			
		}else if (e.getSource()==fivebut) {
			if(isope) {
				oldvar=display.getText();
				display.setText("5");
				isope=false;
				
			}else {
			
			display.setText(display.getText()+"5");
			}
			
		}else if (e.getSource()==fourbut) {
			if(isope) {
				oldvar=display.getText();
				display.setText("4");
				isope=false;
				
			}else {
			
			display.setText(display.getText()+"4");
			}
			
		}else if (e.getSource()==threebut) {
			if(isope) {
				oldvar=display.getText();
				display.setText("3");
				isope=false;
				
			}else {
			
			display.setText(display.getText()+"3");
			}
			
		}else if (e.getSource()==twobut) {
			if(isope) {
				oldvar=display.getText();
				display.setText("2");
				isope=false;
				
			}else {
			
			display.setText(display.getText()+"2");
			}
			
		}else if (e.getSource()==onebut) {
			if(isope) {
				oldvar=display.getText();
				display.setText("1");
				isope=false;
				
			}else {
			
			display.setText(display.getText()+"1");
			}
			
		}else if (e.getSource()==zerobut) {
			if(isope) {
				oldvar=display.getText();
				display.setText("0");
				isope=false;
				
			}else {
			
			display.setText(display.getText()+"0");
			}
			
		}else if (e.getSource()==dotbut) {
			if(isope) {
				oldvar=display.getText();
				display.setText(".");
				isope=false;
				
			}else {
			
			display.setText(display.getText()+".");
			}
			
		}
		else if (e.getSource()==clearbut) {
			
				display.setText("");
		}
		
		
		//operation functions
		else if(e.getSource()==plusbut) {
			isope=true;
			ope="+";
			
		}else if(e.getSource()==minusbut) {
			isope=true;
			ope="-";
			
		}else if(e.getSource()==mulbut) {
			isope=true;
			ope="*";			
			
		}else if(e.getSource()==divbut) {
			isope=true;
			ope="/";
			
		
			
			//calculation
		}else if(e.getSource()==equalbut) {
			newvar=display.getText();
			
			newvarf=Float.parseFloat(newvar);
			oldvarf=Float.parseFloat(oldvar);
			if(ope=="+") {
				resultf=newvarf+oldvarf;
				
			}else if(ope=="*") {
				resultf=newvarf*oldvarf;
			}else if(ope=="-") {
				resultf=oldvarf-newvarf;
			}else if(ope=="/") {
				resultf=oldvarf/newvarf;
			}
			result=String.valueOf(resultf);
			display.setText(result);
			
		}
		
		
		
		
	}

}
