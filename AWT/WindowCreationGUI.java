package AWT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowCreationGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        // Create the main frame
        JFrame frame = new JFrame("Window Creation GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create the first button
        JButton button1 = new JButton("Create Window 1");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createWindow1();
            }
        });

        // Create the second button
        JButton button2 = new JButton("Create Window 2");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createWindow2();
            }
        });

        // Add the buttons to the main frame
        frame.add(button1);
        frame.add(button2);

        // Set the frame size and make it visible
        frame.setSize(300, 100);
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setVisible(true);
    }

    private static void createWindow1() {
        JFrame frame = new JFrame("Window 1");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create the toggle button for changing the background color
        JButton toggleButton = new JButton("Toggle Color");
        toggleButton.addActionListener(new ActionListener() {
            private boolean isRed = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (isRed) {
                    frame.getContentPane().setBackground(Color.GREEN);
                    isRed = false;
                } else {
                    frame.getContentPane().setBackground(Color.RED);
                    isRed = true;
                }
            }
        });

        // Add the toggle button to the window
        frame.add(toggleButton);

        // Set the window size and make it visible
        frame.setSize(200, 100);
        frame.setLocationRelativeTo(null); // Center the window on the screen
        frame.setVisible(true);
    }

    private static void createWindow2() {
        JFrame frame = new JFrame("Window 2");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create the buttons for changing the background color
        JButton blackButton = new JButton("Black");
        blackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.BLACK);
            }
        });

        JButton whiteButton = new JButton("White");
        whiteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.WHITE);
            }
        });

        // Add the buttons to the window
        frame.add(blackButton);
        frame.add(whiteButton);

        // Set the window size and make it visible
        frame.setSize(200, 100);
        frame.setLocationRelativeTo(null); // Center the window on the screen
        frame.setVisible(true);
    }
}

