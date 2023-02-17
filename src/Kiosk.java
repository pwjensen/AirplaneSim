public class Kiosk extends CheckInMachine { // Inherits all protected and public methods/attributes from parent

	public Kiosk(int i) { // Constructor for the Kiosk
		machId = i;
	}

	public void checkIn(Passenger pass) { // Override for the checkIn method inhereted from CheckInMachine
		checkedInPassengers.add(pass);
		System.out.println("Welcome! You are the " + checkedInPassengers.size() + "passenger today!");

	}
}
