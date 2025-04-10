package SaleSoft;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import FrontGUI;
import java.util.ArrayList;

public class Main {

	// Initialises the Array List for data storage
	static ArrayList<Inventory> inventoryList = new ArrayList<Inventory>();
	static ArrayList<Sales> salesList = new ArrayList<Sales>();
	
	public static void main(String[] args) {
		new FrontGUI();
		
		Inventory item1 = new Inventory("Milk", 20, 5, 2);
		Inventory item2 = new Inventory("Pepsi_Max", 20, 20, 3.50);
		Inventory item3 = new Inventory("Gucci_sliders", 10, 2, 1000);
		
		inventoryList.add(item1);
		inventoryList.add(item2);
		inventoryList.add(item3);
		
		// Testing only
		inventoryReport();
		salesReport();
	}
	
	public static void salesReport() {
		try {
			
		// Creating the file and initialising the writer for adding to it
		File salesFile = new File("SalesReport.txt");
		FileWriter salesWriter = new FileWriter("SalesReport.txt");
		
		// If statement to check if the file exists
		if (salesFile.createNewFile()) {
			
	      } else {
	    	  
	    	  	// Looping through the array
				for (Sales sale : salesList) {
					
					// Writing each element from the array into the file
					salesWriter.write(sale.toString() + "\n");
				}
	      }
		
		// Closing the writer
		salesWriter.close();
		
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void inventoryReport() {
		try {
			// Creating the file and initialising the writer for adding to it
			File inventoryFile = new File("InventoryReport.txt");
			FileWriter inventoryWriter = new FileWriter("InventoryReport.txt");
			
			// If statement to check if the file exists
			if (inventoryFile.createNewFile()) {
			    
			 } else {
				 // Looping through the array
				 for (Inventory item : inventoryList) {
					
					// Writing each element from the array into the file
			        inventoryWriter.write(item.toString() + "\n");
			     }
			 }
			
			 // Closing the writer
			 inventoryWriter.close();
			 
		} catch(IOException f) {
			f.printStackTrace();
		}
	}
}
