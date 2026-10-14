package task03;

/*
 Task 3: class diagram of Phone

 +----------------------------------------------+
 |                    Phone                     |
 +----------------------------------------------+
 | brand : String                               |
 | model : String                               |
 | battery : int                                |
 | price : double                               |
 +----------------------------------------------+
 | Phone(brand, model, battery, price)          |
 | showInfo() : void                            |
 | charge(int percent) : void                   |
 | isLowBattery() : boolean                     |
 | priceWithDiscount(double percent) : double   |
 +----------------------------------------------+
*/
public class Phone {
    // 4 variables
    String brand;
    String model;
    int battery;      // in percent
    double price;     // in dollars

    // constructor
    Phone(String brand, String model, int battery, double price) {
        this.brand = brand;
        this.model = model;
        this.battery = battery;
        this.price = price;
    }

    // type 1: takes nothing, returns nothing
    void showInfo() {
        System.out.println(brand + " " + model + ", battery " + battery + "%, price " + price + "$");
    }

    // type 2: takes a value, returns nothing
    void charge(int percent) {
        battery = battery + percent;
        if (battery > 100) {
            battery = 100;   // battery can not be more than 100
        }
    }

    // type 3: takes nothing, returns a value
    boolean isLowBattery() {
        return battery < 20;
    }

    // type 4: takes a value and returns a value
    double priceWithDiscount(double percent) {
        return price - price * percent / 100;
    }
}
