import java.util.ArrayList;

public class Main {
    private static ArrayList<Plane> planes = new ArrayList<Plane>();
    private static ArrayList<Passenger> passengers = new ArrayList<Passenger>();

    public static void main(String[] args) throws Exception {
        // Create Planes
        //
        Plane plane1 = new Plane(1);
        plane1.setDestination("New Amsterdam");
        Plane plane2 = new Plane(2);
        plane2.setDestination("Montreal");

        // Add Planes to the World
        //
        planes.add(plane1);
        planes.add(plane2);

        System.out.println(planes);

        // Create passenger
        //
        Passenger p1 = new Passenger("Paul", 1234567890);
        p1.setName("Paul Jensen");
        p1.purchaseTicket();

        // Add Passengers to the World
        //
        passengers.add(p1);

        // Create employee
        //
        Employee e1 = new Employee("Joe", 123456789);
        e1.clockIn();
        e1.clockOut();

    }
}