package View;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

/**
 * The NewUserGUI class represents a graphical user interface for registering a new user.
 * It extends the JFrame class and provides functionality for entering new user details
 * and submitting the registration.
 */
public class NewUserGUI extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JButton registerButton;
    private JButton clearButton;

    public NewUserGUI() {
        // Initialize components
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        confirmPasswordField = new JPasswordField();
        clearButton = new JButton("Limpar");
        registerButton = new JButton("Registrar");

        // Set layout using BorderLayout as an example
        setLayout(new BorderLayout());

        JPanel newUserPanel = new JPanel();
        newUserPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        newUserPanel.setLayout(new GridLayout(4, 2));

        newUserPanel.add(new JLabel("Novo usuário: "));
        newUserPanel.add(usernameField);
        newUserPanel.add(new JLabel("Senha: "));
        newUserPanel.add(passwordField);
        newUserPanel.add(new JLabel("Confirmar senha: "));
        newUserPanel.add(confirmPasswordField);
        newUserPanel.add(registerButton);
        newUserPanel.add(clearButton);

        add(newUserPanel, BorderLayout.CENTER);

        // Action listeners for buttons
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Clear fields
                usernameField.setText("");
                passwordField.setText("");
                confirmPasswordField.setText("");
            }
        });

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform registration action here
                String enteredUsername = usernameField.getText();
                String enteredPassword = new String(passwordField.getPassword());
                String confirmedPassword = new String(confirmPasswordField.getPassword());

                // Validate fields and perform registration
                if (enteredUsername.isEmpty() || enteredPassword.isEmpty() || confirmedPassword.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
                } else if (!enteredPassword.equals(confirmedPassword)) {
                    JOptionPane.showMessageDialog(null, "As senhas não coincidem. Tente novamente.");
                } else {
                    // Perform registration logic
                    // For example: Save user details to the database
                    JOptionPane.showMessageDialog(null, "Usuário registrado com sucesso!");
                    clearFields();
                }
            }
        });
    }

    public void clearFields() {
        usernameField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
    }
}
