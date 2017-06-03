package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

//import javax.swing.JButton;
import javax.swing.JFrame;

public class Main implements ActionListener{
	public int cond = 0;
	public JFrame frame;
	public Start start;
	public Game game;
	public Ranking ranking;
	public static Main window;
	public Timer timer ;
	
	public static void main(String[] args){
		window = new Main();
	}
	
	public Main(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		
		frame.setResizable(false);
		frame.setLayout(null);		
		frame.setVisible(true);
		frame.setTitle("Final Project");
		
		start = new Start();
		frame.add(start);
		
		timer = new Timer(10, this);
	    timer.start();
	}	
	
	public void actionPerformed(ActionEvent e) {		
		System.out.println(cond);
		
		if(cond == 1){
			//game main
			frame.repaint();			
		}		
		else{
			frame.repaint();
		}		
	}
}
