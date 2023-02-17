public class Luggage {
	private int luggageNum;
	private String color;
	private int luggageWeight;

	public Luggage(String color, Ticket tix) { // Constructor for luggage
		this.color = color;
		luggageNum = tix.getTicket(); // Sets the luggage number to be the same as the ticket numeber;
	}

	public int getLuggage() { // Return the luggage number
		return luggageNum;
	}

	public void setLuggageWeight(int weight) { // Sets the weight of the luggage
		luggageWeight = weight;
	}

	public int getLuggageWeight() { // Returns the weight of the luggage
		return luggageWeight;
	}

	public void setLuggageColor(String hue) { // Sets the color of the luggage
		color = hue;
	}

	public String getLuggageColor() { // Returns the color of the luggage
		return color;
	}
}
