package core.java.builder.models;

public class SUVCarBuilder implements CarBuilder {

    private Car car;

    @Override
    public void reset() {
        System.out.println("Type of car:\nSUV_CAR\n");
        this.car = new Car();
    }

    @Override
    public void buildSeats() {
        car.setSeats(4);
    }

    @Override
    public void buildEngine() {
        car.setEngine(new Engine(5.0, 40.0));
    }

    @Override
    public void buildTripComputer() {
        car.setTripComputer("Not Functional");
    }

    @Override
    public void buildGPS() {
        car.setGPS("Not Functional");
    }

    @Override
    public Car getResult() {
        return car;
    }
}
