import javax.swing.*;

import View.AutorGUI;
import View.LoginGUI;

public class Main {
    public static void main(String[] args) {
        // Create instances of Model, LoginGUI, and AutorGUI
        Model model = new Model();
        LoginGUI loginGUI = new LoginGUI();
        AutorGUI autorGUI = new AutorGUI();

        // Create Controller and pass Model, LoginGUI, and AutorGUI instances
        Controller controller = new Controller(model, loginGUI, autorGUI);

        autorGUI.setVisible(false);

        // Set up LoginGUI
        loginGUI.setTitle("Login");
        loginGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginGUI.setSize(400, 300);
        loginGUI.setLocationRelativeTo(null); // Center the window
        loginGUI.setVisible(true);
        
        loginGUI.pack();
    }
}
