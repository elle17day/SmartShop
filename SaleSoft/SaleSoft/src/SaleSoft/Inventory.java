package SaleSoft;

public class Inventory {
	private String name;
	private int stock;
	private int lowStockWarning;
	private double price;

	public Inventory(String name, int stock, int lowStockWarning, double price) {
		this.name = name;
		this.stock = stock;
		this.lowStockWarning = lowStockWarning;
		this.price = price;
	}
	
	public String toString() {
		return "Name: " + name + "Low Stock Warning: " + lowStockWarning + "Stock: " + stock + "Price: " + price ;	
	}
}
