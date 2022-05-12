package gui_6_textin;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class Gui_6_textIn {

    public static void main(String[] args) {
        String név = JOptionPane.showInputDialog("Felahsználó neve");
        String jelszó = JOptionPane.showInputDialog("Jelszó");
        if (név != null && jelszó != null && név.equals("laci") && jelszó.equals("1234")) {
            UIManager.put("Panel.background", new ColorUIResource(Color.GREEN));
            JOptionPane.showMessageDialog(null,
                    "Accepted", "Message", JOptionPane.OK_CANCEL_OPTION);
        } else {
            UIManager.put("Panel.background", new ColorUIResource(Color.RED));
            JOptionPane.showMessageDialog(null,
                    "Rejected", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }

}
