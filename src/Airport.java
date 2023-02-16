import java.util.ArrayList;

public class Airport {
	private String name;
	private ArrayList<ClerkDesk> clerkDesks = new ArrayList<ClerkDesk>();
	private ArrayList<Kiosk> kiosks = new ArrayList<Kiosk>();
	private ArrayList<Plane> airportPlanes = new ArrayList<Plane>();
	// Array of Passengers?
	// Array of Security Check?

	public void updateName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public void createClerk(int iD) {
		ClerkDesk clerk = new ClerkDesk(iD);
		clerkDesks.add(clerk);
	}

	public void createKiosk(int iD) {
		Kiosk kiosk = new Kiosk(iD);
		kiosks.add(kiosk);
	}

	public void addPlanes(Plane plane) {
		airportPlanes.add(plane);
	}

	// security check methods?
}