package shapes;
public class Circle {
    double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
