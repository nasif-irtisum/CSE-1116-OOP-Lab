abstract class Shape {

    // Abstract method
    abstract double area();
    abstract String getName();
    // Concrete method
    void display() {
        System.out.println("This is a shape");
    }
}
abstract class Shape2 extends Shape{
    public String getName (){
        return "Rob Stark";
    }
}
class Circle extends Shape2 {

    int radius = 5;

    // Implementing abstract method
    @Override
    double area() {
        return 3.14 * radius * radius;
    }
    void checker () {
        System.out.println ("Checking successful!");
    }

}

public class Main {
    public static void main(String[] args) {

        Shape shape = new Circle(); // Upcasting
        Circle cr = new Circle();
        shape.display();
        System.out.println("Area of Circle: " + shape.area());
        System.out.println(shape.getName());

        if (shape instanceof Circle) {
            System.out.println ("Shape is a instance of circle");
            ((Circle)shape).checker();
        }
        if (cr instanceof Shape) System.out.println("Yes");
    }
}