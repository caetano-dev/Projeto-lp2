/**
 * A classe Model representa um modelo de dados para um sistema de gerenciamento
 * de livros.
 * Contém propriedades para nome de usuário, senha, código do livro, nome do
 * livro, email e categoria selecionada.
 * Fornece métodos getter e setter para acessar e modificar essas propriedades.
 * 
 * @author Pedro Caetano Pires
 * @version 1.0
 * @since 2023-12-02
 */
public class Model {
    // O nome de usuário do usuário
    private String username;
    // A senha do usuário
    private String password;
    // O código do livro
    private int bookCode;
    // O nome do livro
    private String bookName;
    // O email do usuário
    private String email;
    // A categoria selecionada pelo usuário
    private String selectedCategory;

    /**
     * Retorna o nome de usuário do usuário.
     * 
     * @return Uma string representando o nome de usuário.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Define o nome de usuário do usuário.
     * 
     * @param username Uma string contendo o nome de usuário.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Retorna a senha do usuário.
     * 
     * @return Uma string representando a senha.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define a senha do usuário.
     * 
     * @param password Uma string contendo a senha.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Retorna o código do livro.
     * 
     * @return Uma string representando o código do livro.
     */
    public int getBookCode() {
        return bookCode;
    }

    /**
     * Define o código do livro.
     * 
     * @param bookCode Um inteiro contendo o código do livro.
     */
    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    /**
     * Retorna o nome do livro.
     * 
     * @return Uma string representando o nome do livro.
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * Define o nome do livro.
     * 
     * @param bookName Uma string contendo o nome do livro.
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * Retorna o email do usuário.
     * 
     * @return Uma string representando o email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o email do usuário.
     * 
     * @param email Uma string contendo o email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retorna a categoria selecionada pelo usuário.
     * 
     * @return Uma string representando a categoria selecionada.
     */
    public String getSelectedCategory() {
        return selectedCategory;
    }

    /**
     * Define a categoria selecionada pelo usuário.
     * 
     * @param selectedCategory Uma string contendo a categoria selecionada.
     */
    public void setSelectedCategory(String selectedCategory) {
        this.selectedCategory = selectedCategory;
    }

    /**
     * Retorna os dados da tabela.
     * 
     * @return Um objeto representando os dados da tabela.
     */
    public Object getTableData() {
        return null;
    }
}