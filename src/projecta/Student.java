package projecta;

// Project A: Student Records
public class Student {
    // private variables, so nobody can change them directly from Main
    private String name;
    private int rollNo;
    private int marks;

    // static variable, it is one for the whole class (not for every student)
    private static int totalStudents = 0;

    // constructor sets all three values
    public Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        // marks must be from 0 to 100, also in the constructor
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Error: marks must be from 0 to 100, so marks of " + name + " are set to 0");
            this.marks = 0;
        }
        totalStudents++;   // every new student makes the counter bigger by 1
    }

    // getters
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getMarks() {
        return marks;
    }

    // setter for marks, it accepts only values from 0 to 100
    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Error: marks must be from 0 to 100. You tried " + marks
                    + ", so old marks " + this.marks + " stay the same");
            return;   // we stop here, becouse the value is wrong
        }
        this.marks = marks;
    }

    // A for 80 and above, B for 60 to 79, C for the rest
    public String getGrade() {
        if (marks >= 80) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else {
            return "C";
        }
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", rollNo: " + rollNo + ", marks: " + marks);
    }

    // static method, we can call it without an object: Student.getTotalStudents()
    public static int getTotalStudents() {
        return totalStudents;
    }
}
