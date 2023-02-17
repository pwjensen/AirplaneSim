import java.util.ArrayList;

public class Plane {
	private int planeId;
	private String destination;
	ArrayList<Passenger> passengers = new ArrayList<Passenger>(); // Array of passengers attending the flight

	public Plane(int iD) { // Constructor for the Plane
		planeId = iD;
	}

	public void setId(int iD) { // Sets the ID for the plane
		planeId = iD;
	}

	public int getId() { // Returns the ID for the plane
		return planeId;
	}

	public void setDestination(String dest) { // Sets the destination of the plane
		destination = dest;
	}

	public String getDestination() { // Returns the destination of the plane
		return destination;
	}

	public void addPassenger(Passenger person) { // Adds a passenger to the flight
		passengers.add(person);
	}

	public void removePassenger(Passenger person) { // Removes a passenger from the flight
		passengers.remove(person);
	}

	public Passenger getPassenger(int num) { // Returns a passenger who is on the flight
		return passengers.get(num);
	}
}
