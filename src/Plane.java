public class Plane {
	private int planeId;
	private String destination;
	// array of passengers???

	public Plane(int iD) {
		planeId = iD;
	}

	public void setId(int iD) {
		planeId = iD;
	}

	public int getId() {
		return planeId;
	}

	public void setDestination(String dest) {
		destination = dest;
	}

	public String getDestination() {
		return destination;
	}
}
