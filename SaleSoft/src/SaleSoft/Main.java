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
		
		inventoryReport();
		salesReport();
	}
	
	public static void inventoryReport() {
		try {
			File inventoryReport = new File("InventoryReport.csv");
			PrintWriter csvWriter = new PrintWriter(inventoryReport);
			
			// Creating headers within CSV file
			csvWriter.printf("%s, %s, %s, %s\n\n", "Item name", "Stock", "Low Stock Warning", "Price");
			
			// Loop the array to put the elements in the CSV
			for (Inventory item : inventoryList) {
				
				// sets the data types and format they are entered into the CSV file
				// Then inputs them into the CSV
				csvWriter.printf("%s, %d, %d, %f\n", item.getName(), item.getStock(), item.getLowStock(), item.getPrice());
			}
			
			// Closes the CSV writer
			csvWriter.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void salesReport() {
		try {
			File salesReport = new File("SalesReport.csv");
			PrintWriter csvWriter = new PrintWriter(salesReport);
			
			// Creating headers within CSV file
			csvWriter.printf("%s, %s, %s, %s, %s, %s\n\n", "Item name", "Price", "Quantity Sold", "Total Cost", "Date", "Time");
			
			// Loop the array to put the elements in the CSV
			for (Sales item : salesList) {
				
				// sets the data types and format they are entered into the CSV file
				// Then inputs them into the CSV
				csvWriter.printf("%s, %d, %d, %f\n", item.getName(), item.getPrice(), item.getQtySold(), item.getTotCost(), item.getDate(), item.getTime());
			}
			
			// Closes the CSV writer
			csvWriter.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void addStock(String n, int s) throws FileNotFoundException {
		try {
			
			// Loops through the arraylist 
			for (Inventory inven1 : inventoryList) {
				
				// Compared the values stored within the arraylist to the input name
				if (inven1.name.trim().equals(n)) {
					
					// Adds the inpiut value to the stock level and overwrited the stored value
					inven1.stock = (inven1.stock + s);
				} else {
					// Incase the name input is wrong
				}
			}
			
			// Catches general errors such as type errors.
		} catch(Error e) {
			e.printStackTrace();
			
			// If an error occurs that is unexpected, the program will close.
		} finally {
			System.out.println("Critical error occured with user input, saving data and closing program");
			System.exit(0);
		}
	}
	
	public void removeStock(String n, int s) throws FileNotFoundException {
		try {
			
			// Loop through the arraylist
			for (Inventory inven2 : inventoryList) {
				
				// Check the names of the producst by the users input
				if (inven2.name.trim().equals(n)) {
					
					// Set the stock level to the previous stock level - the users input
					inven2.stock = (inven2.stock - s);
				}
				
				else {
					// Input error dialog here
				}
			} 
		} catch(Error e) {
			e.printStackTrace();
			
			// If an error occurs that is unexpected, the program will close.
		} finally {
			System.out.println("Critical error occured with user input, saving data and closing program");
			System.exit(0);
		
		}
	}
	
	public void addProduct(String n, Integer s, Integer lSW, Double p) {
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
			System.exit(0);
		}
	}
	
	public void addSale(String n, Integer q, Integer d, Integer t) {
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
			System.exit(0);
		
		}
	}
}
