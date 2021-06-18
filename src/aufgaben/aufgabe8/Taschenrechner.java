package aufgaben.aufgabe8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Taschenrechner extends JFrame {

    JTextField display;
    JPanel panel;

    public Taschenrechner() {
        super("Taschenrechner");
        this.setSize(280, 380);
        this.setLocation(500, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.WHITE);
        this.display = new JTextField(300);
        this.display.setPreferredSize(new Dimension(300, 40));
        this.panel = this.outsidePanel();

        this.getContentPane().add(this.display, BorderLayout.NORTH);
        this.getContentPane().add(this.panel);
        this.setVisible(true);
    }

    private JPanel outsidePanel() {
        JPanel keyPanel = new JPanel();
        keyPanel.setLayout(new GridLayout(7, 3, 10, 10));
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");
        JButton bKlammerAuf = new JButton("(");
        JButton bKlammerZu = new JButton(")");
        JButton bMal = new JButton("*");
        JButton bGeteilt = new JButton("/");
        JButton bPlus = new JButton("+");
        JButton bMinus = new JButton("-");
        JButton bPunkt = new JButton(".");
        JButton bGleich = new JButton("=");
        JButton bClear = new JButton("clear");
        b1.setPreferredSize(new Dimension(80, 40));
        keyPanel.add(b1);
        keyPanel.add(b2);
        keyPanel.add(b3);
        keyPanel.add(b4);
        keyPanel.add(b5);
        keyPanel.add(b6);
        keyPanel.add(b7);
        keyPanel.add(b8);
        keyPanel.add(b9);
        keyPanel.add(bKlammerAuf);
        keyPanel.add(b0);
        keyPanel.add(bKlammerZu);
        keyPanel.add(bMal);
        keyPanel.add(bGeteilt);
        keyPanel.add(bPlus);
        keyPanel.add(bMinus);
        keyPanel.add(bPunkt);
        keyPanel.add(bGleich);
        keyPanel.add(bClear);

        return keyPanel;
    }

    public static void main(String[] args) {
        new Taschenrechner();
    }
}

