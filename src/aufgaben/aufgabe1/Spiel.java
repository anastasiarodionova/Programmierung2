package aufgaben.aufgabe1;

import javax.swing.JOptionPane;

public class Spiel {
    public static int siegPunkte;
    private Spieler[] spieler;

    public Spiel() {
        int anzSpieler = 0;
        int siegPunkte = 0;
        boolean inputOk = false;
        String input = "";

        while(!inputOk) {
            try {
                input = JOptionPane.showInputDialog("Anzahl Spieler :");
                inputOk = true;
                anzSpieler = Integer.parseInt(input);
            }
            catch(NumberFormatException e) {
                inputOk = false;
            }
        }
        inputOk = false;

        while(!inputOk) {
            try {
                input = JOptionPane.showInputDialog("Siegpunkte :");
                inputOk = true;
                siegPunkte = Integer.parseInt(input);
            }
            catch(NumberFormatException e) {
                inputOk = false;
            }
        }

        Spiel.siegPunkte = siegPunkte;
        spieler = new Spieler[anzSpieler];
        namenErmitteln();
    }

    public Spiel(int siegPunkte, int anzSpieler) {
        Spiel.siegPunkte = siegPunkte;
        spieler = new Spieler[anzSpieler];
        namenErmitteln();
    }

    private void namenErmitteln() {
        for(int i=0; i<spieler.length; i++) {
            String name = JOptionPane.showInputDialog("Name des Spielers " + (i+1)+" :");
            spieler[i] = new Spieler(name);
        }
    }

    public void spielen() {
        int index = 0;
        boolean gewonnen = false;
        while(!gewonnen) {
            gewonnen = spieler[index].wuerfeln();
            index = (index<spieler.length-1) ? index+1 : 0;
        }
    }

    public static void main(String[] args) {
        Spiel spiel = new Spiel();
        spiel.spielen();
    }
}
