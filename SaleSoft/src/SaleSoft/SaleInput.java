import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class SaleInput extends JFrame implements ActionListener {
	private static final long serialVersionUID = 7833461570956352203L;
	
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
	
	// Buttons
	JButton submit = new JButton();
	JButton cancel = new JButton();
	
	// ComboBox
	String[] choices = {"Debug1","Debug2"};
	JComboBox<String> products = new JComboBox<String>(choices);
	
	// TextFields
	JTextField quantity = new JTextField();
	
	SaleInput() {
		// JFrame Settings
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setTitle("Add Sale");
		this.setLayout(new FlowLayout());
		this.setSize(new Dimension(300,280));
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		// Product Text
		JLabel product = new JLabel();
		product.setText("Product: ");
		
		// Quantity text
		JLabel qtyTxt = new JLabel();
		qtyTxt.setText("Quantity: ");
		
		// Buttons Format
		submit.setText("Submit");
		submit.addActionListener(this);
		
		cancel.setText("Cancel");
		cancel.addActionListener(this);
		
		// Reformat input
		products.setPreferredSize(new Dimension(100,20));
		quantity.setPreferredSize(new Dimension(20,20));
		quantity.setText("0");
		
		// Final
		this.add(product);
		this.add(products);
		this.add(qtyTxt);
		this.add(quantity);
		this.add(submit);
		this.add(cancel);
		this.setVisible(true);
		this.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == submit) {
			// Function goes here
			String prodSel = (String) products.getSelectedItem(); // Debug
			System.out.println("Product: " + prodSel + "\nQuantiy: " + quantity.getText()); // Debug
			this.dispose();
		}
		
		if (e.getSource() == cancel) {
			System.out.println("Cancel Operation.");
			this.dispose();
		}
		
	}
	
}