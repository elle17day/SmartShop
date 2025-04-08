package SaleSoft;

import FrontGUI;
import java.util.ArrayList;

public class Main {

	// Initalises the arraylist for data storing
	ArrayList<Inventory> inventoryList = new ArrayList<Inventory>();
	ArrayList<Sales> salesList = new ArrayList<Sales>();
	
	public static void main(String[] args) {
		new FrontGUI();

	}

}
