import factory.impl.RussianFactory;
import factory.impl.USAFactory;
import interfaces.TransportFactory;
import transport.interfaces.Aircraft;

public class Main {

    private static TransportFactory factory;
    public static void main(String[] args) {

        if(true){
            factory = new RussianFactory();
        }else{
            factory = new USAFactory();
        }

        factory.createAircraft();
        factory.createCar();


    }
}