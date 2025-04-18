public class Library {

    private static final int MAX_BOOKS = 100;  // Maximum number of books in the library (WHY??)

    private final String name;  // Using final modifier as library name shouldn't change
    private Book[] books;
    private int bookCount;

    public Library() {
        this.name = "Unnamed Library";
        this.books = new Book[MAX_BOOKS];
        this.bookCount = 0;
    }

    public Library(String name) {
        this.name = name;
        this.books = new Book[MAX_BOOKS];
        this.bookCount = 0;
    }

    public Library(String name, Book[] initialBooks) {
        this.name = name;
        this.books = new Book[MAX_BOOKS];
        this.bookCount = 0;
        addBooks(initialBooks);
    }

    public String getName() {return this.name;}
    public Book[] getBooks() {return this.books;}
    public int getBookCount() {return this.bookCount;}
    public void setName(String name) {this.name = name;}

    public void addBook(Book book) {
        if (bookCount >= MAX_BOOKS) {
            System.out.println("Library is full. Cannot add more books.");
            return;
        }
        books[bookCount] = book;
        bookCount++;
    }

    public void addBooks(Book[] newBooks) {
        for (Book newBook : newBooks) {
            addBook(newBook);
        }
    }

    public void removeBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getISBN().equals(isbn)) {
                books[i] = books[bookCount - 1];  // Replace with the last book
                books[bookCount - 1] = null;  // Remove the last book
                bookCount--;
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    public Book findBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getISBN().equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }

    public void printLibrary() {
        System.out.println("Library: " + name);
        System.out.println("Books in the library:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i]);
        }
    }

    public void checkOut(String ISBN, String borrower) {
        Book book = findBook(ISBN);
        if (book != null) {
            book.checkOut(borrower);
        } else {
            System.out.println("Book with ISBN " + ISBN + " not found.");
        }
    }

    public void returnBook(String ISBN) {
        Book book = findBook(ISBN);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("Book with ISBN " + ISBN + " not found.");
        }
    }
  
}