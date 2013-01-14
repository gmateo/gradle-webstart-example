package org.anotes.example.gradlewebstart;

import javax.swing.*;
import java.awt.*;

/**
 * User: gmc
 * Date: 12/01/13
 */
public class MainApp {
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Simple Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JLabel("Only to test the generation of Webstart files using gradle"));
        frame.setPreferredSize(new Dimension(500, 100));
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
