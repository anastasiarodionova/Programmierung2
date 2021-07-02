package klausurvorbereitung;

import javax.swing.*;
import java.util.*;
import java.awt.BorderLayout;


public class Spieker {
    // fill ArrayList
    static void fillList(List<String> list) {
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
    }

    // print ArrayList
    static void printList(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

    //  g2.setStroke(new BasicStroke(3.0f)) --> macht die Linie bold

    // JPanel Muster Lösung
    public static class Panel extends JFrame {

        public Panel() {
            super("Variante C");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.getContentPane().add(initCenter(), BorderLayout.CENTER);
            this.setSize(400, 200);
            this.setVisible(true);
        }

        JPanel initCenter() {
            JPanel panelCenter = new JPanel();
            JLabel labelCenter = new JLabel("C");
            panelCenter.add(labelCenter);
            return panelCenter;
        }

        // Sortieren
        public static void sortieren(Comparable[] unsorted) {
            for (int bubble = 1; bubble < unsorted.length; bubble++) {
                for (int index = 0; index < unsorted.length - bubble; index++) {
                    if (unsorted[index].compareTo(unsorted[index + 1]) > 0) {
                        Comparable tmp = unsorted[index];
                        unsorted[index] = unsorted[index + 1];
                        unsorted[index + 1] = tmp;
                    }
                }
            }
        }

        // JTextField input = new JTextField(10); --> окно для ввода текста
        // mitte.setLayout(new GridLayout(3,2, 10, 10)); --> в коде можно использовать несколько Layout
        // одновременно таким путем 
    }
}
