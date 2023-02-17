import java.util.ArrayList;

public class Passenger extends Person { // Inherits all protected and public methods/attributes from parent
	private int phone;
	private ArrayList<Ticket> tickets = new ArrayList<Ticket>(); // Array of Tickets owned by the passenger
	private ArrayList<Luggage> luggage = new ArrayList<Luggage>(); // Array of luggage the Passenger owns

	public Passenger(String name, int cell) { // Constructor for passenger
		phone = cell;
		this.name = name;
	}

	public void purchaseTicket(Ticket tix) { // Adds a ticket to the Passengers belongings
		tickets.add(tix);
		System.out.println("Your ticket number is: " + tix.getTicket());
	}

	public Ticket getTicket(int ticket) { // Return ticket at given index of the array
		return tickets.get(ticket);
	}

	public void setPhone(int cell) { // Sets passengers phone number
		phone = cell;
	}

	public int getPhone() { // Returns passengers phone number
		return phone;
	}

	public void addLuggage(Luggage newLuggage) { // Add luggage to the
		luggage.add(newLuggage);
	}

	public Luggage getLuggage(int num) { // Return luggage at given index of the array
		return luggage.get(num);
	}

}
