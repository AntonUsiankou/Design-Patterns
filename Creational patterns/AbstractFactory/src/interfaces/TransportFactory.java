package interfaces;

import transport.interfaces.Aircraft;
import transport.interfaces.Car;

public interface TransportFactory {

    Car createCar(); // автомобили

    Aircraft createAircraft(); // самолет
}
