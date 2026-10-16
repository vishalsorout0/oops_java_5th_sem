
class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    double length = 10;
    double breadth = 4;

    void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.area();

        r.display();
        r.area();
    }
}
