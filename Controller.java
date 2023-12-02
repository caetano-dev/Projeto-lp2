import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import View.AutorGUI;
import View.LoginGUI;

public class Controller {
    private Model model;
    private LoginGUI loginGUI;
    private AutorGUI autorGUI;

    public Controller(Model model, LoginGUI loginGUI, AutorGUI autorGUI) {
        this.model = model;
        this.loginGUI = loginGUI;
        this.autorGUI = autorGUI;

        // Set up interactions between views and the model

        // Example: Passing model data to AutorGUI
        autorGUI.updateTableData(model.getTableData());

        // Example: Handling user action from LoginGUI to open AutorGUI
        loginGUI.setLoginActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String username = loginGUI.getName();
                String password = loginGUI.getPassword();

                System.out.println(username);
                System.out.println(password);

                // Hardcoded validation (replace with proper authentication)
                if (username.equals("user") && password.equals("12345")) {
                    // autorGUI.setVisible(true);
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
