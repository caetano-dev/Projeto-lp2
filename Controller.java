import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import View.AutorGUI;
import View.LoginGUI;

/**
 * A classe Controller é responsável por coordenar as interações entre as classes Model, LoginGUI e AutorGUI.
 * Ela define os listeners de ação para os eventos de usuário e atualiza a interface do usuário com base nos dados do modelo.
 * 
 * @author Pedro Caetano Pires
 * @version 1.0
 * @since 2023-12-02
 */
public class Controller {
    private Model model;
    private LoginGUI loginGUI;
    private AutorGUI autorGUI;

    /**
     * Construtor para a classe Controller.
     * @param model A instância do modelo de dados.
     * @param loginGUI A instância da interface gráfica de usuário de login.
     * @param autorGUI A instância da interface gráfica de usuário do autor.
     */
    public Controller(Model model, LoginGUI loginGUI, AutorGUI autorGUI) {
        this.model = model;
        this.loginGUI = loginGUI;
        this.autorGUI = autorGUI;

        // Configura as interações entre as visualizações e o modelo

        // Exemplo: Passando dados do modelo para AutorGUI
        autorGUI.updateTableData(model.getTableData());

        // Exemplo: Manipulando ação do usuário de LoginGUI para abrir AutorGUI
        loginGUI.setLoginActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String username = loginGUI.getName();
                String password = loginGUI.getPassword();

                System.out.println(username);
                System.out.println(password);

                if (username.equals("user") && password.equals("12345")) {
                    loginGUI.setVisible(false);

                    JOptionPane.showMessageDialog(null, "Login feito com sucesso!");

                    loginGUI.openRegistrationScreen();
                } else {
                    loginGUI.displayErrorMessage("Login ou senha errados. Tente novamente.");
                }
            }
        });

    }

}