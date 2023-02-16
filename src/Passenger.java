import java.util.ArrayList;

public class Passenger extends Person {
	private int phone;
	private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
	private ArrayList<Luggage> luggage = new ArrayList<Luggage>();

	public Passenger(String name, int cell) {
		phone = cell;
		this.name = name;
	}

	public void purchaseTicket() {
		Ticket ticket = new Ticket();
		tickets.add(ticket);
		System.out.println("Your ticket number is: " + ticket.getTicket());
	}

	public void setPhone(int cell) {
		phone = cell;
	}

	public int getPhone() {
		return phone;
	}

	// add luggage methods

	// add ticket methods

}
