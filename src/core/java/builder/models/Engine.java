package core.java.builder.models;

class Engine {
    private double volume;
    private double mileage;

    Engine() {
    }

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "volume - " + volume + "; mileage - " + mileage;
    }
}
