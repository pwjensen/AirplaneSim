public class Employee extends Person {
	private int ssn;
	private String department;

	public Employee(String name, int social) {
		this.name = name;
		ssn = social;
	}

	public void clockIn() {
		System.out.println("Welcome in " + this.getName() + "! Let's work hard today!");
	}

	public void clockOut() {
		System.out.println("Thank you for your hard work " + this.getName() + "! Have a nice evening!");
	}

	public void updateSocial(int setId) {
		ssn = setId;
	}

	public int getSocial() {
		return ssn;
	}

	public void updateDepartment(String depart) {
		department = depart;
	}

	public String getDepartment() {
		return department;
	}
}
