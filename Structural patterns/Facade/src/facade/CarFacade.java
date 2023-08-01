package facade;

import parts.Door;
import parts.Launch;
import parts.Wheel;

public class CarFacade {

    private Door door = new Door();
    private Launch launch = new Launch();
    private Wheel wheel = new Wheel();

    public void go(){
        door.open();
        launch.fire();
        wheel.turn();
    }
}
