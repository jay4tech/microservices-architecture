package core.java.builder.models;

public class Director {
    private CarBuilder carBuilder;

    public Director(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void makeSUVCar(CarBuilder carBuilder) {
        carBuilder.reset();
        carBuilder.buildSeats();
        carBuilder.buildEngine();
        carBuilder.buildTripComputer();
        carBuilder.buildGPS();
    }

    public void makeSportsCar(CarBuilder carBuilder1) {
        carBuilder1.reset();
        carBuilder1.buildSeats();
        carBuilder1.buildEngine();
        carBuilder1.buildTripComputer();
        carBuilder1.buildGPS();
    }

    public Car getResult() {
        return this.carBuilder.getResult();
    }
}
