

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

public class Front extends JFrame{
	private static final long serialVersionUID = -3710831349600987331L;
	
	// Universals:
	Border frameBorder = BorderFactory.createRaisedBevelBorder();
	Border altBorder = BorderFactory.createLoweredBevelBorder();
	Border debugBorder = BorderFactory.createLineBorder(Color.black,1);
	Font stdHeader = new Font("Inter",Font.BOLD,24);
	Font stdContent = new Font("Inter",Font.PLAIN,20);
	Font tblHeader = new Font("Inter",Font.BOLD,16);
	Font tblContent = new Font("Inter",Font.PLAIN,16);
	Color stdBG = new Color(0xD9D9D9);
	Color altBG = new Color(0xC0BCBC);
	Dimension stdButton = new Dimension(260,80);
	
	Front() {
		
		// Main Frame Settings
		this.setTitle("SoftShop");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1200,800);
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		this.setLocationRelativeTo(null);
				
		//
		//Buttons:
		// Button Panel Settings
		JPanel buttons = new JPanel();
		buttons.setPreferredSize(new Dimension(300,800));
		buttons.setBackground(stdBG);
		buttons.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));
		buttons.setBorder(frameBorder);
		this.add(buttons,BorderLayout.WEST);
		
		// From ButtonBar.java
		buttons.add(new ButtonBar());
				
		
		//
		// Sheets:
		// Sheets Panel Settings
		JPanel sheets = new JPanel();
		sheets.setPreferredSize(new Dimension(900,800));
		sheets.setBackground(stdBG);
		sheets.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));
		sheets.setBorder(frameBorder);
		this.add(sheets);
		
		// From ContentWindow.java
		sheets.add(new ContentWindow());


		// Final
		this.setVisible(true);
	}

}
