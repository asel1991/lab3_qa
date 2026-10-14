package task21;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Asan", 1, 75);
        System.out.println(student);

        /*
         Output BEFORE override (when Student has no toString()):
             task21.Student@2a139a55
         It is the class name + @ + hash code (the number after @ can be diffrent on your computer).
         We can not see any data of the student.

         Output AFTER override:
             Student[name=Asan, roll=1, marks=75]
         Now println(student) shows the real data in the format we wrote.

         Println calls toString() by itself. If we do not override it, Java uses the
         toString() from the class Object, and it prints that unreadable text.
        */
    }
}
