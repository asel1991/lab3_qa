package task18;

public class Child extends Parent {
    String type = "Child type";   // same name as in Parent, so it hides the parent variable

    void showTypes() {
        System.out.println("type       = " + type);
        System.out.println("this.type  = " + this.type);
        System.out.println("super.type = " + super.type);
    }
}
