package task03;

public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone("Samsung", "Galaxy A54", 15, 350);
        Phone p2 = new Phone("Apple", "iPhone 13", 85, 700);

        p1.showInfo();
        System.out.println("Low battery? " + p1.isLowBattery());
        p1.charge(50);
        p1.showInfo();
        System.out.println("Low battery? " + p1.isLowBattery());
        System.out.println("Price with 10% discount: " + p1.priceWithDiscount(10));

        System.out.println();

        p2.showInfo();
        p2.charge(30);   // 85 + 30 is more than 100, so it will be 100
        p2.showInfo();
        System.out.println("Price with 20% discount: " + p2.priceWithDiscount(20));
    }
}
