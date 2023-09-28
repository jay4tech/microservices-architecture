package core.java.builder.models;

public class Car implements Builder {
    private int seats;
    private Engine engine;
    private String tripComputer;
    private String gps;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGPS(String gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Count of seats: " + seats + "\nEngine: " + engine + "\nTrip Computer: "
                + tripComputer + "\nGPS Navigator: " + gps + "\n";
    }
}
