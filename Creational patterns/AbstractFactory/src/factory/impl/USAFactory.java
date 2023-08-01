package factory.impl;

import interfaces.TransportFactory;
import transport.impl.aircraft.Boeing747;
import transport.impl.car.Porsche;
import transport.interfaces.Aircraft;
import transport.interfaces.Car;

public class USAFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }
}
