package themen;

public class Exception {
    static char charAt(String s, int index) {
        char c = s.charAt(index);           // kritisch!
        return c;
    }

    static double divide(int divident, int divisor) {
        double result = divident / divisor;   // kritisch!
        return result;
    }

    public static void main(String[] args) {
        System.out.println(divide(5, 0));            // ArithmeticException
        System.out.println(charAt("Hallo", 5));     // StringIndexOutOfBoundsException
    }

}
