package gui_5_elements;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gui_5_elements {

    public static void main(String[] args) {
        Uj_jatek ob = new Uj_jatek();
        ob.jatek();
    }

}

class Uj_jatek extends JFrame implements ActionListener {

    int random = new Random().nextInt(5) + 1;
    int probak = 0;
    JTextField text = new JTextField(10); //10 oszlop szélességű mező
    JButton button = new JButton("Tippek");
    JLabel label = new JLabel(probak + " próbálkozás");

    public void jatek() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(400, 400);
        setTitle("Játék");
        setLayout(new FlowLayout());
        add(text);
        add(button);
        add(label);
        pack();
        setVisible(true);
        button.addActionListener(this); //Eseményfigyelő
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String szoveg = text.getText();
        if (Integer.parseInt(szoveg) == random) {
            button.setEnabled(false);
            text.setText(text.getText() + " Megtaláltad!");
            text.setEditable(false);
        } else {
            text.setText("");
            text.requestFocus();
            probak++;
            label.setText(probak + " probálkozás.");
        }
    }
}
