public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double area() {
        return width * length;
    }
}
