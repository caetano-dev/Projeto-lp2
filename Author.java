/**
 * A classe Author representa um autor de um livro.
 * Contém informações sobre o código do livro do autor, nome do livro, email e categoria.
 * 
 * @author Gabriel Pereira Monte
 * @version 1.0
 * @since 2023-12-02

 */
public class Author {
    // O código do livro escrito pelo autor
    private String bookCode;
    // O nome do livro escrito pelo autor
    private String bookName;
    // O email do autor
    private String email;
    // A categoria do livro escrito pelo autor
    private String category;

    /**
     * Retorna o código do livro.
     * @return Uma string representando o código do livro.
     */
    public String getBookCode() {
        return bookCode;
    }

    /**
     * Define o código do livro.
     * @param bookCode Uma string contendo o código do livro.
     */
    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    /**
     * Retorna o nome do livro.
     * @return Uma string representando o nome do livro.
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * Define o nome do livro.
     * @param bookName Uma string contendo o nome do livro.
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * Retorna o email do autor.
     * @return Uma string representando o email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o email do autor.
     * @param email Uma string contendo o email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retorna a categoria do livro.
     * @return Uma string representando a categoria.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Define a categoria do livro.
     * @param category Uma string contendo a categoria.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Construtor para a classe Author.
     * @param bookCode O código do livro escrito pelo autor.
     * @param bookName O nome do livro escrito pelo autor.
     * @param email O email do autor.
     * @param category A categoria do livro escrito pelo autor.
     */
    public Author(String bookCode, String bookName, String email, String category) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.email = email;
        this.category = category;
    }
}