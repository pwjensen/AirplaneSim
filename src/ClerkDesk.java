import java.util.ArrayList;

public class ClerkDesk extends CheckInMachine {
	// How to get this to work the way I want it to
	private ArrayList<Employee> employeesWorking = new ArrayList<Employee>();

	public ClerkDesk(int i) {
		machId = i;
	}

}

// association or aggregation with passenger/employee because of parent class?