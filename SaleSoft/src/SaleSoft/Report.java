import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Report {
	
	public static void inventoryReport() {
		try {
			File inventoryReport = new File("InventoryReport.csv");
			PrintWriter csvWriter = new PrintWriter(inventoryReport);
			
			// Creating headers within CSV file
			csvWriter.printf("%s, %s, %s, %s\n\n", "Item name", "Stock", "Low Stock Warning", "Price");
			
			// Loop the array to put the elements in the CSV
			for (Inventory item : Main.inventoryList) {
				
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
			for (Sales item1 : Main.salesList) {
				
				// sets the data types and format they are entered into the CSV file
				// Then inputs them into the CSV
				csvWriter.printf("%s, %f, %i, %f, %i, %i\n", item1.getName(), item1.getPrice(), item1.getQtySold(), item1.getTotCost(), item1.getDate(), item1.getTime());
			}
			
			// Closes the CSV writer
			csvWriter.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
