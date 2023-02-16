import java.util.ArrayList;

public class ClerkDesk extends CheckInMachine {
	private ArrayList<Employee> employeesWorking = new ArrayList<Employee>();

	public ClerkDesk(int i) {
		machId = i;
	}

}
