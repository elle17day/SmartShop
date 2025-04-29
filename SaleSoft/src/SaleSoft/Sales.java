

import java.time.LocalDate;
import java.time.LocalTime;

public class Sales {
	public String name;
	public double price;
	public int qtySold;
	public double totCost;
	public int date;
	public int time;
	
	public Sales(String name, double price, int qtySold, double totCost, int date, int time) {
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
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getQtySold() {
		return this.qtySold;
	}
	
	public double getTotCost() {
		return this.totCost;
	}
	
	public int getDate() {
		return this.date;
	}
	
	public int getTime() {
		return this.time;
	}
	
}