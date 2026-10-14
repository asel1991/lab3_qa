package task02;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 0, 40);
        Car car2 = new Car("BMW", 0, 50);

        System.out.println("Start:");
        car1.showStatus();
        car2.showStatus();

        // different changes for each car
        car1.accelerate(60);
        car1.brake(20);
        car2.accelerate(120);
        car2.brake(50);

        System.out.println("After first moves:");
        car1.showStatus();
        car2.showStatus();

        car1.accelerate(30);
        car2.brake(200);   // more than current speed, so speed must be 0

        System.out.println("After second moves:");
        car1.showStatus();
        car2.showStatus();
    }
}
