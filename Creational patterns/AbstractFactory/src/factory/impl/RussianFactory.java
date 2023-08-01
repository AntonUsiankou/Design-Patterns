package factory.impl;

import interfaces.TransportFactory;
import transport.impl.aircraft.TU134;
import transport.impl.car.Niva;
import transport.interfaces.Aircraft;
import transport.interfaces.Car;

public class RussianFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}
