package gui_3_roll;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Gui_3_roll {

    public static void main(String[] args) {
        Kiír k = new Kiír();
        k.Ki();
    }

}

class Kiír extends JFrame {

    public void Ki() {
        String sor;
        DefaultListModel<String> lm = new DefaultListModel<>();
        JList<String> jl = new JList<>(lm);
        JScrollPane scroll = new JScrollPane(jl);
        scroll.setPreferredSize(new Dimension(300, 200));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(400, 400);
        try (Scanner file = new Scanner(new File("/home/paprikaboi/NetBeansProjects/Gui_3_roll/src/gui_3_roll/Gui_3_roll.java"))) {
            while (file.hasNext()) {
                sor = file.nextLine();
                lm.addElement(sor);
            }
            file.close();
        } catch (IOException error) {
            System.err.println("Hiba: " + error.getMessage());
        } finally {
            add(scroll);
            setTitle("jframe_4.java ");
            pack();
            setVisible(true);
        }
    }
}
