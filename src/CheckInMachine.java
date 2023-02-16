import java.util.ArrayList;

public abstract class CheckInMachine {
	protected int machId;
	protected ArrayList<Passenger> checkedInPassengers = new ArrayList<Passenger>();

	public void checkIn(Passenger pass) {
		System.out.println("Welcome " + pass.getName() + "! We are glad you have made it!");
		checkedInPassengers.add(pass);
	}
}
