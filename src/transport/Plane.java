package transport;

public class Plane implements TransportLogistic {
    @Override
    public void deliverProduct() {
        System.out.println("Plane deliver product");
    }
}
