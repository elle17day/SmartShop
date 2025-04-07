package SaleSoft;

public class Sales {
private String name;
	private String name;
	private int Prise;
	private int QtySold;
	private int Totcost;
	private int data;
	private int time;
	
	void item() {
		name = "";
		Prise = 0;
		QtySold = 0;
		Totcost = 0;
		data = 0;
		time = 0;
		
	}
	
	void item(String name, int prise, int QtySold, int Totcost, int data, int time) {
		this.name = name;
		this.Prise = prise;
		this.QtySold = QtySold;
		this.Totcost = Totcost;
		this.data = data;
		this.time = time;
	}
	
	public String toString() {
		return "Name: " + name + "Prise: " + Prise + "QtySold: " + QtySold + "Totcost: " + Totcost + "Data: " + data + "Time: " + time;	
	}
}
