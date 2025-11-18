import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JFrame{
    MenuPanel panel;

    Game() {
        panel = new MenuPanel(this);
        this.add(panel);
        this.setTitle("PADDLE ROYALE");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
