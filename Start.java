package main;

import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class Start extends JPanel {
	private static final long serialVersionUID=1L;
	
    public Start()
    {
    	this.setSize(800, 600);		
		this.setBackground(Color.PINK);
		this.setLayout(null);
		
		JButton start_btn =  new JButton("Start!");		
		start_btn.setLocation(350,450);
		start_btn.setSize(100,30);
		this.add(start_btn);
		
		start_Btnlistener start_btnlistener =new start_Btnlistener();
		start_btn.addActionListener(start_btnlistener);
		
		System.out.println("0");
    }
	
	private class start_Btnlistener implements ActionListener{		
		public void actionPerformed(ActionEvent e) {
				Main.window.cond = 1;
				Main.window.frame.remove(Main.window.start);
				Main.window.game = new Game();
				Main.window.frame.add(Main.window.game);
		}		
	}
}
