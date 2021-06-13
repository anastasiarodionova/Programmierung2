package themen.shape;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return (2 * (this.width + this.height));
    }

    @Override
    public double area() {
        return this.height * this.width;
    }
}
