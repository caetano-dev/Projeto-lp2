package View;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;


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

    public AutorGUI() {
        bookCodeField = new JTextField();
        bookNameField = new JTextField();
        emailField = new JTextField();
        String[] categories = {"Leitura Infantil", "Leitura Juvenil", "Leitura Adulto"};
        categoryDropdown = new JComboBox<>(categories);
        clearButton = new JButton("Limpar");
        submitButton = new JButton("Enviar");

        String[] columnNames = {"Código", "Nome", "Email", "Categoria"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);

        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        inputPanel.setLayout(new GridLayout(6, 2));

        inputPanel.add(new JLabel("Código: "));
        inputPanel.add(bookCodeField);
        inputPanel.add(new JLabel("Nome: "));
        inputPanel.add(bookNameField);
        inputPanel.add(new JLabel("Email: "));
        inputPanel.add(emailField);
        inputPanel.add(new JLabel("Tipo de Escrita: "));
        inputPanel.add(categoryDropdown);
        inputPanel.add(submitButton);
        inputPanel.add(clearButton);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);

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
        setSize(600, 400);
        setLocationRelativeTo(null); 
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AutorGUI();
        });
    }

    public void setTableModel(Object tableData) {
    }

    public void updateTableData(Object tableData) {
    }
}
