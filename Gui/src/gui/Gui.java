package gui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Gui {

    public static void main(String[] args) {
        Keret k = new Keret();
        k.Ablak();
    }
}

class Keret extends JFrame {

    JLabel szoveg;

    public void Ablak() {
        setTitle("A második ablakom");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocation(200, 200);
        setLayout(null);
        szoveg = new JLabel("Ez az első sor szövege");
        szoveg.setOpaque(true);
        szoveg.setBackground(Color.blue);
        szoveg.setForeground(Color.WHITE);
        szoveg.setHorizontalAlignment(SwingConstants.LEFT);
        szoveg.setVerticalAlignment(SwingConstants.TOP);
        szoveg.setBounds(10, 10, 200, 50);
        add(szoveg);
        szoveg = new JLabel("Ez a második sor szövege");
        szoveg.setOpaque(true);
        szoveg.setBackground(Color.YELLOW);
        szoveg.setForeground(Color.CYAN);
        szoveg.setHorizontalAlignment(SwingConstants.CENTER);
        szoveg.setVerticalAlignment(SwingConstants.CENTER);
        szoveg.setBounds(100, 100, 200, 50);
        add(szoveg);
        szoveg = new JLabel("Ez a harmadik sor szövege");
        szoveg.setOpaque(true);
        szoveg.setBackground(Color.green);
        szoveg.setForeground(Color.red);
        szoveg.setHorizontalAlignment(SwingConstants.RIGHT);
        szoveg.setVerticalAlignment(SwingConstants.BOTTOM);
        szoveg.setBounds(200, 200, 200, 50);
        add(szoveg);
        setVisible(true);
    }
}
