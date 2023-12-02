/**
 * The Author class represents an author of a book.
 * It contains information about the author's book code, book name, email, and category.
 * 
 * @author Your Name
 * @version 1.0
 * @since 2021-10-01
 */
public class Author {
    // The code of the book written by the author
    private String bookCode;
    // The name of the book written by the author
    private String bookName;
    // The email of the author
    private String email;
    // The category of the book written by the author
    private String category;

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
     * Returns the email of the author.
     * @return A string representing the email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of the author.
     * @param email A string containing the email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns the category of the book.
     * @return A string representing the category.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the category of the book.
     * @param category A string containing the category.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Constructor for the Author class.
     * @param bookCode The code of the book written by the author.
     * @param bookName The name of the book written by the author.
     * @param email The email of the author.
     * @param category The category of the book written by the author.
     */
    public Author(String bookCode, String bookName, String email, String category) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.email = email;
        this.category = category;
    }
}