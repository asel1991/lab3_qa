package task13;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Aigul");
        Student s3 = new Student("Asan", 1, 75);

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
    }
}
