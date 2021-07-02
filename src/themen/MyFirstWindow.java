package themen;
import javax.swing.*;

public class MyFirstWindow extends JFrame {

    public MyFirstWindow() {
        JFrame mywindow = new JFrame(); // == super();
        mywindow.setTitle("My Window"); // this.setTitle("My Window");
        mywindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel content = this.initContent();
        mywindow.getContentPane().add(content);

      //  mywindow.getContentPane().setBackground(Color.CYAN); // window Background
        mywindow.setSize(400, 300);
        mywindow.setLocation(200, 100);
        mywindow.setVisible(true);
    }

    /* // FlowLayout ist bei default
     * FlowLayout - alles nebeneinander, so lange es passt, sonst untereinander (Standardlayout JPanel)
     * GridLayout - Gitterstruktur (Zeilen und Spalten)
     * BorderLayout - Norden, Sueden, Osten, Westen, Center (Stanfdardlayout eines JFrame)
     */

    private JPanel initContent() {
        JPanel mainPanel = new JPanel();

        JLabel label = new JLabel("Name: ");
        JTextField input = new JTextField(10);
        JButton button = new JButton("Klick mich!");
        JCheckBox cb = new JCheckBox();
        JRadioButton rb = new JRadioButton();

        mainPanel.add(label);
        mainPanel.add(input);
        mainPanel.add(button);
        mainPanel.add(cb);
        mainPanel.add(rb);

        return mainPanel;
    }

    public static void main(String[] args) {
        new MyFirstWindow();
    }
}
