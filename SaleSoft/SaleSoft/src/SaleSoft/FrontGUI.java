package SaleSoft;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class FrontGUI extends JFrame{
	private static final long serialVersionUID = 4725189688562458030L;

	FrontGUI() {
		// Universals
		Border frameBorder = BorderFactory.createRaisedBevelBorder();
		Border altBorder = BorderFactory.createLoweredBevelBorder();
		Border debugBorder = BorderFactory.createLineBorder(Color.black,1);
		Font stdHeader = new Font("Inter",Font.BOLD,24);
		Font stdContent = new Font("Inter",Font.PLAIN,20);
		Font tblHeader = new Font("Inter",Font.BOLD,16);
		Font tblContent = new Font("Inter",Font.PLAIN,16);
		Color stdBG = new Color(0xD9D9D9);
		Color altBG = new Color(0xC0BCBC);
		
		
		// Main Frame Settings
		this.setTitle("SoftShop");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1200,800);
		this.setResizable(false);
		//this.setBackground(new Color(0xB7B7B7)); //Redundant
		this.setLayout(new BorderLayout());
		this.setLocationRelativeTo(null);
		
		// Buttons Start		##
		// 
		// Button Bar Settings
		JPanel buttons = new JPanel();
		buttons.setPreferredSize(new Dimension(300,800));
		buttons.setBackground(stdBG);
		buttons.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));
		buttons.setBorder(frameBorder);
		this.add(buttons,BorderLayout.WEST);
		
		JPanel buttonContent = new JPanel();
		buttonContent.setPreferredSize(new Dimension(280,740));
		buttonContent.setBackground(altBG);
		buttonContent.setLayout(new FlowLayout());
		buttonContent.setBorder(altBorder);
		buttons.add(buttonContent);
		
		JPanel buttonsView = new JPanel();
		buttonsView.setPreferredSize(new Dimension(260,80));
		buttonsView.setBackground(new Color(0xA9A5A5));
		buttonsView.setLayout(new GridBagLayout());
		buttonsView.setBorder(frameBorder);
		buttonContent.add(buttonsView);
		
		JLabel buttonsText = new JLabel();
		buttonsText.setText("Buttons View");
		buttonsText.setFont(stdHeader);
		//buttonsText.setBorder(debugBorder);
		buttonsView.add(buttonsText);
		//
		// Buttons End			##
		
		
		// Sheets Start			##
		//
		// Sheet Panel Settings
		JPanel sheets = new JPanel();
		sheets.setPreferredSize(new Dimension(900,800));
		sheets.setBackground(stdBG);
		sheets.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));
		sheets.setBorder(frameBorder);
		this.add(sheets);

		JPanel sheetsContent = new JPanel();
		sheetsContent.setPreferredSize(new Dimension(860,740));
		sheetsContent.setBackground(altBG);
		sheetsContent.setLayout(new FlowLayout());
		sheetsContent.setBorder(altBorder);
		sheets.add(sheetsContent);
		//
		// Sheets End			##
	
		
		// Final
		this.setVisible(true);
		
	}

}
