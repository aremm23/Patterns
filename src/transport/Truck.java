package transport;

public class Truck implements TransportLogistic {
    @Override
    public void deliverProduct() {
        System.out.println("Truck delivers product");
    }
}
