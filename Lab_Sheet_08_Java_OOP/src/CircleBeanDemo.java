public class CircleBeanDemo {
    public static void main(String[] args) {
        CircleBean circle = new CircleBean();
        circle.setRadius(5.0);

        System.out.printf("Radius: %.2f%n", circle.getRadius());
        System.out.printf("Area: %.2f%n", circle.getArea());
        System.out.printf("Circumference: %.2f%n", circle.getCircumference());
    }
}
