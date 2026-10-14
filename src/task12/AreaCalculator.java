package task12;

public class AreaCalculator {

    // circle
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    // rectangle
    double area(double length, double width) {
        return length * width;
    }

    // triangle (if isTriangle is false we just multiply base and height)
    double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return base * height;
    }

    /*
     Which overloading rule is used for each pair:

     1) area(double radius)  and  area(double length, double width)
        -> NUMBER of parameters (1 and 2)

     2) area(double length, double width)  and  area(double base, double height, boolean isTriangle)
        -> NUMBER of parameters (2 and 3). Also the third paramiter has other type (boolean),
           but the main rule is the number.

     3) area(double radius)  and  area(double base, double height, boolean isTriangle)
        -> NUMBER of parameters (1 and 3)

     Type and order rules are not used here, becouse in all methods the first parameters
     have the same type (double).
    */
}
