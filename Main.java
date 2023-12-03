import javax.swing.*;
import View.AutorGUI;
import View.LoginGUI;

/**
 * A classe Main é a classe principal que inicia a aplicação.
 * Ela cria instâncias das classes Model, LoginGUI, AutorGUI e Controller.
 * Configura a janela de login e a torna visível.
 * 
 * @author Pedro Caetano Pires
 * @version 1.0
 * @since 2023-12-02
 */
public class Main {
    /**
     * O método principal que inicia a aplicação.
     * 
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        // Cria uma instância do modelo de dados
        Model model = new Model();
        // Cria uma instância da interface gráfica de usuário de login
        LoginGUI loginGUI = new LoginGUI();
        // Cria uma instância da interface gráfica de usuário do autor
        AutorGUI autorGUI = new AutorGUI();

        // Cria uma instância do controlador, passando o modelo e as interfaces gráficas
        // de usuário
        Controller controller = new Controller(model, loginGUI, autorGUI);

        // Inicialmente, a interface gráfica de usuário do autor não é visível
        autorGUI.setVisible(false);

        // Configura a janela de login
        configureLoginGUI(loginGUI);
    }

    private static void configureLoginGUI(LoginGUI loginGUI) {
        final int WIDTH = 350;
        final int HEIGHT = 300;

        // Configura a janela de login
        loginGUI.setTitle("Login");
        loginGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginGUI.setSize(WIDTH, HEIGHT);
        loginGUI.setLocationRelativeTo(null);
        loginGUI.setVisible(true);
    }
}