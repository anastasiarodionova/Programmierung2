package uebungen.uebung6;

import java.util.ArrayList;
import java.util.List;

public class Stadt {
    String name;
    List<Integer> bevoelkerung;
    float flaeche;

    public Stadt(String name, List<Integer> bevoelkerung, float flaeche) {
        this.bevoelkerung = bevoelkerung;
        this.flaeche = flaeche;
        this.name = name;
    }

    public void print(){
        System.out.println();
    }

    public static void main(String[] args) {
        List<Stadt> staedteListe = new ArrayList<>();

    }
}
