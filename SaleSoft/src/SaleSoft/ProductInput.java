import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class ProductInput extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1583715815707762550L;
	
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
	
	// Buttons:
	JButton submit = new JButton();
	JButton cancel = new JButton();
	
	// TextFields:
	JTextField prodName = new JTextField();
	JTextField prodPrice = new JTextField();
	JTextField prodStock = new JTextField();
	JTextField prodLowStock = new JTextField();
	
	ProductInput() {
		// JFrame Settings
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Input Sale");
		this.setLayout(new FlowLayout());
		this.setSize(new Dimension(300,280));
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		// Text Labels
		JLabel name = new JLabel();
		name.setText("Product Name: ");
		
		JLabel price = new JLabel();
		price.setText("Price: ");
		
		JLabel stock = new JLabel();
		stock.setText("Current Stock: ");
		
		JLabel lowStock = new JLabel();
		lowStock.setText("Low Stock Warning: ");
		
		// Format Buttons
		submit.setText("Submit");
		submit.addActionListener(this);
		
		cancel.setText("Cancel");
		cancel.addActionListener(this);
		
		// Format input boxes
		prodName.setPreferredSize(new Dimension(100,20));
		prodPrice.setPreferredSize(new Dimension(40,20));
		prodStock.setPreferredSize(new Dimension(30,20));
		prodLowStock.setPreferredSize(new Dimension(30,20));
		
		// Final:
		this.add(name);
		this.add(prodName);
		this.add(price);
		this.add(prodPrice);
		this.add(stock);
		this.add(prodStock);
		this.add(lowStock);
		this.add(prodLowStock);
		this.add(submit);
		this.add(cancel);
		this.setVisible(true);
		this.pack();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == submit) {
			// Function goes here
			System.out.println("Product: " + prodName.getText() + "\nPrice: " + prodPrice.getText() +
			"\nCurrent Stock: " + prodStock.getText() + "\nLow Stock: " + prodLowStock.getText()); // Debug
			this.dispose();
		}
		
		if (e.getSource() == cancel) {
			System.out.println("Cancel Operation.");
			this.dispose();
		}
	}
	
}