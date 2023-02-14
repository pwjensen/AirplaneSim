public class Plane {
	private int planeId;
	protected int passCount;
	private String destination;

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
