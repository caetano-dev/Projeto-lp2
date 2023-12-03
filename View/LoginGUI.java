package View;
import javax.swing.*;
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

    /**
     * Construtor para a classe LoginGUI.
     * Inicializa os componentes da interface gráfica de usuário e define seus tamanhos e posições.
     */
    public LoginGUI() {
        setLayout(null);

       // Cria e posiciona o rótulo do nome de usuário
        JLabel usernameLabel = new JLabel("Login");
        usernameLabel.setBounds(70, 20, 150, 25);
        add(usernameLabel);

        // Cria e posiciona o campo de texto do nome de usuário
        usernameField = new JTextField();
        usernameField.setBounds(70, 50, 200, 25); 
        add(usernameField);

        // Cria e posiciona o rótulo da senha
        JLabel passwordLabel = new JLabel("Senha");
        passwordLabel.setBounds(70, 80, 150, 25);
        add(passwordLabel);

        // Cria e posiciona o campo de texto da senha
        passwordField = new JPasswordField();
        passwordField.setBounds(70, 110, 200, 25);
        add(passwordField);

        // Cria e posiciona o botão de login
        loginButton = new JButton("Entrar");
        loginButton.setBounds(60, 140, 100, 25);
        add(loginButton);

        // Cria e posiciona o botão de limpar
        clearButton = new JButton("Limpar");
        clearButton.setBounds(180, 140, 100, 25);
        add(clearButton);

        // Listeners de ação para os botões 
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                usernameField.setText("");
                passwordField.setText("");
            }
        });
    }

    /**
     * Abre a tela de registro de um novo autor.
     */
    public void openRegistrationScreen() {
        AutorGUI autorGUI = new AutorGUI();
        autorGUI.setVisible(true);
        this.dispose();
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