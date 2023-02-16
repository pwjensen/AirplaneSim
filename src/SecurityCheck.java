import java.util.Random;

public class SecurityCheck {
	private int checkedPassengers;

	public void checkPerson(Passenger pass) {
		checkedPassengers++;
		boolean goodPerson = checkSafety();

		if (!goodPerson) {
			System.out.println("Halt! See security officer.");
		} else {
			System.out.println("Welcome! You are free to proceed.");
		}
	}

	private boolean checkSafety() {
		Random rand = new Random();
		int upperbound = 116394; // In 2022, TSA found that 1 in every 116,394 travelers were carrying firearms
		int random = rand.nextInt(upperbound);

		if (random == 1) {
			return false;
		} else {
			return true;
		}

	}

	public int getCheckedPassengers() {
		return checkedPassengers;
	}
}
