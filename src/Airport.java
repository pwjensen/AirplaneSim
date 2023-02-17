import java.util.ArrayList;

public class Airport {
	private String name; // Name of the airport
	private ArrayList<ClerkDesk> clerkDesks = new ArrayList<ClerkDesk>(); // Array of the Clerk Desks that are present
																			// within the airport
	private ArrayList<Kiosk> kiosks = new ArrayList<Kiosk>(); // Array of the Kiosks that are present within the airport
	private ArrayList<SecurityCheck> security = new ArrayList<SecurityCheck>(); // An array of the security check
																				// machines that are present within the
																				// airport
	private ArrayList<Plane> airportPlanes = new ArrayList<Plane>(); // An array of the planes that are at the airport
	private ArrayList<Employee> employees = new ArrayList<Employee>(); // An array of the employees who work at the
																		// airport
	// Array of Security Check?

	public void setName(String newName) { // Sets the name of the airport
		name = newName;
	}

	public String getName() { // Returns the name of the airport
		return name;
	}

	public void addClerkDesk(ClerkDesk desk) { // Adds a ClerkDesk entry into the array of ClerkDesks at the airport
		clerkDesks.add(desk);
	}

	public void addKiosk(Kiosk ki) { // Adds a Kiosk entry into the array of Kiosks at the airport
		kiosks.add(ki);
	}

	public void addPlane(Plane plane) { // Adds a Plane entry into the array of Planes at the airport
		airportPlanes.add(plane);
	}

	public Plane getPlane(int plane) { // Returns a Plane from the array of Planes
		return airportPlanes.get(plane);
	}

	public void addEmployee(Employee employee) { // Adds an Employee entry into the array of Employees at the airport
		employees.add(employee);
	}

	public Employee getEmployee(int employee) { // Returns an Employee from the array of Employees
		return employees.get(employee);
	}

	public void addSecurity(SecurityCheck secure) { // Adds a SecurityCheck machine entry into the array of
													// SecurityChecks at the airport
		security.add(secure);
	}

	public SecurityCheck getSecurity(int secure) { // Returns a SecurityCheck machine from the array of SecurityChecks.
		return security.get(secure);
	}
}