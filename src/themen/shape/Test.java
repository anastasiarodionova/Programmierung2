package themen.shape;

public class Test {
    public static void main(String[] args) {
        Shape s = new Rectangle(10, 20);
        System.out.println(s.area());
        System.out.println(s.perimeter());

        Shape s2 = new Circle(1.0);
        System.out.println(s2.perimeter());
        System.out.println(s2.area());

    }
}

