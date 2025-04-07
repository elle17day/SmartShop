package SaleSoft;

public class Sales {
private String name;
	private int Stock;
	private int LowStockwarning;
	private int Prise;

	
	void item() {
		name = "";
		Prise = 0;
		Stock = 0;
		LowStockwarning = 0;
	}
	
	void item(String name, int prise, int Stock, int LowStockwarning) {
		this.name = name;
		this.Prise = prise;
		this.Stock = Stock;
		this.LowStockwarning = LowStockwarning;
		
	}
	
	public String toString() {
		return "Name: " + name + "Prise: " + Prise + "Low Stock Warning" + LowStockwarning + "Stock" + Stock;	
	}
}
