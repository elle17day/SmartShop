package SaleSoft;

public class Inventory {
	public String name;
	public int stock;
	public int lowStockWarning;
	public double price;

	public Inventory(String name, int stock, int lowStockWarning, double price) {
		this.name = name;
		this.stock = stock;
		this.lowStockWarning = lowStockWarning;
		this.price = price;
	}
	
	public String toString() {
		return "Name: " + name + "Low Stock Warning: " + lowStockWarning + "Stock: " + stock + "Price: " + price ;	
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public int getLowStock() {
		return this.lowStockWarning;
	}
	
	public double getPrice() {
		return this.price;
	}
}
