import java.util.ArrayList;

public abstract class CheckInMachine extends Machine {
	protected ArrayList<Passenger> checkedInPassengers = new ArrayList<Passenger>(); // Array of passengers who have
																						// checked in with any type of
																						// checkInMachine

	public void checkIn(Passenger pass) { // Checks in a passenger and stores them into the checkedInPassengers array
		checkedInPassengers.add(pass);
		System.out.println("Welcome " + pass.getName() + "! We are glad you have made it!");
	}

	public int getPassengerCount() { // Returns the size of the CheckedInPassengers array
		return checkedInPassengers.size();
	}
}
