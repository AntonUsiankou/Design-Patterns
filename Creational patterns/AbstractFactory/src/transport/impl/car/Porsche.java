package transport.impl.car;

import transport.interfaces.Car;

public class Porsche implements Car {
    @Override
    public void drive() {
        System.out.println("Drive speed 150 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stropped at 1 sec");
    }

}
