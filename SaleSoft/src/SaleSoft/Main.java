//package SaleSoft;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {

	// Initialises the Array List for data storage
	static ArrayList<Inventory> inventoryList = new ArrayList<Inventory>();
	static ArrayList<Sales> salesList = new ArrayList<Sales>();
	static ArrayList<String> invenTitles = new ArrayList<String>();
	
	public static void main(String[] args) throws FileNotFoundException {
		new Front();
		
		Inventory item1 = new Inventory("Milk", 20, 5, 2);
		Inventory item2 = new Inventory("Pepsi_Max", 20, 20, 3.50);
		Inventory item3 = new Inventory("Gucci_sliders", 10, 2, 1000);
		
		inventoryList.add(item1);
		inventoryList.add(item2);
		inventoryList.add(item3);
		
		Sales sale1 = new Sales("Milk", 2, 5, 10, 290425, 10);
		Sales sale2 = new Sales("Pepsi_Max", 3.50, 1, 3.50, 170425, 10);
		Sales sale3 = new Sales("Gucci_Sliders", 1000, 5, 5000, 290325, 10);
		
		salesList.add(sale1);
		salesList.add(sale2);
		salesList.add(sale3);
		
		Report.inventoryReport();
		Report.salesReport();
	}
	
	public static void adjustStock(String n, int s, int lsw) {
		try {
			
			// Loops through the arraylist 
			for (Inventory inven1 : inventoryList) {
				
				// Compared the values stored within the arraylist to the input name
				if (inven1.name.trim().equals(n)) {
					
					// Adds the inpiut value to the stock level and overwrited the stored value
					inven1.stock = s;
					inven1.lowStockWarning = lsw;
				} else {
					// Incase the name input is wrong
				}
				Report.inventoryReport();
			}
			
			// Catches general errors such as type errors.
		} catch(Error e) {
			e.printStackTrace();
			
			// If an error occurs that is unexpected, the program will close.
		} finally {
			System.out.println("Critical error occured with user input, saving data and closing program");
			Report.inventoryReport();
			System.exit(0);
		}
	}
	
	public static void addProduct(String n, Integer s, Integer lSW, Double p) {
		try {
			
			if ((n != null) && (s != null) && (lSW != null) && (p != null)) {
				// Takes input values and put them into a new inventory object
				Inventory item4 = new Inventory(n, s, lSW, p);
				
			} else {
				System.out.println("Error, Please ensure to enter data into all areas");
			}
		} catch(Error e) {
			e.printStackTrace();
		} finally {
			System.out.println("Critical error occured with user input, saving data and closing program");
			Report.inventoryReport();
			System.exit(0);
		}
	} 
	
	public static void editProduct(String n, Double p) {
		try {
			// Check for user input data
			if ((n != null) && (p != null)) {
				
				// Loop through the inventory
				for (Inventory inven3 : inventoryList) {
					
					// Check for a product matching the input name
					if (inven3.getName().trim().equals(n)) {
						
						// set the price of the product to the input price
						inven3.price = p;
					}
				}
			}
		} catch(Error e) {
			e.printStackTrace();
		} finally {
			System.out.println("Critical error occured with user input, saving data and closing program");
			Report.inventoryReport();
			System.exit(0);
		}
	}
	
	public static void removeProduct(String s) {
		try {
			if (s != null) {
				for (Inventory inven1 : inventoryList) {
					if (inven1.name.trim().equals(s)) {
						inventoryList.remove(inven1);
					}
				}
			}
		} catch(Error e) {
			e.printStackTrace();
		} finally {
			System.out.println("Critical error occured with user input, saving data and closing program");
			Report.inventoryReport();
			System.exit(0);
		}
	}
	
	public static void addSale(String n, Integer q, Integer d, Integer t) {
		try {
			// Checking that data is input
			if ((n != null) && (q != null) && (d != null) && (t != null)) {
				
				// Looping through the inventory list
				for (Inventory inven1 : inventoryList) {
					
					// Checking for products with the same name in the inventory
					if (inven1.getName().trim().equals(n)) {
						
						// Creating a sale based on the input information as well as the price of the product from the inventory
						Sales sale4 = new Sales(n, inven1.getPrice(), q, (q * inven1.getPrice()), d, t);
					}
				}
			} else {
				System.out.println("Error, Please ensure to enter data into all areas");
			}
			
		} catch(Error e) {
			e.printStackTrace();
			
			// If an error occurs that is unexpected, the program will close.
		} finally {
			System.out.println("Critical error occured with user input, saving data and closing program");
			Report.salesReport();
			System.exit(0);
		}
	}
	
	public static void undoSale() {
		try {
			// Measure the length of the arraylist
			int index = salesList.size() - 1;
			
			// If there is extra data aside from the default values
			if (index > 3) {
				
				// Remove the most recent sale from the arraylist
				salesList.remove(index); 
			}
			
		} catch(Error e) {
			e.printStackTrace();
		} finally {
			System.out.println("Critical error occured with user input, saving data and closing program");
			Report.salesReport();
			System.exit(0);
		}
	}
	
	
}
