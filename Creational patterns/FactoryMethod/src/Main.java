import factory_method.*;

public class Main {
    public static void main(String[] args) {

        CarSelector carSelector = new CarSelector();

        Car car = carSelector.getCar(RoadType.CITY);
        car.drive();
        car.stop();

        car = carSelector.getCar(RoadType.OFF_ROAD);
        car.drive();
        car.stop();

        car = carSelector.getCar(RoadType.GAZON);
    }
}