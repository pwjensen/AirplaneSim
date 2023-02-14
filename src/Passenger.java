public class Passenger extends Person {
	private int phone;
	private Luggage[] luggage;
	private Ticket[] tickets;
	private int ticketCount;

	public void checkIn() {

	}

	public void purchaseTicket() {
		Ticket ticket = new Ticket();
		System.out.println("Your ticket number is: " + ticket.getTicket());
	}

	public void checkBag() {

	}

	public void pickBag() {

	}
}
