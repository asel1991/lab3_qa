package task04;

public class Student {
    String name;
    int rollNo;
    int marks;

    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void addBonus(int bonus) {
        marks = marks + bonus;
    }

    int getMarks() {
        return marks;
    }
}
