import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtonWindowsApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createMainWindow();
            }
        });
    }

    private static void createMainWindow() {
        JFrame mainFrame = new JFrame("Main Window");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton button1 = new JButton("Open Window 1");
        JButton button2 = new JButton("Open Window 2");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createWindow1();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createWindow2();
            }
        });

        panel.add(button1);
        panel.add(button2);

        mainFrame.add(panel);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    private static void createWindow1() {
        JFrame window1 = new JFrame("Window 1");
        window1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton colorButton = new JButton("Change Color");
        colorButton.addActionListener(new ActionListener() {
            private boolean isRed = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (isRed) {
                    panel.setBackground(Color.GREEN);
                } else {
                    panel.setBackground(Color.RED);
                }
                isRed = !isRed;
            }
        });

        panel.add(colorButton);

        window1.add(panel);
        window1.pack();
        window1.setVisible(true);
    }

    private static void createWindow2() {
        JFrame window2 = new JFrame("Window 2");
        window2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton blackButton = new JButton("Black");
        JButton whiteButton = new JButton("White");

        blackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.BLACK);
            }
        });

        whiteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.WHITE);
            }
        });

        panel.add(blackButton);
        panel.add(whiteButton);

        window2.add(panel);
        window2.pack();
        window2.setVisible(true);
    }
}
