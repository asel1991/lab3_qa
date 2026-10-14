package task08;

public class Employee {
    private static int nextId = 1000;   // one counter for the whole class

    private int id;                     // every employee has own id
    private String name;

    Employee(String name) {
        this.name = name;
        this.id = nextId++;   // take the current number, then increase it by 1
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    /*
     Why id is non-static but nextId is static:
     id is different for every employee (every object needs its own copy),
     so it is non-static. nextId is only one counter which is shared by all
     employees, so it must be static. It belongs to the class, not to one object.
     If nextId was non-static, every new employee would have own counter 1000
     and all ids would be the same.
    */
}
