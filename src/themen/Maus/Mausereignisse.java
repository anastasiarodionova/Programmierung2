package themen.Maus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.*;
import java.util.List;
import java.awt.Graphics;

public class Mausereignisse extends JFrame implements MouseListener, MouseMotionListener {
    Canvas canvas;
    List<Point> points;
    Linie aktuelleLinie;
    List<Linie> linien;

    public Mausereignisse() {
        super();
        this.setTitle("Mausereignisse");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.canvas = new Canvas();
        this.canvas.addMouseListener(this);
        this.canvas.addMouseMotionListener(this);
        this.getContentPane().add(this.canvas);

        this.points = new ArrayList<>();
        this.linien = new ArrayList<>();

        this.setSize(400, 400);
        this.setLocation(1000, 100);
        this.setVisible(true);
    }

    private class Canvas extends JPanel {
        final static int DURCHMESSER = 20;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);        // Implementierung von JPanel aufrufen
            Graphics2D g2 = (Graphics2D) g;  // Methoden von Graphics2D nutzbar
            // hier koennen wir zeichnen
            for (Point p : Mausereignisse.this.points) {
                if (p.x > this.getWidth() / 2) {
                    g2.setColor(Color.RED);
                } else {
                    g2.setColor(Color.BLUE);
                }
                g2.fillOval(p.x, p.y, DURCHMESSER, DURCHMESSER);
            }

            g2.setColor(Color.GREEN);

            for (Linie l : Mausereignisse.this.linien) {
                int x1 = l.getXStart();
                int y1 = l.getYStart();
                int x2 = l.getXEnde();
                int y2 = l.getYEnde();

                g2.drawLine(x1, y1, x2, y2);
            }

            if (Mausereignisse.this.aktuelleLinie != null) {
                int x1 = Mausereignisse.this.aktuelleLinie.getXStart();
                int y1 = Mausereignisse.this.aktuelleLinie.getYStart();
                int x2 = Mausereignisse.this.aktuelleLinie.getXEnde();
                int y2 = Mausereignisse.this.aktuelleLinie.getYEnde();

                g2.drawLine(x1, y1, x2, y2);
            }
        }
    }

    public static void main(String[] args) {
        new Mausereignisse();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        /*
        int x = e.getX();
        int y = e.getY();
        System.out.println("mouseClicked bei [x=" + p.x +", y=" +p.y +"]");
        System.out.println("mouseClicked bei [x=" + x +", y=" +y +"]");
        */
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Point p = e.getPoint();  // p.x p.y
        this.points.add(p);
        this.aktuelleLinie = new Linie(p, p);

        this.canvas.repaint();  // ruft paintComponent() von canvas auf

        System.out.println("mousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouseReleased");
        this.linien.add(this.aktuelleLinie);

        this.canvas.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouseExited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Point p = e.getPoint();
        this.aktuelleLinie.setEnde(p);

        this.canvas.repaint();
        // System.out.println("mouseDragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        // System.out.println("mouseMoved bei [x=" + x + ", y= " + y + "]");
    }
}