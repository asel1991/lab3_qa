package task16;

public class Main {
    public static void main(String[] args) {
        // one array for all, because Car, Bike and Truck are also Vehicle
        Vehicle[] vehicles = {new Car(), new Bike(), new Truck()};

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].start();   // every object uses its own start()
        }
    }
}
