package themen;

import java.util.*;

public class Maps {

    public static void main(String[] args) {
        /*
         * in Maps speichern wir Schluessel-Werte-Paare
         * Schluessel sind eindeutig, Schluesseltyp K
         * Werte koennen sich doppel, Wertetyp V
         * statt add(), addAll() hier put(), putAll()
         */

        Map<String, Integer> mapA = new HashMap<>();
        mapA.put("A", 1);
        mapA.put("B", 2);
        mapA.put("C", 3);

        /*
         * ein einzelnes Schluessel-Werte-Paar ist vom
         * Typ Map.Entry
         * typisiert: Map.Entry<K,V>
         * unser Beispiel: Map.Entry<String, Integer>
         */

        /*
         * leider nicht iterator(), sondern entrySet()
         * entrySet() erzeugt eine Set von lauter Schluessel-Werte-Paaren
         */

        // Variante 1
        Set<Map.Entry<String, Integer>> allEntriesFromMapA = mapA.entrySet();
        for (Map.Entry<String, Integer> entry : allEntriesFromMapA) {
            System.out.println("Schluessel : " + entry.getKey() + " Wert : " + entry.getValue());
        }

        System.out.println(allEntriesFromMapA.size());

        // Iterator<Map.Entry<String, Integer>> it = allEntriesFromMapA.iterator();

        System.out.println();

        // Variante 2
        for (Map.Entry<String, Integer> entry : mapA.entrySet()) {
            System.out.println("Schluessel : " + entry.getKey() + " Wert : " + entry.getValue());
        }

        System.out.println(mapA.containsKey("B"));
        System.out.println(mapA.containsKey("D"));

        System.out.println(mapA.get("B"));


        System.out.printf("%n%n------------ alle keys von mapA ---------------%n%n");
        Set<String> allKeys = mapA.keySet();
        for (String key : allKeys) {
            System.out.println("key : " + key);
        }

        System.out.printf("%n%n------------ mapA ---------------%n%n");
        mapA.put("B", 5);
        for (Map.Entry<String, Integer> entry : mapA.entrySet()) {
            System.out.println("Schluessel : " + entry.getKey() + " Wert : " + entry.getValue());
        }

        System.out.printf("%n%n------------ mapB ---------------%n%n");
        Map<String, Integer> mapB = new HashMap<>();
        mapB.put("B", 6);
        mapB.put("D", 7);
        for (Map.Entry<String, Integer> entry : mapB.entrySet()) {
            System.out.println("Schluessel : " + entry.getKey() + " Wert : " + entry.getValue());
        }

        mapA.putAll(mapB);
        System.out.printf("%n%n------------ mapA ---------------%n%n");

        for (Map.Entry<String, Integer> entry : mapA.entrySet()) {
            System.out.println("Schluessel : " + entry.getKey() + " Wert : " + entry.getValue());
        }
        mapA.put("E", 1);


        System.out.printf("%n%n------------ alle values von mapA ---------------%n%n");
        Collection<Integer> allValues = mapA.values();
        for (Integer val : allValues) {
            System.out.println("value : " + val);
        }
    }

}