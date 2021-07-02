package klausurvorbereitung;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Quadrat extends JFrame implements MouseListener, MouseMotionListener {
    Canvas canvas;
    boolean zeichneQuadrat = false;

    public Quadrat() {
        super("Quadrat");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.canvas = new Canvas();
        this.getContentPane().add(this.canvas, BorderLayout.CENTER);
        this.getContentPane().add(this.panel(), BorderLayout.SOUTH);
        this.canvas.addMouseListener(this);
        this.canvas.addMouseMotionListener(this);
        this.setSize(400, 300);
        this.setLocation(300, 200);
        this.setVisible(true);
    }

    private class Canvas extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);        // Implementierung von JPanel aufrufen
            Graphics2D g2 = (Graphics2D) g;  // Methoden von Graphics2D nutzbar
            // hier koennen wir zeichnen
            Random r = new Random();
            if(Quadrat.this.zeichneQuadrat) {
                g2.setStroke(new BasicStroke(3.0f));
                int canvasWidth = this.getWidth();
                int canvasHeight = this.getHeight();
                if(canvasHeight > canvasWidth) {

                    int abstand = (int)(canvasWidth * 0.1);
                    int seiteQuadrat = (int)(canvasWidth * 0.8);
                    int oben = (canvasHeight - seiteQuadrat) / 2;
                    g2.drawRect(abstand, oben, seiteQuadrat, seiteQuadrat);
                }
                else {

                    int abstand = (int)(canvasHeight * 0.1);
                    int seiteQuadrat = (int)(canvasHeight * 0.8);
                    int links = (canvasWidth - seiteQuadrat) / 2;
                    g2.drawRect(links, abstand, seiteQuadrat, seiteQuadrat);
                }
            }
        }
    }

    JPanel panel() {
        JPanel panel = new JPanel();
        JButton button1 = new JButton("new");
        JButton button2 = new JButton("fill");

        // кнопка при нажатии меняет текст на "refresh"
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Quadrat.this.zeichneQuadrat = true;
                JButton refresh = (JButton)e.getSource();
                refresh.setText("refresh");
                Quadrat.this.canvas.repaint();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Quadrat.this.zeichneQuadrat = true;
                JButton unfill = (JButton)e.getSource();
                unfill.setText("unfill");
                Quadrat.this.canvas.repaint();
            }
        });

        panel.add(button1);
        panel.add(button2);
        return panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    public static void main(String[] args) {
        new Quadrat();
        new Panel();
    }
}
