package View;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

/**
 * The AutorGUI class represents a graphical user interface for registering author information.
 * It extends the JFrame class and provides a form for users to input book details such as book code,
 * book name, email, and category. It also displays a table to show the registered data.
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
        // Initialize components
        bookCodeField = new JTextField();
        bookNameField = new JTextField();
        emailField = new JTextField();
        String[] categories = {"Leitura Infantil", "Leitura Juvenil", "Leitura Adulto"};
        categoryDropdown = new JComboBox<>(categories);
        clearButton = new JButton("Limpar");
        submitButton = new JButton("Enviar");

        // Creating a table to display registered data
        String[] columnNames = {"Código", "Nome", "Email", "Categoria"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);

        // Set layout using GridLayout as an example
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

        // Action listeners for buttons
        clearButton.addActionListener(e -> {
            // Clear all input fields
            bookCodeField.setText("");
            bookNameField.setText("");
            emailField.setText("");
            categoryDropdown.setSelectedIndex(0); // Reset dropdown to the first option
        });

        submitButton.addActionListener(e -> {
            // Get data from input fields
            String bookCode = bookCodeField.getText();
            String bookName = bookNameField.getText();
            String email = emailField.getText();
            String selectedCategory = (String) categoryDropdown.getSelectedItem();

            // Validate fields
            if (bookCode.isEmpty() || bookName.isEmpty() || email.isEmpty() || selectedCategory.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
            } else {
                // Data successfully registered
                JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
                // Add data to the table
                Object[] rowData = {bookCode, bookName, email, selectedCategory};
                tableModel.addRow(rowData);
            }
        });

        // Set frame properties
        setTitle("Cadastro do autores");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null); // Center the window
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
