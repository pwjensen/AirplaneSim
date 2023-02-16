public class Kiosk extends CheckInMachine {

	public Kiosk(int i) {
		machId = i;
	}

	public void checkIn(Passenger pass) {
		checkedInPassengers.add(pass);
		System.out.println("Welcome! You are the " + checkedInPassengers.size() + "passenger today!");

	}
}
