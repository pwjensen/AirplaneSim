public class Kiosk extends CheckInMachine {
	private int checkedCount;

	public void checkIn(Passenger pass) {
		checkedCount++;
		System.out.println("Welcome! You are the " + checkedCount + "passenger today!");
	}
}
