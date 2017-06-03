package main;

import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Game extends JPanel{
	private static final long serialVersionUID=1L;
	
    public Game()
    {
    	this.setSize(800, 600);		
		this.setBackground(Color.GREEN);
		this.setLayout(null);
		
		JButton game_btn =  new JButton("Game Over!");		
		game_btn.setLocation(350,450);
		game_btn.setSize(100,30);
		
		game_Btnlistener game_btnlistener =new game_Btnlistener();
		game_btn.addActionListener(game_btnlistener);
		this.add(game_btn);
		
		System.out.println("1");
    }
    
    public class game_Btnlistener implements ActionListener{		
		public void actionPerformed(ActionEvent e) {			
				Main.window.frame.remove(Main.window.game);
				Main.window.ranking = new Ranking();
				Main.window.cond = 0;
		}		
	}   
}