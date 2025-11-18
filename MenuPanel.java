import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuPanel extends JPanel {

    private JButton easy, medium, hard;
    private JLabel title;

    public MenuPanel(JFrame frame) {
        setLayout(null);
        setPreferredSize(new Dimension(1000, 555));
        setBackground(new Color(15, 15, 30));

        title = new JLabel("PADDLE ROYALE", SwingConstants.CENTER);
        title.setFont(new Font("Orbitron", Font.BOLD, 60));
        title.setForeground(new Color(0, 255, 180));
        title.setBounds(0, 100, 1000, 60);
        add(title);

        easy = createMenuButton("EASY");
        medium = createMenuButton("MEDIUM");
        hard = createMenuButton("HARD");

        easy.setBounds(400, 230, 200, 60);
        medium.setBounds(400, 320, 200, 60);
        hard.setBounds(400, 410, 200, 60);

        add(easy);
        add(medium);
        add(hard);

        easy.addActionListener(e -> switchPanel(frame, new Panel()));
        medium.addActionListener(e -> switchPanel(frame, new Panel_Medium()));
        hard.addActionListener(e -> switchPanel(frame, new Panel_Hard()));

    }

    private JButton createMenuButton(String text) {

        JButton btn = new JButton(text);
        btn.setFont(new Font("Consolas", Font.BOLD, 28));
        btn.setFocusPainted(false);
        btn.setForeground(Color.WHITE);
        btn.setBackground(new Color(40, 40, 70));
        btn.setBorder(BorderFactory.createLineBorder(new Color(0, 255, 180), 2));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btn.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                btn.setBackground(new Color(0, 255, 180));
                btn.setForeground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btn.setBackground(new Color(40, 40, 70));
                btn.setForeground(Color.WHITE);
            }

        });

        return btn;

    }

    private void switchPanel(JFrame frame, JPanel newPanel) {
        frame.getContentPane().removeAll();
        frame.add(newPanel);
        frame.revalidate();
        frame.repaint();
        newPanel.requestFocusInWindow();
    }
    
}

