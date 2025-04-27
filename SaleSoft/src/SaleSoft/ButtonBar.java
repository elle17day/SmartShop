

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ButtonBar extends JPanel implements ActionListener{
	private static final long serialVersionUID = -1851269538990448773L;

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
	
	// View Buttons:
	JButton defSales = new JButton();
	JButton defInventory = new JButton();
	
	// Products Buttons:
	JButton addProd = new JButton();
	JButton editProd = new JButton();
	JButton removeProd = new JButton();
	JButton adjustStock = new JButton();
	JButton invReport = new JButton();
	
	// Sales Buttons:
	JButton addSale = new JButton();
	JButton undoLast = new JButton();
	JButton salesReport = new JButton();
	
	// JLabels:
	JLabel buttonsLabel = new JLabel();
	JLabel salesLabel = new JLabel();
	JLabel invLabel = new JLabel();
	
	// JPanels:
	JPanel buttonsView = new JPanel();
	
	ButtonBar() {
		// Panel for holding Buttons
		this.setPreferredSize(new Dimension(280,740));
		this.setBackground(altBG);
		this.setLayout(new FlowLayout());
		this.setBorder(altBorder);
		
		// Title Panel
		buttonsView.setPreferredSize(stdButton);
		buttonsView.setBackground(new Color(0xA9A5A5));
		buttonsView.setLayout(new GridBagLayout());
		buttonsView.setBorder(frameBorder);
		this.add(buttonsView);
		
		// Labels Start
		//						####
		// Entry text label
		buttonsLabel.setText("Welcome!");
		buttonsLabel.setFont(stdHeader);
		//buttonsText.setBorder(debugBorder); // Debug
		buttonsView.add(buttonsLabel);
		
		// Sales label
		salesLabel.setText("Sales View");
		salesLabel.setFont(stdHeader);
		
		// Inventory label
		invLabel.setText("Inventory View");
		invLabel.setFont(stdHeader);
		//						####
		// Labels End
		

		// View Buttons Start
		//						####
		// Sales View Button
		defSales.setText("Sales View");
		defSales.setPreferredSize(stdButton);
		defSales.setFont(stdContent);
		defSales.addActionListener(this);
		this.add(defSales);
		
		// Inventory View Button
		defInventory.setText("Inventory View");
		defInventory.setPreferredSize(stdButton);
		defInventory.setFont(stdContent);
		defInventory.addActionListener(this);
		this.add(defInventory);
		//						####
		// View Buttons End

		// Products Buttons Start
		//						####
		// Add Product Button
		addProd.setText("Add Product");
		addProd.setPreferredSize(stdButton);
		addProd.setFont(stdContent);
		addProd.addActionListener(this);
		
		// Edit Product Button
		editProd.setText("Edit Product");
		editProd.setPreferredSize(stdButton);
		editProd.setFont(stdContent);
		editProd.addActionListener(this);
		
		// Remove Product Button
		removeProd.setText("Remove Product");
		removeProd.setPreferredSize(stdButton);
		removeProd.setFont(stdContent);
		removeProd.addActionListener(this);
		
		// Adjust Stock Button
		adjustStock.setText("Adjust Stock");
		adjustStock.setPreferredSize(stdButton);
		adjustStock.setFont(stdContent);
		adjustStock.addActionListener(this);
		
		// Stock Report Button
		invReport.setText("Generate Stock Report");
		invReport.setPreferredSize(stdButton);
		invReport.setFont(stdContent);
		invReport.addActionListener(this);
		
		//						####
		// Products Buttons End
		
		
		// Sales Buttons Start
		//						####
		// Add Sale Button
		addSale.setText("Add Sale");
		addSale.setPreferredSize(stdButton);
		addSale.setFont(stdContent);
		addSale.addActionListener(this);
			
		// Undo Last Sale Button
		undoLast.setText("Undo Last Sale");
		undoLast.setPreferredSize(stdButton);
		undoLast.setFont(stdContent);
		undoLast.addActionListener(this);
		
		// Sales Report Button
		salesReport.setText("Generate Sales Report");
		salesReport.setPreferredSize(stdButton);
		salesReport.setFont(stdContent);
		salesReport.addActionListener(this);
		
		//						####
		// Sales Buttons End
	}
	
	public void refresh() {
		this.repaint();
		this.revalidate();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// View Buttons Start
		//						####
		
		// Inventory Button
		if (e.getSource()== defInventory) {
			buttonsView.removeAll();
			this.removeAll();
			this.add(buttonsView);
			buttonsView.add(invLabel);
			this.add(addProd);
			this.add(editProd);
			this.add(removeProd);
			this.add(adjustStock);
			this.add(invReport);
			this.add(defSales);
			refresh();
		}
		
		// Sales Button
		if (e.getSource() == defSales) {
			buttonsView.removeAll();
			this.removeAll();
			this.add(buttonsView);
			buttonsView.add(salesLabel);
			this.add(addSale);
			this.add(undoLast);
			this.add(salesReport);
			this.add(defInventory);
			refresh();
		}
		
		//						####
		// View Buttons End
		
		
		// Inventory Buttons Start
		//						####
		
		// Add Product
		if (e.getSource() == addProd) {
			System.out.println("Add Product");
			new ProductInput();
		}

		// Edit Product
		if (e.getSource() == editProd) {
			System.out.println("Edit Product");
			new EditPrice();
		}

		// Remove Product
		if (e.getSource() == removeProd) {
			System.out.println("Remove Product");
			new RemoveProduct();
		}

		// Adjust Stock
		if (e.getSource() == adjustStock) {
			System.out.println("Adjust Stock");
			new AdjustStock();
		}
		
		// Inventory Report
		if (e.getSource() == invReport) {
			System.out.println("Inventory Report");
		}
		
		//						####
		// Inventory Buttons End
		
		// Sales Buttons Start
		//						####

		// Add Sale
		if (e.getSource() == addSale) {
			System.out.println("Add Sale");
			new SaleInput();
		}

		// Undo Last Sale
		if (e.getSource() == undoLast) {
			System.out.println("Undo Sale");
		}

		// Sales Report
		if (e.getSource() == salesReport) {
			System.out.println("Sales Report");
		}
		
		//						####
		// Sales Buttons End
	}

}
