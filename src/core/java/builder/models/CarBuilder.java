package core.java.builder.models;

public interface CarBuilder {
    void reset();

    void buildSeats();

    void buildEngine();

    void buildTripComputer();

    void buildGPS();

    Car getResult();
}
