import java.util.ArrayList;

class Shape {
    public double area() {
        return 0.0;
    }
}

class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class Q06_ShapeCircleArrayList {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2.0));
        shapes.add(new Circle(3.5));
        shapes.add(new Circle(5.0));

        int number = 1;
        for (Shape shape : shapes) {
            System.out.printf("Circle %d area: %.2f%n", number++, shape.area());
        }
    }
}
