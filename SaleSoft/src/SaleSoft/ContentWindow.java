

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

public class ContentWindow extends JPanel{
	private static final long serialVersionUID = -5606545154853222793L;

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
	
	// Debug Table Values:
	String[] salesCols = {"Sale 1","Sale 2","Sale 3","Sale 4"};
	String[] prodsCols = {"Product","Stock","Restock @","Price"};
	Object [][] debugSales = {
			{"Prod1","Price1","Date1","Time1"},
			{"Prod2","Price2","Date2","Time2"},
			{"Prod3","Price3","Date3","Time3"}
	};
	Object [][] debugProds = {
			{"Prod4","Price4","Date4","Time4"},
			{"Prod5","Price5","Date5","Time5"},
			{"Prod6","Price6","Date6","Time6"}
	};
	
	ContentWindow() {
		// Panel for holding Sheets
		this.setPreferredSize(new Dimension(860,740));
		this.setBackground(altBG);
		this.setLayout(new FlowLayout());
		this.setBorder(altBorder);
	}
	
	public void saleTable() {
		this.removeAll();
		// this.setBackground(Color.black); // debug
		JTable sales = new JTable(debugSales,salesCols);
		JScrollPane scroll = new JScrollPane(sales);
		this.add(scroll);
		this.refresh();
	}
	
	public void prodTable() {
		this.removeAll();
		// this.setBackground(Color.blue); // debug
		JTable prods = new JTable(debugProds,prodsCols);
		JScrollPane scroll = new JScrollPane(prods);
		this.add(scroll);
		this.refresh();
	}

	private void refresh() {
		this.repaint();
		this.revalidate();
	}

}
