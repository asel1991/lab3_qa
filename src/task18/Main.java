package task18;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.showTypes();

        /*
         Explanation:
         type       -> "Child type". Inside the Child class the name type means the variable
                       of Child, because it hides the variable with the same name from Parent.
         this.type  -> "Child type". this is the current object, and its own type variable
                       is taken, so the result is the same as just type.
         super.type -> "Parent type". super means the parent part of the object, so with it
                       we can reach the hidden variable from Parent.
        */
    }
}
