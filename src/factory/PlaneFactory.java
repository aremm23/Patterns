package factory;

import transport.Plane;
import transport.TransportLogistic;

public class PlaneFactory implements TransportFactory {
    @Override
    public TransportLogistic createTransport() {
        return new Plane();
    }
}
