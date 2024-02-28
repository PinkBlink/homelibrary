public class Book {
    private String name;
    private String description;
    private BookType type;

    public Book(String name, String description, BookType type) {
        this.name = name;
        this.description = description;
        this.type = type;
    }

    enum BookType {
        EBOOK,
        PAPER_BOOK
    }
}
