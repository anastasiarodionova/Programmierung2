package aufgaben.aufgabe6;

import java.util.*;

public class PizzaMenu {
    private HashMap<String, Double> menu = new HashMap<>();

    public void setMenu(HashMap<String, Double> menu) {
        this.menu = menu;
    }

    public HashMap<String, Double> getMenu() {
        return this.menu;
    }

    public PizzaMenu() {
        this.menu.put("Margherita", 7.00);
        this.menu.put("Veggie", 7.50);
        this.menu.put("Salami", 8.50);
        this.menu.put("Schinken", 8.50);
    }

    public static boolean existingPizza(Map<String, Double> menu, String pizza) {
        return menu.containsKey(pizza);
    }

    public static void printPrice(Map<String, Double> menu, String pizza) {
        if (existingPizza(menu, pizza)) {
            System.out.println(pizza + " : " + menu.get(pizza) + " Euro");
        } else {
            System.out.println(pizza + ": Diese Pizza gibt es nicht.");
        }
    }

    public void printMenu() {
        if (this.menu.size() > 0) {
            System.out.println("Das Menu enthält " + this.menu.size() + " Pizzen.");
            for (String i : this.menu.keySet()) {
                System.out.println("Pizza " + i + " " + this.menu.get(i) + " Euro.");
            }
        } else {
            System.out.println("Das Menu enthält 0 Pizzen.");
        }
    }

    public static void affordablePizza(Map<String, Double> menu, double maxPrice) {
        boolean a = false;  // durch boolean soll i nur 1 Mal
        System.out.println("Eingegebener Betrag: " + maxPrice + " Euro");
        for (String i : menu.keySet()) {
            if (maxPrice >= menu.get(i)) {
                System.out.println("Mögliche Pizzen: [ " + i + " ]");
                a = true;
            }
        }
        if (a == false) {
            System.out.println("Leider gibt es zu diesem Preis keine Pizza.");
        }
    }

    public static void main(String[] args) {
        long a = 1000;
        Integer b = 1000; // class Integer
        Integer c = 1000;
        System.out.println(a == b); // true, Auto-boxing
        System.out.println((long) b == (long) c); //true

        PizzaMenu pizza = new PizzaMenu();
        System.out.println(PizzaMenu.existingPizza(pizza.getMenu(), "Veggie"));
        PizzaMenu.printPrice(pizza.getMenu(), "Hawaii");
        pizza.printMenu();
        pizza.getMenu().put("Schinken", 8.20);
        System.out.println();
        pizza.printMenu();

        System.out.println();
        PizzaMenu.affordablePizza(pizza.getMenu(), 4);
        System.out.println();
        PizzaMenu.affordablePizza(pizza.getMenu(), 8);
        System.out.println();
        pizza.getMenu().clear();
        pizza.getMenu().put("Verde", 7.00);
        pizza.getMenu().put("Hawaii", 8.20);
        pizza.getMenu().put("Tradizionale", 8.50);
        pizza.printMenu();

    }
}
