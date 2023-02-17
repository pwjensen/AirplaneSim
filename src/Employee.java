public class Employee extends Person { // Inherits all protected and public methods/attributes from parent
	private int ssn;
	private String department;

	public Employee(String name, int social) { // Constructor for Employee
		this.name = name;
		ssn = social;
	}

	public void clockIn() { // Clocks in employee
		System.out.println("Welcome in " + this.getName() + "! Let's work hard today!");
	}

	public void clockOut() { // Clocks out employee
		System.out.println("Thank you for your hard work " + this.getName() + "! Have a nice evening!");
	}

	public void setSocial(int setId) { // Updates the SSN for the current employee
		ssn = setId;
	}

	public int getSocial() { // Returns the SSN for the current employee
		return ssn;
	}

	public void updateDepartment(String depart) { // Updates the Department of the current employee
		department = depart;
	}

	public String getDepartment() { // Returns the Department for the current employee
		return department;
	}
}
