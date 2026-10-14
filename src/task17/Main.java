package task17;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        /*
         Order of the output:
         1) LivingBeing constructor
         2) Animal constructor
         3) Dog constructor

         Why the parent constructor runs first:
         The first line of every constructor is super(), Java adds it by itself if we
         do not write it. So Dog() calls Animal(), and Animal() calls LivingBeing().
         LivingBeing finishes first, then Animal, and only then the body of Dog runs.
         It is logical, becouse the child is built on top of the parent and the parent
         part of the object must be ready before the child can use it.
        */
    }
}
