package core.java.builder.client;

import core.java.builder.models.*;

public class CarBuilderClient {

    public static void main(String[] args) {
        CarBuilder sportsCarBuilder = new SportsCarBuilder();
        Director director= new Director(sportsCarBuilder);
        CarBuilder suvCarBuilder = new SUVCarBuilder();

        director.makeSportsCar(sportsCarBuilder);
        Car sportsCar = sportsCarBuilder.getResult();
        System.out.println("Sports Car Built: " + sportsCar);

        director.makeSUVCar(suvCarBuilder);
        Car suvCar = director.getResult();
        System.out.println("SUV Car Built: " + suvCar);
    }
}
