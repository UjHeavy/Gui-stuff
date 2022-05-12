package gui_7_menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Gui_7_menu {

    public static void main(String[] args) {
        Menü m = new Menü();
        m.menü("Menü teszt");
    }

}

class Menü extends JFrame implements ActionListener {

    JMenuItem exit;
    JMenuItem open;
    private final JFileChooser fc = new JFileChooser();

    public void menü(String cim) {
        setSize(400, 150);
        setTitle(cim);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar mb;
        JMenu File;
        setJMenuBar(mb = new JMenuBar());
        mb.add(File = new JMenu("File"));
        mb.add(new JMenu("Help"));
        File.add(open = new JMenuItem("Open"));
        File.addSeparator();
        File.add(exit = new JMenuItem("Exit"));
        setVisible(true);
        open.addActionListener(this);
        exit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == open) {
            fc.showOpenDialog(this);
        } else if (e.getSource() == exit) {
            System.exit(0);
        }
    }
}
