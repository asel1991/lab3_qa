package task08;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Asan");
        Employee e2 = new Employee("Aigul");
        Employee e3 = new Employee("Bakyt");
        Employee e4 = new Employee("Nurzat");
        Employee e5 = new Employee("Timur");

        System.out.println(e1.getName() + " -> id " + e1.getId());
        System.out.println(e2.getName() + " -> id " + e2.getId());
        System.out.println(e3.getName() + " -> id " + e3.getId());
        System.out.println(e4.getName() + " -> id " + e4.getId());
        System.out.println(e5.getName() + " -> id " + e5.getId());
    }
}
