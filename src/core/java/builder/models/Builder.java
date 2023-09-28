package core.java.builder.models;

interface Builder {
    void setSeats(int number);

    void setEngine(Engine engine);

    void setTripComputer(String tripComputer);

    void setGPS(String gps);
}
