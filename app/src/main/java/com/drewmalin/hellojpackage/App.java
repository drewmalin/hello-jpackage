package com.drewmalin.hellojpackage;

import javax.swing.*;
import java.awt.*;

public class App {

    public static void main(final String[] args) {

        final var message = "Hello World!!!!!!!";

        final var frame = new JFrame(message);

        // set frame site
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // center the JLabel
        JLabel lblText = new JLabel(message, SwingConstants.CENTER);

        // add JLabel to JFrame
        frame.getContentPane().add(lblText);

        // display it
        frame.pack();
        frame.setVisible(true);
    }
}
