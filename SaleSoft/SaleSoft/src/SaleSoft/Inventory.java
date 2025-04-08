package SaleSoft;

public class Inventory {
	private String name;
	private int stock;
	private int lowStockWarning;
	private int price;

	void item(String name, int price, int stock, int lowStockWarning) {
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.lowStockWarning = lowStockWarning;
		
	}
	
	public String toString() {
		return "Name: " + name + "Price: " + price + "Low Stock Warning: " + lowStockWarning + "Stock: " + stock;	
	}
}
