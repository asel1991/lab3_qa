package task04;

public class Main {
    public static void main(String[] args) {
        Student a = new Student("Asan", 1, 70);
        Student b = a;
        b.addBonus(10);
        System.out.println(a.getMarks());
        // My prediction: 80
        // Result after run: 80  (prediction was right)

        Student c = new Student("Asan", 1, 70);
        System.out.println(a == c);
        // My prediction: false
        // Result after run: false  (prediction was right)

        /*
         Answer:
         When I write b = a, the object is NOT copied, only the refrence is copied.
         So a and b point to the same object in memory, and when b adds bonus, a sees it too.
         And c is a new object, so a == c is false even if the values inside are the same.
        */
    }
}
