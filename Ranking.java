package main;

//import java.awt.Color;
//import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JPanel;

public class Ranking extends JFrame{
	private static final long serialVersionUID=1L;
	
	public Ranking(){
		
        this.setSize(500,350);
		this.setLayout(null);	
		this.setVisible(true);
		this.setResizable(false);
		this.setTitle("Ranking");
		this.setLocation(150,100);
		
		JButton ranking_btn_0 =  new JButton("Continue!");
		ranking_btn_0.setLocation(130,250);
		ranking_btn_0.setSize(100,30);
		ranking_Btnlistener_0 ranking_btnlistener_0 = new ranking_Btnlistener_0();
		ranking_btn_0.addActionListener(ranking_btnlistener_0);
		this.add(ranking_btn_0);
		
		JButton ranking_btn_1 =  new JButton("EXIT!");
		ranking_btn_1.setLocation(270,250);
		ranking_btn_1.setSize(100,30);
		ranking_Btnlistener_1 ranking_btnlistener_1 = new ranking_Btnlistener_1();
		ranking_btn_1.addActionListener(ranking_btnlistener_1);
		this.add(ranking_btn_1);		
		
		System.out.println("2");
	}
	public class ranking_Btnlistener_0 implements ActionListener{		
		public void actionPerformed(ActionEvent e) {			
			Main.window.ranking.dispose();
			Main.window.start = new Start();
			Main.window.frame.add(Main.window.start);
			Main.window.cond = 0;			
		}
	}   
     public class ranking_Btnlistener_1 implements ActionListener{		
		public void actionPerformed(ActionEvent e) {			
			System.exit(0);
		}
     }	
}