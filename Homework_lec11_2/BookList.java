package Homework_lec11_2;

import java.util.ArrayList;

public class BookList {

    private ArrayList<Book> bookList = new ArrayList<>();

    public BookList() {
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public boolean updateBookById(String id) {
        for (Book b : bookList) {
            if (b.getId().equals(id)) {
                b.setTitle(b.getTitle() + " (Updated)");
                return true;
            }
        }
        return false;
    }

    public boolean deleteBookById(String id) {
        return bookList.removeIf(b -> b.getId().equals(id));
    }

    public Book findBookById(String id) {
        for (Book b : bookList) {
            if (b.getId().equals(id)) {
                return b;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book b : bookList) {
                b.displayDetails();
                System.out.println("------------------");
            }
        }
    }

    public Book findMostExpensiveBook() {
        if (bookList.isEmpty()) {
            return null;
        }
        Book max = bookList.get(0);
        for (Book b : bookList) {
            if (b.calculatePrice() > max.calculatePrice()) {
                max = b;
            }
        }
        return max;
    }

    public void countBooks() {
        int textCount = 0, refCount = 0;
        for (Book b : bookList) {
            if (b instanceof TextBook) {
                textCount++;
            } else if (b instanceof ReferenceBook) {
                refCount++;
            }
        }
        System.out.println("TextBooks: " + textCount);
        System.out.println("ReferenceBooks: " + refCount);
    }
}
