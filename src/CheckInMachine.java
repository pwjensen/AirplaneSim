public abstract class CheckInMachine {
	protected int machId;
	protected Passenger[] checkInPassengers;

	public void checkIn(Passenger pass) {
		System.out.println("Welcome " + pass.getName() + "! We are glad you have made it!");
	}
}
