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

public class AdjustStock extends JFrame implements ActionListener {
	private static final long serialVersionUID = -3402916509870190480L;
	
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

	// ComboBox
	String[] choices = {"Debug1","Debug2"};
	JComboBox<String> products = new JComboBox<String>(choices);
	
	// TextFields
	JTextField newStock = new JTextField();
	JTextField newWarning = new JTextField();
	
	AdjustStock() {
		// JFrame Settings
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setTitle("Edit Stock");
		this.setLayout(new FlowLayout());
		this.setSize(new Dimension(300,280));
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		// JLabels
		JLabel product = new JLabel();
		product.setText("Product: ");
		
		JLabel stock = new JLabel();
		stock.setText("New Stock Amount: ");
		
		JLabel lowStock = new JLabel();
		lowStock.setText("New Stock Warning: ");
		
		// Format Buttons
		submit.setText("Submit");
		submit.addActionListener(this);
		
		cancel.setText("Cancel");
		cancel.addActionListener(this);
		
		// Format Inputs
		products.setPreferredSize(new Dimension(100,20));
		newStock.setPreferredSize(new Dimension(30,20));
		newWarning.setPreferredSize(new Dimension(30,20));
		
		//Final
		this.add(product);
		this.add(products);
		this.add(stock);
		this.add(newStock);
		this.add(lowStock);
		this.add(newWarning);
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
			System.out.println("Product: " + prodSel + "\nNew Stock: " + newStock.getText() +
			"\nNew Warning: " + newWarning.getText()); // Debug
			this.dispose();
		}
		
		if (e.getSource() == cancel) {
			System.out.println("Cancel Operation.");
			this.dispose();
		}		
	}
	
}