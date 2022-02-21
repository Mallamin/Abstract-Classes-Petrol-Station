
public class FuelStations {

	public static void main(String[] args) {
		System.out.println("---Station1---");
		Stations station1 = new Stations();
		String city1 = station1.city = "Turin";
		System.out.println("City: " + city1 + "");
		String owner1 = station1.owner = "Denny";
		System.out.println("Owner: " + owner1 + "");
		
		double capacity1 = 100;
		station1.currentfuelContent = 20;
		station1.fuelBought = 15;
		double price = station1.price = 100;
		System.out.println("Price: " + price + " Euros per liter");

		double totalSales1 = station1.price * station1.fuelBought;
		System.out.println("Sales made: " + totalSales1 + " Euros");

		station1.pump();
		System.out.println("               ");
		System.out.println("---Station2---");
		Stations station2 = new Stations();

		String city2 = station2.city = "Freetown";
		System.out.println("City: " + city2 + "");
		String owner2 = station2.owner = "Lamin";
		System.out.println("Owner: " + owner2 + "");

		double capacity2 = 80;
		station2.currentfuelContent = 40;
		station2.fuelBought = 15;
		double price2 = station2.price = 10;
		System.out.println("Price: " + price2 + " Euros per liter");
		double totalSales2 = station2.price * station2.fuelBought;
		System.out.println("Sales made: " + totalSales2 + " Euros");

		station2.pump();
		
		System.out.println("        ");
		System.out.println("---Comparison of Station1 and Station2 based on capacity---");
		station1.distributorsComparison(capacity1, capacity2);

	}

}
