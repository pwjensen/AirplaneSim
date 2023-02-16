public class Kiosk extends CheckInMachine {
	// Ask about attributes for this class if the parent class already has the id
	public Kiosk(int i) {
		machId = i;
	}

	public void checkIn(Passenger pass) {
		checkedInPassengers.add(pass);
		System.out.println("Welcome! You are the " + checkedInPassengers.size() + "passenger today!");

	}
}
