package edu.neu.mgen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab3 extends JFrame {
    private JComboBox<String> dropdown;
    private JLabel label;
    private JPanel circlePanel;

    public Lab3() {

        setTitle("Paint your Circle:");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        dropdown = new JComboBox<>(new String[] { "--Pick a color--", "Red", "Green", "Blue" });
        label = new JLabel("Selected Color: ");
        circlePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.setColor(Color.BLACK);
                ((Graphics2D) g).setStroke(new BasicStroke(2));
                g.drawOval(150, 75, 100, 100);

                if (dropdown.getSelectedIndex() == 1) {
                    g.setColor(Color.RED);
                } else if (dropdown.getSelectedIndex() == 2) {
                    g.setColor(Color.GREEN);
                } else if (dropdown.getSelectedIndex() == 3) {
                    g.setColor(Color.BLUE);
                } else {
                    g.setColor(getBackground());
                }
                g.fillOval(150, 75, 100, 100);
            }
        };

        circlePanel.setBackground(Color.WHITE);

        add(dropdown, BorderLayout.NORTH);
        add(circlePanel, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);

        dropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("You chose: " + dropdown.getSelectedItem());
                circlePanel.repaint();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Lab3 paintCircle = new Lab3();
                paintCircle.setVisible(true);
            }
        });
    }
}