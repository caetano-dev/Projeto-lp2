/**
 * The Model class represents a data model for a book management system.
 * It contains properties for username, password, book code, book name, email, and selected category.
 * It provides getter and setter methods for accessing and modifying these properties.
 * 
 * @author Your Name
 * @version 1.0
 * @since 2021-10-01
 */
public class Model {
    // The username of the user
    private String username;
    // The password of the user
    private String password;
    // The code of the book
    private String bookCode;
    // The name of the book
    private String bookName;
    // The email of the user
    private String email;
    // The selected category by the user
    private String selectedCategory;

    /**
     * Returns the username of the user.
     * @return A string representing the username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username of the user.
     * @param username A string containing the username.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Returns the password of the user.
     * @return A string representing the password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password of the user.
     * @param password A string containing the password.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns the book code.
     * @return A string representing the book code.
     */
    public String getBookCode() {
        return bookCode;
    }

    /**
     * Sets the book code.
     * @param bookCode A string containing the book code.
     */
    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    /**
     * Returns the book name.
     * @return A string representing the book name.
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * Sets the book name.
     * @param bookName A string containing the book name.
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * Returns the email of the user.
     * @return A string representing the email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of the user.
     * @param email A string containing the email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns the selected category by the user.
     * @return A string representing the selected category.
     */
    public String getSelectedCategory() {
        return selectedCategory;
    }

    /**
     * Sets the selected category by the user.
     * @param selectedCategory A string containing the selected category.
     */
    public void setSelectedCategory(String selectedCategory) {
        this.selectedCategory = selectedCategory;
    }

    /**
     * Returns the table data.
     * @return An object representing the table data.
     */
    public Object getTableData() {
        return null;
    }
}