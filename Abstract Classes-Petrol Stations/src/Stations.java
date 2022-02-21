
public class Stations extends Distributors {
	String city;
	String owner;
	double capacity;
	double fuelBought;
	double currentfuelContent;
	double price;

	@Override
	public void pump() {
		double fuelLeft = currentfuelContent - fuelBought;
		System.out.println("The fuel remaining in the tank is: " + fuelLeft + " liter(s)");

	}

	@Override
	public void distributorsComparison(double capacity1, double capacity2) {

		if (capacity1 > capacity2) {

			System.out.println("Station 1 has more capacity than station 2");

		} else if (capacity1 < capacity2) {
			System.out.println("Station two has more capacity than station 1");
		} else {
			System.out.println(" Both stations have the same capacity");

		}

	}

}
