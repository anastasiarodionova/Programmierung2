package klausurvorbereitung;

import javax.swing.*;
import java.awt.*;

public class Einz extends JFrame {
    Canvas canvas;

    public Einz() {
        super();
        this.setTitle("Klausurvorbereitung 1");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.canvas = new Canvas();
        this.getContentPane().add(this.canvas, BorderLayout.CENTER);
        this.setSize(400, 400);
        this.setVisible(true);
    }

    class Canvas extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.drawLine(10,20,110,120);
        }
    }

    public static void main(String[] args) {
        new Einz();
    }

}
