package themen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ereignisbehandlung extends JFrame implements ActionListener {
    Integer anzKlicks = 0;
    JLabel unten;

    public Ereignisbehandlung() {
        super();
        this.setTitle("Ereignisbehandlung");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel content = this.initContent();
        this.getContentPane().add(content);

        this.setSize(200, 150);
        this.setLocation(200, 100);
        this.setVisible(true);
    }

    public JPanel initContent() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel oben = new JPanel();
        JButton minus = new JButton("-");
        JButton plus = new JButton("+");

        oben.add(minus);
        oben.add(plus);

        plus.addActionListener(this);
        minus.addActionListener(this);

        this.unten = new JLabel(this.anzKlicks.toString());
        this.unten.setFont(new Font("Verdana", Font.BOLD, 48));
        this.unten.setHorizontalAlignment(JLabel.CENTER);

        mainPanel.add(oben, BorderLayout.NORTH);
        mainPanel.add(unten, BorderLayout.CENTER);

        return mainPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object quelle = e.getSource();  // hat ActionEvent ausgeloest
        if(quelle instanceof JButton)
        {
            JButton button = (JButton)quelle;
            if(button.getText().equals("-"))
            {
                this.anzKlicks--;
                System.out.println("Minus-Button geklickt ... " + this.anzKlicks);
            }
            else if(button.getText().equals("+"))
            {
                this.anzKlicks++;
                System.out.println("Plus-Button geklickt ... " + this.anzKlicks);
            }
            this.unten.setText(this.anzKlicks.toString());
        }
    }

    public static void main(String[] args) {
        new Ereignisbehandlung();
    }
}
