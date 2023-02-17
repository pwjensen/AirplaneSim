import java.util.ArrayList;

public class Main {
    private static ArrayList<Plane> planes = new ArrayList<Plane>(); // Array of the Planes in the world
    private static ArrayList<Passenger> passengers = new ArrayList<Passenger>(); // Array of Passengers in the world

    public static void main(String[] args) throws Exception {
        // Create Planes
        //
        Plane plane1 = new Plane(1); // Creates a plane
        plane1.setDestination("New Amsterdam"); // Sets the destination of the plane
        Plane plane2 = new Plane(2); // Creates a plane
        plane2.setDestination("Montreal"); // Sets the destination of the plane

        // Add Planes to the World
        //
        planes.add(plane1); // add a plane to the world
        planes.add(plane2); // add a plane to the world

        // Create passenger
        //
        Passenger p1 = new Passenger("Paul", 1234567890);
        p1.setName("Paul Jensen");
        p1.purchaseTicket(new Ticket(1)); // Purchases a ticket

        Passenger p2 = new Passenger("Newton", 456789100);
        p2.purchaseTicket(new Ticket(2));
        p2.addLuggage(new Luggage("Blue", p2.getTicket(0))); // Adds a new luggage to the passenger that has the same
                                                             // number as their ticket
        p2.getPhone(); // Returns the passengers phone number

        // Add Passengers to the World
        //
        passengers.add(p1);

        // Create employee
        //
        Employee e1 = new Employee("Joe", 123456789);
        e1.clockIn();
        e1.clockOut();

        // Create airport
        //
        Airport port1 = new Airport();
        port1.setName("Abington Airlines"); // Set airport name
        port1.addClerkDesk(new ClerkDesk(1)); // Create and add a Clerk Desk to the Airport
        port1.addKiosk(new Kiosk(1)); // Create and add a Kiosk to the Airport
        port1.addSecurity(new SecurityCheck(1)); // Create and add a Security Check machine to the Airport
        port1.addPlane(plane1); // Add plane to Airport
        port1.addPlane(plane2); // Add plane to Airport
        port1.addEmployee(e1); // Add employee to Airport

        port1.getPlane(1).addPassenger(p1); // Add passenger 1 to plane 1

    }
}