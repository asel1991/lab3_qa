package task10;

public class Demo {
    static int staticVar = 10;
    int nonStaticVar = 20;

    // Case 1 and 2: we are inside a STATIC method
    static void staticMethod() {
        // 1) static method, directly -> static variable: Yes
        System.out.println("Static method, directly, static variable: " + staticVar);

        // 1) static method, directly -> non-static variable: No
        // System.out.println(nonStaticVar);
        // error: non-static variable nonStaticVar cannot be referenced from a static context

        // 2) static method, through an object -> both variables: Yes
        Demo d = new Demo();
        System.out.println("Static method, through object, static variable: " + d.staticVar);
        System.out.println("Static method, through object, non-static variable: " + d.nonStaticVar);
    }

    // Case 3: we are inside a NON-STATIC method
    void nonStaticMethod() {
        // 3) non-static method, directly -> both variables: Yes
        System.out.println("Non-static method, directly, static variable: " + staticVar);
        System.out.println("Non-static method, directly, non-static variable: " + nonStaticVar);
    }
}
