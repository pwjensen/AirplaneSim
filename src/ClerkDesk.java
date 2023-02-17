public class ClerkDesk extends CheckInMachine { // Inherits all protected and public methods/attributes from parent
												// class
	private String employeeCurrentlyWorking;

	public ClerkDesk(int i) { // Constructor for ClerkDesk
		machId = i;
	}

	public void setEmployeeWorking(Employee emp) { // Sets the current employee working at the Clerk Desk
		employeeCurrentlyWorking = emp.getName();
	}

	public String getEmployeeWorking() { // Returns the current employee working at the ClerkDesk
		return employeeCurrentlyWorking;
	}

}