package View;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * A classe AutorGUI representa uma interface gráfica de usuário para registrar informações do autor.
 * Ela estende a classe JFrame e fornece um formulário para os usuários inserirem detalhes do livro, como código do livro,
 * nome do livro, email e categoria. Também exibe uma tabela para mostrar os dados registrados.
 * 
 * @author Gabriel Pereira Monte
 * @version 1.0
 * @since 2023-12-02
 */
public class AutorGUI extends JFrame {
    private JTextField bookCodeField;
    private JTextField bookNameField;
    private JTextField emailField;
    private JComboBox<String> categoryDropdown;
    private JButton submitButton;
    private JButton clearButton;
    private JTable table;
    private DefaultTableModel tableModel;

    /**
     * Construtor para a classe AutorGUI. Inicializa a interface gráfica de usuário.
     */
    public AutorGUI() {
        setLayout(null);

        JLabel bookCodeLabel = new JLabel("Código: ");
        bookCodeLabel.setBounds(200, 20, 100, 25);
        add(bookCodeLabel);

        bookCodeField = new JTextField();
        bookCodeField.setBounds(200, 50, 200, 25);
        add(bookCodeField);

        JLabel bookNameLabel = new JLabel("Nome: ");
        bookNameLabel.setBounds(200, 80, 100, 25);
        add(bookNameLabel);

        bookNameField = new JTextField();
        bookNameField.setBounds(200, 110, 200, 25);
        add(bookNameField);

        JLabel emailLabel = new JLabel("Email: ");
        emailLabel.setBounds(200, 140, 100, 25);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(200, 170, 200, 25);
        add(emailField);

        JLabel categoryLabel = new JLabel("Tipo de Escrita: ");
        categoryLabel.setBounds(200, 200, 100, 25);
        add(categoryLabel);

        String[] categories = {"Leitura Infantil", "Leitura Juvenil", "Leitura Adulto"};
        categoryDropdown = new JComboBox<>(categories);
        categoryDropdown.setBounds(200, 230, 200, 25);
        add(categoryDropdown);

        submitButton = new JButton("Enviar");
        submitButton.setBounds(200, 260, 100, 25);
        add(submitButton);

        clearButton = new JButton("Limpar");
        clearButton.setBounds(310, 260, 100, 25);
        add(clearButton);

        String[] columnNames = {"Código", "Nome", "Email", "Categoria"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(15, 300, 560, 200);
        add(scrollPane);

        clearButton.addActionListener(e -> {
            bookCodeField.setText("");
            bookNameField.setText("");
            emailField.setText("");
            categoryDropdown.setSelectedIndex(0);
        });

        submitButton.addActionListener(e -> {
            String bookCode = bookCodeField.getText();
            String bookName = bookNameField.getText();
            String email = emailField.getText();
            String selectedCategory = (String) categoryDropdown.getSelectedItem();

            if (bookCode.isEmpty() || bookName.isEmpty() || email.isEmpty() || selectedCategory.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
            } else {
                JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
                Object[] rowData = {bookCode, bookName, email, selectedCategory};
                tableModel.addRow(rowData);
            }
        });

        setTitle("Cadastro do autores");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 550);
        setLocationRelativeTo(null); 
        setVisible(true);
    }

     /**
     * Método principal. Cria uma instância da classe AutorGUI.
     * 
     * @param args Argumentos de linha de comando
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AutorGUI();
        });
    }

    public void updateTableData(Object tableData) {
    }
}
