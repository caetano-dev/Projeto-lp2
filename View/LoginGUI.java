package View;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

/**
 * A classe LoginGUI representa uma interface gráfica de usuário para uma tela de login.
 * Ela estende a classe JFrame e fornece funcionalidade para inserir um nome de usuário
 * e senha, realizar ação de login e exibir mensagens de erro.
 * 
 * @author Pedro Caetano Pires
 * @version 1.0
 * @since 2023-12-02
 */
public class LoginGUI extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton clearButton;

    public LoginGUI() {
        // Inicializa os componentes
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        
        clearButton = new JButton("Limpar");
        loginButton = new JButton("Entrar");
        // Define o layout usando BorderLayout como exemplo
        setLayout(new BorderLayout());

        JPanel loginPanel = new JPanel();
        loginPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        loginPanel.setLayout(new GridLayout(0, 2));

        loginPanel.add(new JLabel("Login: "));
        loginPanel.add(usernameField);
        loginPanel.add(new JLabel("Senha: "));
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);
        loginPanel.add(clearButton);
        loginPanel.add(new JLabel()); // Espaço reservado para alinhamento

        add(loginPanel, BorderLayout.CENTER);

        // Listeners de ação para os botões
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Limpa os campos de nome de usuário e senha
                usernameField.setText("");
                passwordField.setText("");
            }
        });

    }

    /**
     * Abre a tela de registro.
     */
    public void openRegistrationScreen() {
        // Lógica para abrir a tela de registro
        // Cria uma instância de AutorGUI ou navega para a tela de registro
        AutorGUI autorGUI = new AutorGUI();
        autorGUI.setVisible(true);
        this.dispose(); // Fecha a tela de login
    }

    /**
     * Define o listener de ação de login.
     * @param actionListener O listener de ação.
     */
    public void setLoginActionListener(ActionListener actionListener) {
        loginButton.addActionListener(actionListener);
    }

    /**
     * Retorna o nome do usuário.
     * @return Uma string representando o nome do usuário.
     */
    public String getName() {
        return new String(usernameField.getText());
    }

    /**
     * Retorna a senha.
     * @return Uma string representando a senha.
     */
    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    /**
     * Exibe uma mensagem de erro.
     * @param errorMessage A mensagem de erro a ser exibida.
     */
    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(null, errorMessage);
    }

}