import facade.CarFacade;
import parts.Door;
import parts.Launch;
import parts.Wheel;

public class Main {
    public static void main(String[] args) {

        //вызов без фасада
        Door door = new Door();
        door.open();

        Launch launch = new Launch();
        launch.fire();

        Wheel wheel = new Wheel();
        wheel.turn();

        //вызов с фасадом
        CarFacade carFacade = new CarFacade();
        carFacade.go();
    }
}