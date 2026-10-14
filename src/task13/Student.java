package task13;

public class Student {
    String name;
    int rollNo;
    int marks;

    // the longest constructor, all other constructors call this one
    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // no parameters -> default values
    Student() {
        this("Unknown", 0, 0);
    }

    // only name -> default rollNo and marks
    Student(String name) {
        this(name, 0, 0);
    }

    void printInfo() {
        System.out.println("Name: " + name + ", rollNo: " + rollNo + ", marks: " + marks);
    }
}
