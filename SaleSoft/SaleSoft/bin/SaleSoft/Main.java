package SaleSoft;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {

	// Initialises the Array List for data storage
	static ArrayList<Inventory> inventoryList = new ArrayList<Inventory>();
	static ArrayList<Sales> salesList = new ArrayList<Sales>();
	
	public static void main(String[] args) throws FileNotFoundException {
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
		csvWriteTest();
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
	
	public static void csvWriteTest() throws FileNotFoundException {
		try {
			File csvTest = new File("csvTestDoc.csv");
			PrintWriter csvWriter = new PrintWriter(csvTest);
			
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
}
