package View;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

/**
 * The LoginGUI class represents a graphical user interface for a login screen.
 * It extends the JFrame class and provides functionality for entering a username
 * and password, performing login action, and displaying error messages.
 */
public class LoginGUI extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton clearButton;

    public LoginGUI() {
        // Initialize components
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        clearButton = new JButton("Limpar");
        loginButton = new JButton("Entrar");

        // Set layout using BorderLayout as an example
        setLayout(new BorderLayout());

        JPanel loginPanel = new JPanel();
        loginPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        loginPanel.setLayout(new GridLayout(3, 2));

        loginPanel.add(new JLabel("Login: "));
        loginPanel.add(usernameField);
        loginPanel.add(new JLabel("Senha: "));
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);
        loginPanel.add(clearButton);

        add(loginPanel, BorderLayout.CENTER);

        // Action listeners for buttons
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Clear username and password fields
                usernameField.setText("");
                passwordField.setText("");
            }
        });

        // loginButton.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //         // Perform login action here
        //         String enteredUsername = usernameField.getText();
        //         String enteredPassword = new String(passwordField.getPassword());

        //         // Hardcoded validation (replace with proper authentication)
        //         if (enteredUsername.equals("user") && enteredPassword.equals("12345")) {
        //             JOptionPane.showMessageDialog(null, "Login feito com sucesso!");
        //             openRegistrationScreen(); // Method to open registration screen
        //         } else {
        //             JOptionPane.showMessageDialog(null, "Login ou senha errados. Tente novamente.");
        //         }
        //     }
        // });
    }

    public void openRegistrationScreen() {
        // Logic to open the registration screen
        // Create an instance of AutorGUI or navigate to the registration screen
        AutorGUI autorGUI = new AutorGUI();
        autorGUI.setVisible(true);
        this.dispose(); // Close the login screen
    }

    public void setLoginActionListener(ActionListener actionListener) {
        loginButton.addActionListener(actionListener);
    }

    public String getName() {
        return new String(usernameField.getText());
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(null, errorMessage);
    }

}
