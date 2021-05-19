package themen;

import java.util.*;

public class Collections {
    public static void main(String[] args) {

        System.out.printf("%n%n-------------- Listen ------------------%n%n");
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new TreeSet<>();

        String s1 = "erster";
        String s2 = "zweiter";
        String s3 = "dritter";
        String s4 = "zweiter";

        Integer i1 = 1;

        System.out.println(set1.add(s1));
        System.out.println(set1.add(s2));
        System.out.println(set1.add(s3));
        System.out.println(set1.add(s4));
        // System.out.println(set1.add(i1));

        System.out.println(set1.size());

        Iterator<String> it = set1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();

        for (String element : set1) {
            System.out.println(element);
        }

        System.out.println(set1.remove("erster"));
        System.out.println(set1.remove("vierter"));
        System.out.println();

        for (String element : set1) {
            System.out.println(element);
        }
        System.out.printf("%n%n-------------- Listen ------------------%n%n");

        List<String> l1 = new ArrayList<>();
        List<String> l2 = new LinkedList<>();

        l1.add(s1);
        l1.add(s2);
        l1.add(s3);
        l1.add(s4);

        for (String s : l1) {
            System.out.println(s);
        }

        System.out.println(l1.size());

        System.out.println(l1.remove("zweiter"));
        System.out.println(l1.remove("vierter"));

        for (String s : l1) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("geloescht : " + l1.remove(1));

        for (String s : l1) {
            System.out.println(s);
        }
        System.out.println();

        l2.add("neu");
        l2.add("alt");

        for (String s : l2) {
            System.out.println(s);
        }

        System.out.println();
        l1.addAll(l2);

        for (String s : l1) {
            System.out.println(s);
        }
        System.out.println();
        l1.removeAll(l2);

        for (String s : l1) {
            System.out.println(s);
        }
    }
}
