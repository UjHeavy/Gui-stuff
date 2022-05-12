package gui_2_files;

import java.awt.GridLayout;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
import java.io.PrintStream;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui_2_files {

    public static void main(String[] args) {
        //ki.Beolvas();
        Kiír ki = new Kiír();
        ki.Beolvas();
        ki.Ki();
    }

}

class Kiír extends JFrame {

    public void Beolvas() {
        Scanner billentyu = new Scanner(System.in, "ISO8859_2");
        String nev;
        int ssz = 1;
        try {
            try (PrintStream file = new PrintStream("Fájl.txt")) {
                out.print("Kérek egy nevet: ");
                nev = billentyu.nextLine();
                while (nev.length() != 0) {
                    file.printf("%d-%s-%d\n", ssz, nev, nev.length());
                    ssz++;
                    out.print("Kérek egy nevet: ");
                    nev = billentyu.nextLine();
                }
            }
        } catch (IOException error) {
            System.err.println("Hiba: " + error.getMessage());
        }
    }
    
    public void Ki() {
        String sor;
        int sorok = 0;
        StringTokenizer token;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        try (Scanner file = new Scanner(new File("Fájl.txt"))) {
            while (file.hasNext()) {
                sor = file.nextLine();
                sorok++;
                token = new StringTokenizer(sor, "-");
                add(new JLabel(" " + (String) token.nextElement()));
                add(new JLabel((String) token.nextElement()));
                add(new JLabel((String) token.nextElement()));
            }
            file.close();
        } catch (IOException error) {
            System.err.println("Hiba: " + error.getMessage());
        } finally {
            setTitle("Névsor");
            setLayout(new GridLayout(sorok, 3, 200, 30));
            pack();
            setVisible(true);
        }
    }
}
