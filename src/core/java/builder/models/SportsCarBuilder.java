package core.java.builder.models;

public class SportsCarBuilder implements CarBuilder {

    private Car car;

    @Override
    public void reset() {
        System.out.println("Type of car:\nSPORTS_CAR\n");
        this.car = new Car();
    }

    @Override
    public void buildSeats() {
        car.setSeats(2);
    }

    @Override
    public void buildEngine() {
        car.setEngine(new Engine(3.0, 0.0));
    }

    @Override
    public void buildTripComputer() {
        car.setTripComputer("Functional");
    }

    @Override
    public void buildGPS() {
        car.setGPS("Functional");
    }

    @Override
    public Car getResult() {
        return car;
    }
}
