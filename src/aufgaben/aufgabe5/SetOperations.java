package aufgaben.aufgabe5;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetOperations {
    Set<Integer> numbers1 = new TreeSet<>();
    Set<Integer> numbers2 = new TreeSet<>();
    Set<Integer> both = new TreeSet<>();

    public void fill() {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            Integer rn1 = Integer.valueOf(r.nextInt(100));
            Integer rn2 = Integer.valueOf(r.nextInt(100));
            numbers1.add(rn1);
            numbers2.add(rn2);
        }
    }

    public void fillBothUnion() {
        both.addAll(numbers1);
        both.addAll(numbers2);
    }

    public void fillBothIntersection() {
        Set<Integer> intersection = new TreeSet<>();
        intersection.addAll(this.numbers1);
        intersection.retainAll(this.numbers2);
        this.both.addAll(intersection);
    }

    public void fillBothDifference() {
        Set<Integer> difference = new TreeSet<>();
        difference.addAll(this.numbers1);
        difference.removeAll(this.numbers2);
        this.both.addAll(difference);
    }

    public void print() {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (this.numbers1.contains(Integer.valueOf(a++))) {
                    System.out.print(" " + '\u25cf');
                } else {
                    System.out.print(" " + '\u2009');
                }
            }
        }
        System.out.println("          ");

        for (int i = 0; i < 10; i++) {
            if (this.numbers2.contains(Integer.valueOf(b++))) {
                System.out.print(" " + '\u25cf');
            } else {
                System.out.print(" " + '\u222a');
            }
        }
        System.out.print("          ");


        for (int j = 0; j < 10; j++) {
            if (this.both.contains(Integer.valueOf(c++))) {
                System.out.print(" " + '\u25cf');
            } else {
                System.out.print(" " + '\u2229');
            }
            System.out.print("          ");

        }
    }

    public static void main(String[] args) {
        SetOperations setOp1 = new SetOperations();
        SetOperations setOp2 = new SetOperations();
        SetOperations setOp3 = new SetOperations();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("          A                                           B                                                                   A\u222aB");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        setOp1.fill();
        setOp1.fillBothUnion();
        setOp1.print();
        System.out.println();
        System.out.println();


        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("          A                                           B                                                                   A\u2229B");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        setOp2.fill();
        setOp2.fillBothUnion();
        setOp2.print();
        System.out.println();
        System.out.println();

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("          A                                           B                                                                   A - B");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        setOp3.fill();
        setOp3.fillBothUnion();
        setOp3.print();

    }

}
