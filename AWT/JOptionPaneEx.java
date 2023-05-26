package AWT;

import javax.swing.JOptionPane;

public class JOptionPaneEx {
    public static void main(String[] args) {
        // Show an error dialog with a custom error message
        showErrorDialog("An error occurred. Please try again later.");
    }

    public static void showErrorDialog(String errorMessage) {
        JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
