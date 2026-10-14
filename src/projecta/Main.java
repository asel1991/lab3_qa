package projecta;

public class Main {
    public static void main(String[] args) {
        // 1. create 3 students
        Student s1 = new Student("Asan", 1, 85);
        Student s2 = new Student("Aigul", 2, 72);
        Student s3 = new Student("Bakyt", 3, 45);

        // 2. details and grade of each one
        System.out.println("--- Details ---");
        s1.printDetails();
        System.out.println("Grade: " + s1.getGrade());
        s2.printDetails();
        System.out.println("Grade: " + s2.getGrade());
        s3.printDetails();
        System.out.println("Grade: " + s3.getGrade());

        // 3. wrong marks, the setter must show an error message
        System.out.println("--- Wrong marks ---");
        s3.setMarks(150);
        s3.setMarks(-5);
        System.out.println("Marks of Bakyt now: " + s3.getMarks());   // still 45

        // good marks work
        System.out.println("--- Good marks ---");
        s3.setMarks(65);
        s3.printDetails();
        System.out.println("Grade: " + s3.getGrade());   // now B

        // s1.marks = 100;   // does not work, marks is private

        // 4. total number of students (static method, we use the class name)
        System.out.println("--- Total ---");
        System.out.println("Total students: " + Student.getTotalStudents());
    }
}
