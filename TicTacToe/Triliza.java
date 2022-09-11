import javax.swing.BorderFactory;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.Border;
public class Triliza implements ActionListener{

	JFrame frame = new JFrame();
	JPanel title_panel = new JPanel();
	JPanel button_panel =new JPanel();
	JLabel textfield = new JLabel();
	JButton[] buttons = new JButton[9]; // 9 buttons
	boolean player1_turn;

	public  Triliza () {
		

		frame.setSize(800, 800);// φτιάξτε fram 800 x 800
		frame.setBackground(Color.cyan);//  χρώμα background ότι θέλετε 
		frame.setLayout(new BorderLayout());// με layout BorderLayout
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Tic-Tac-Toe");
		frame.setVisible(true);
		
		title_panel.setBackground(new Color (0, 0, 0));
		textfield.setForeground(new Color (255, 255,255));// φτιάξτε ένα textfield με χρώμα background και foreground
		textfield.setFont(new Font("Ink Free",Font.BOLD,75));// βάλτε γραμματοσειρά new Font("Ink Free",Font.BOLD,75)
		textfield.setHorizontalAlignment(JLabel.CENTER );
        // οριζόντια στοίχιση και κείμενο "Tic-Tac-Toe"
		textfield.setBackground(new Color(0,0,0));
		
		textfield.setOpaque(true);
		
		// φτιάξτε ένα panel με όνομα title_panel
		// με layout BorderLayout (.setBounds) πλάτος 800 και ύψος 100
		
		title_panel.setBounds(800, 100,1,1);
		title_panel.add(textfield);
		
		
        button_panel.setLayout(new GridLayout(3,3,1,1));// φτιάξτε το button_panel layout grid (3,3)
		
		
		button_panel.setBackground(new Color(150,150,150));
		
		// δημιουργήστε 9 buttons, JButton
		for(int i =0; i<=8; i++) {
			buttons[i] = new JButton();
			button_panel.add(buttons[i]);
			buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
		}
		
		
		frame.add(title_panel, BorderLayout.NORTH);
		frame.add(button_panel);
		
		player1_turn=true;
		textfield.setText("X turn");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i=0;i<=8;i++) {
			if(e.getSource()==buttons[i]) {
				if(player1_turn) {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(255,0,0));
						buttons[i].setText("X");
						player1_turn=false;
						textfield.setText("O turn");
						check();
					}
				}
				else {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(0,0,255));
						buttons[i].setText("O");
						player1_turn=true;
						textfield.setText("X turn");
						check();
					}
				}
			}			
		}
	}
	
	
	
	public void check() {
		//check X win conditions
		if((buttons[0].getText()=="X") && (buttons[1].getText()=="X") &&  (buttons[2].getText()=="X"))
		{
			// ...πρέπει τα buttons[0] / buttons[1]  / buttons[2] να γίνουν πράσινα
			buttons[0].setBackground(Color.GREEN);
			buttons[1].setBackground(Color.GREEN);
			buttons[2].setBackground(Color.GREEN);
			// πρέπει να μην είναι enabled ΟΛΑ τα κουμπια
			textfield.setText("X wins!!!");// πρέπει  το textfield να γράφει κέρδισε ο Χ
			for(int i =0;i<=8;i++){
				buttons[i].setEnabled(false);
			}
			int a=JOptionPane.showConfirmDialog(frame,"Do you want to continue ?");  
			if(a==JOptionPane.NO_OPTION){  
    		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
			frame.dispose();
			} else 
				if (a==JOptionPane.YES_OPTION){
					frame.dispose();
					new Triliza();
				}
			
			
		}
		if((buttons[0].getText()=="X") && (buttons[3].getText()=="X") &&  (buttons[6].getText()=="X")){
			buttons[0].setBackground(Color.GREEN);
			buttons[3].setBackground(Color.GREEN);
			buttons[6].setBackground(Color.GREEN);		
			textfield.setText("X wins!!!");
			for(int i =0;i<=8;i++){
				buttons[i].setEnabled(false);
			}
			int a=JOptionPane.showConfirmDialog(frame,"Do you want to continue ?");  
			if(a==JOptionPane.NO_OPTION){  
    		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
			frame.dispose();
			} else 
				if (a==JOptionPane.YES_OPTION){
					frame.dispose();
					new Triliza();
				}

			
		}
		if((buttons[0].getText()=="X") && (buttons[4].getText()=="X") &&  (buttons[8].getText()=="X")){
			buttons[0].setBackground(Color.GREEN);
			buttons[4].setBackground(Color.GREEN);
			buttons[8].setBackground(Color.GREEN);		
			textfield.setText("X wins!!!");
			for(int i =0;i<=8;i++){
				buttons[i].setEnabled(false);
			}
			int a=JOptionPane.showConfirmDialog(frame,"Do you want to continue ?");  
			if(a==JOptionPane.NO_OPTION){  
    		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
			frame.dispose();
			} else 
				if (a==JOptionPane.YES_OPTION){
					frame.dispose();
					new Triliza();
				}

		}
	
		if((buttons[1].getText()=="X") && (buttons[4].getText()=="X") &&  (buttons[7].getText()=="X")){
			buttons[1].setBackground(Color.GREEN);
			buttons[4].setBackground(Color.GREEN);
			buttons[7].setBackground(Color.GREEN);		
			textfield.setText("X wins!!!");
			for(int i =0;i<=8;i++){
				buttons[i].setEnabled(false);
			}
			int a=JOptionPane.showConfirmDialog(frame,"Do you want to continue ?");  
			if(a==JOptionPane.NO_OPTION){  
    		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
			frame.dispose();
			} else 
				if (a==JOptionPane.YES_OPTION){
					frame.dispose();
					new Triliza();
				}
		}
		if((buttons[2].getText()=="X") && (buttons[5].getText()=="X") &&  (buttons[8].getText()=="X")){
			buttons[2].setBackground(Color.GREEN);
			buttons[5].setBackground(Color.GREEN);
			buttons[8].setBackground(Color.GREEN);		
			textfield.setText("X wins!!!");
			for(int i =0;i<=8;i++){
				buttons[i].setEnabled(false);
			}
			int a=JOptionPane.showConfirmDialog(frame,"Do you want to continue ?");  
			if(a==JOptionPane.NO_OPTION){  
    		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
			frame.dispose();
			} else 
				if (a==JOptionPane.YES_OPTION){
					frame.dispose();
					new Triliza();
				}
		}
		if((buttons[2].getText()=="X") && (buttons[4].getText()=="X") &&  (buttons[6].getText()=="X")){
			buttons[2].setBackground(Color.GREEN);
			buttons[4].setBackground(Color.GREEN);
			buttons[6].setBackground(Color.GREEN);		
			textfield.setText("X wins!!!");
			for(int i =0;i<=8;i++){
				buttons[i].setEnabled(false);
			}
			int a=JOptionPane.showConfirmDialog(frame,"Do you want to continue ?");  
			if(a==JOptionPane.NO_OPTION){  
    		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
			frame.dispose();
			} else 
				if (a==JOptionPane.YES_OPTION){
					frame.dispose();
					new Triliza();
				}
		}
		if((buttons[3].getText()=="X") && (buttons[4].getText()=="X") &&  (buttons[5].getText()=="X")){
			buttons[3].setBackground(Color.GREEN);
			buttons[4].setBackground(Color.GREEN);
			buttons[5].setBackground(Color.GREEN);		
			textfield.setText("X wins!!!");
			for(int i =0;i<=8;i++){
				buttons[i].setEnabled(false);
			}
			int a=JOptionPane.showConfirmDialog(frame,"Do you want to continue ?");  
			if(a==JOptionPane.NO_OPTION){  
    		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
			frame.dispose();
			} else 
				if (a==JOptionPane.YES_OPTION){
					frame.dispose();
					new Triliza();
				}
		}
		if((buttons[6].getText()=="X") && (buttons[7].getText()=="X") &&  (buttons[8].getText()=="X")){
			buttons[6].setBackground(Color.GREEN);
			buttons[7].setBackground(Color.GREEN);
			buttons[8].setBackground(Color.GREEN);		
			textfield.setText("X wins!!!");
			for(int i =0;i<=8;i++){
				buttons[i].setEnabled(false);
			}
			int a=JOptionPane.showConfirmDialog(frame,"Do you want to continue ?");  
			if(a==JOptionPane.NO_OPTION){  
    		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
			frame.dispose();
			} else 
				if (a==JOptionPane.YES_OPTION){
					frame.dispose();
					new Triliza();
				}
		}
		if((buttons[0].getText()=="O") && (buttons[2].getText()=="O") &&  (buttons[3].getText()=="O")){
			buttons[0].setBackground(Color.GREEN);
			buttons[2].setBackground(Color.GREEN);
			buttons[3].setBackground(Color.GREEN);		
			textfield.setText("O wins!!!");
			for(int i =0;i<=8;i++){
				buttons[i].setEnabled(false);
			}
			int a=JOptionPane.showConfirmDialog(frame,"Do you want to continue ?");  
			if(a==JOptionPane.NO_OPTION){  
    		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
			frame.dispose();
			} else 
				if (a==JOptionPane.YES_OPTION){
					frame.dispose();
					new Triliza();
				}
		}
		if((buttons[0].getText()=="O") && (buttons[3].getText()=="O") &&  (buttons[6].getText()=="O")){
			buttons[0].setBackground(Color.GREEN);
			buttons[3].setBackground(Color.GREEN);
			buttons[6].setBackground(Color.GREEN);		
			textfield.setText("O wins!!!");
			for(int i =0;i<=8;i++){
				buttons[i].setEnabled(false);
			}
			int a=JOptionPane.showConfirmDialog(frame,"Do you want to continue ?");  
			if(a==JOptionPane.NO_OPTION){  
    		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
			frame.dispose();
			} else 
				if (a==JOptionPane.YES_OPTION){
					frame.dispose();
					new Triliza();
				}
		}

		if((buttons[0].getText()=="O") && (buttons[4].getText()=="O") &&  (buttons[8].getText()=="O")){
			buttons[0].setBackground(Color.GREEN);
			buttons[4].setBackground(Color.GREEN);
			buttons[8].setBackground(Color.GREEN);		
			textfield.setText("O wins!!!");
			for(int i =0;i<=8;i++){
				buttons[i].setEnabled(false);
			}
			int a=JOptionPane.showConfirmDialog(frame,"Do you want to continue ?");  
			if(a==JOptionPane.NO_OPTION){  
    		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
			frame.dispose();
			} else 
				if (a==JOptionPane.YES_OPTION){
					frame.dispose();
					new Triliza();
				}
		}
		if((buttons[1].getText()=="O") && (buttons[4].getText()=="O") &&  (buttons[7].getText()=="O")){
			buttons[1].setBackground(Color.GREEN);
			buttons[4].setBackground(Color.GREEN);
			buttons[7].setBackground(Color.GREEN);		
			textfield.setText("O wins!!!");
			for(int i =0;i<=8;i++){
				buttons[i].setEnabled(false);
			}
			int a=JOptionPane.showConfirmDialog(frame,"Do you want to continue ?");  
			if(a==JOptionPane.NO_OPTION){  
    		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
			frame.dispose();
			} else 
				if (a==JOptionPane.YES_OPTION){
					frame.dispose();
					new Triliza();
				}
		}
		if((buttons[2].getText()=="O") && (buttons[5].getText()=="O") &&  (buttons[8].getText()=="O")){
			buttons[2].setBackground(Color.GREEN);
			buttons[5].setBackground(Color.GREEN);
			buttons[8].setBackground(Color.GREEN);		
			textfield.setText("O wins!!!");
			for(int i =0;i<=8;i++){
				buttons[i].setEnabled(false);
			}
			int a=JOptionPane.showConfirmDialog(frame,"Do you want to continue ?");  
			if(a==JOptionPane.NO_OPTION){  
    		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
			frame.dispose();
			} else 
				if (a==JOptionPane.YES_OPTION){
					frame.dispose();
					new Triliza();
				}
		}
		if((buttons[2].getText()=="O") && (buttons[4].getText()=="O") &&  (buttons[6].getText()=="O")){
			buttons[2].setBackground(Color.GREEN);
			buttons[4].setBackground(Color.GREEN);
			buttons[6].setBackground(Color.GREEN);		
			textfield.setText("X wins!!!");
			for(int i =0;i<=8;i++){
				buttons[i].setEnabled(false);
			}
			int a=JOptionPane.showConfirmDialog(frame,"Do you want to continue ?");  
			if(a==JOptionPane.NO_OPTION){  
    		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
			frame.dispose();
			} else 
				if (a==JOptionPane.YES_OPTION){
					frame.dispose();
					new Triliza();
				}
		}
		if((buttons[3].getText()=="O") && (buttons[4].getText()=="O") &&  (buttons[5].getText()=="O")){
			buttons[3].setBackground(Color.GREEN);
			buttons[4].setBackground(Color.GREEN);
			buttons[5].setBackground(Color.GREEN);		
			textfield.setText("O wins!!!");
			for(int i =0;i<=8;i++){
				buttons[i].setEnabled(false);
			}
			int a=JOptionPane.showConfirmDialog(frame,"Do you want to continue ?");  
			if(a==JOptionPane.NO_OPTION){  
    		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
			frame.dispose();
			} else 
				if (a==JOptionPane.YES_OPTION){
					frame.dispose();
					new Triliza();
				}
		}
		if((buttons[6].getText()=="O") && (buttons[7].getText()=="O") &&  (buttons[8].getText()=="O")){
			buttons[6].setBackground(Color.GREEN);
			buttons[7].setBackground(Color.GREEN);
			buttons[8].setBackground(Color.GREEN);		
			textfield.setText("O wins!!!");
			for(int i =0;i<=8;i++){
				buttons[i].setEnabled(false);
			}
			int a=JOptionPane.showConfirmDialog(frame,"Do you want to continue ?");  
			if(a==JOptionPane.NO_OPTION){  
    		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
			frame.dispose();
			} else 
				if (a==JOptionPane.YES_OPTION){
					frame.dispose();
					new Triliza();
				}
		}




		
	}
}


	
	
   

