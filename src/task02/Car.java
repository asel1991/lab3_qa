package task02;

// Task 2: class Car
public class Car {
    String brand;
    int speed;
    double fuel;

    Car(String brand, int speed, double fuel) {
        this.brand = brand;
        this.speed = speed;
        this.fuel = fuel;
    }

    void accelerate(int amount) {
        if (fuel <= 0) {
            System.out.println(brand + ": no fuel, can not accelerate");
            return;
        }
        speed = speed + amount;
        fuel = fuel - amount * 0.1;   // car uses some fuel when it accelerates
        if (fuel < 0) {
            fuel = 0;
        }
    }

    void brake(int amount) {
        speed = speed - amount;
        // speed must never go below 0
        if (speed < 0) {
            speed = 0;
        }
    }

    void showStatus() {
        System.out.printf("%s | speed = %d km/h | fuel = %.1f L%n", brand, speed, fuel);
    }
}
