import java.util.Random;

public class SecurityCheck extends Machine { // Inherits all protected and public methods/attributes from parent
	private int checkedPassengers;

	public SecurityCheck(int iD) {
		machId = iD;
	}

	public void checkPerson(Passenger pass) { // Checks a person in the security machine, calls checkSafety() to
												// determine safety.
		checkedPassengers++;
		boolean goodPerson = checkSafety();

		if (!goodPerson) {
			System.out.println("Halt! See security officer.");
		} else {
			System.out.println("Welcome! You are free to proceed.");
		}
	}

	private boolean checkSafety() { // Thjs is called to determine whether a person is carrying any firearm when
									// getting checked.
		Random rand = new Random();
		int upperbound = 116394; // In 2022, TSA found that 1 in every 116,394 travelers were carrying firearms
		int random = rand.nextInt(upperbound);

		if (random == 1) {
			return false;
		} else {
			return true;
		}

	}

	public int getCheckedPassengers() { // Returns the number of passengers who have been through the security check
		return checkedPassengers;
	}
}
