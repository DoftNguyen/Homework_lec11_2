package Homework_lec11_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList list = new BookList();

        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Add new textbook");
            System.out.println("2. Add new reference book");
            System.out.println("3. Update book by id");
            System.out.println("4. Delete book by id");
            System.out.println("5. Find book by id");
            System.out.println("6. Display all books");
            System.out.println("7. Find most expensive book");
            System.out.println("8. Count textbooks and reference books");
            System.out.println("9. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String tid = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String ttitle = sc.nextLine();
                    System.out.print("Enter Base Price: ");
                    double tprice = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Subject: ");
                    String subject = sc.nextLine();
                    list.addBook(new TextBook(tid, ttitle, tprice, subject));
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    String rid = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String rtitle = sc.nextLine();
                    System.out.print("Enter Base Price: ");
                    double rprice = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Publisher: ");
                    String publisher = sc.nextLine();
                    list.addBook(new ReferenceBook(rid, rtitle, rprice, publisher));
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    String uid = sc.nextLine();
                    if (list.updateBookById(uid)) {
                        System.out.println("Updated.");
                    } else {
                        System.out.println("Not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    String did = sc.nextLine();
                    if (list.deleteBookById(did)) {
                        System.out.println("Deleted.");
                    } else {
                        System.out.println("Not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter ID to find: ");
                    String fid = sc.nextLine();
                    Book found = list.findBookById(fid);
                    if (found != null) {
                        found.displayDetails();
                    } else {
                        System.out.println("Not found.");
                    }
                    break;
                case 6:
                    list.displayAllBooks();
                    break;
                case 7:
                    Book expensive = list.findMostExpensiveBook();
                    if (expensive != null) {
                        System.out.println("Most Expensive Book:");
                        expensive.displayDetails();
                    }
                    break;
                case 8:
                    list.countBooks();
                    break;
                case 9:
                    return;
            }
        }
    }
}

