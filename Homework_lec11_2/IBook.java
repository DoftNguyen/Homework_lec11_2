package Homework_lec11_2;

public interface IBook {

    void addBook(Book book);

    boolean updateBookById(String id);

    void displayDetails();

    double calculatePrice();
}
