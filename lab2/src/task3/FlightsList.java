package task3;

public class FlightsList {
    private List<Flight> flights;

    public FlightsList() {
        this.flights = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void displaySchedule() {
        System.out.println("Flight schedule:");
        flights.forEach(flight -> System.out.println(flight.getInfo()));
    }
}
