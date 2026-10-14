package task10;

/*
 Table:

 Caller and member                    | Static variable | Non-static variable
 -------------------------------------+-----------------+--------------------
 Static method, directly              | Yes             | No
 Static method, through an object     | Yes             | Yes
 Non-static method, directly          | Yes             | Yes
*/
public class Main {
    public static void main(String[] args) {
        Demo.staticMethod();     // checks case 1 and case 2

        Demo demo = new Demo();
        demo.nonStaticMethod();  // checks case 3
    }
}
