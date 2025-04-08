package SaleSoft;

public class Sales {
	private String name;
	private int price;
	private int qtySold;
	private int totCost;
	private int data;
	private int time;
	
	void item(String name, int price, int qtySold, int totCost, int data, int time) {
		this.name = name;
		this.price = prise;
		this.qtySold = QtySold;
		this.totCost = Totcost;
		this.data = data;
		this.time = time;
	}
	
	public String toString() {
		return "Name: " + name + "Price: " + Price + "Quantity Sold: " + qtySold + "Total Cost: " + totcost + "Data: " + data + "Time: " + time;	
	}
}
