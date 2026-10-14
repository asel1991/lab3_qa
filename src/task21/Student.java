package task21;

public class Student {
    String name;
    int rollNo;
    int marks;

    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Override toString(), now println(student) shows the data, not the memory address
    @Override
    public String toString() {
        return "Student[name=" + name + ", roll=" + rollNo + ", marks=" + marks + "]";
    }
}
