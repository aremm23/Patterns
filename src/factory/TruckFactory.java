package factory;

import transport.TransportLogistic;
import transport.Truck;

public class TruckFactory implements TransportFactory {
    @Override
    public TransportLogistic createTransport() {
        return new Truck();
    }
}
