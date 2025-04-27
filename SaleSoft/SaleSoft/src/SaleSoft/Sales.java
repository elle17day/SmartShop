

import java.time.LocalDate;
import java.time.LocalTime;

public class Sales {
	public String name;
	public int price;
	public int qtySold;
	public int totCost;
	public int date;
	public int time;
	
	public Sales(String name, int price, int qtySold, int totCost, int date, int time) {
		this.name = name;
		this.price = price;
		this.qtySold = qtySold;
		this.totCost = totCost;
		this.date = date;
		this.time = time;
	}
	
	public String toString() {
		return "Name: " + name + "Price: " + price + "Quantity Sold: " + qtySold + "Total Cost: " + totCost + "Date: " + date + "Time: " + time;	
	}
}