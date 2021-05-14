package themen;

public class Triangle {
    private int a, b, c;

    public Triangle(int a, int b, int c) throws IllegalArgumentException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Seiten muessen groesser als 0 sein!");
        } else if (a >= (b + c) || b >= (a + c) || c >= (a + b)) {
            throw new IllegalArgumentException("Kein Dreieck!");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public static void main(String[] args) {
        Triangle d;

        try {
            d = new Triangle(3, 4, 5);        //(3,4,0) und (3,4,8) probieren
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}