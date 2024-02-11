import factory.PlaneFactory;
import factory.TransportFactory;
import factory.TruckFactory;
import transport.TransportLogistic;

public class Main {
    public static void main(String[] args) {
        TransportFactory transportFactory = createTransport("Truck");
        TransportLogistic transport = transportFactory.createTransport();

        transport.deliverProduct();
    }
    public static TransportFactory createTransport(String meanOfTransport) {
        if (meanOfTransport.equalsIgnoreCase("Plane")) {
            return new PlaneFactory();
        } else if (meanOfTransport.equalsIgnoreCase("Truck")) {
            return new TruckFactory();
        }
        else throw new IllegalArgumentException(meanOfTransport + " is undefined mean of transport");
    }
}