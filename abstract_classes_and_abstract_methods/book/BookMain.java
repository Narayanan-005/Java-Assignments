package book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMain {
    private List<Book> bookList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private static int idCount=1;

    public static void main(String[] args) {
        new BookMain().features();
    }

    private void features() {
        while (true) {
            System.out.println("\n1.Add Book\n2.Update Book\n3.Show Book List\n0.Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    updateBook();
                    break;
                case 3:
                    showBookList();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    private void showBookList() {
        if(bookList.size()==0){
            System.out.println("No book found");
        }else {
            System.out.println(bookList);
        }
    }

    private void updateBook() {
        if(validateUser()){
            System.out.println("Enter Book id");
            Book book=validateBookFound(scanner.nextInt());
            if(book!=null){
                System.out.println("Enter Updated Edution");
                int editon=scanner.nextInt();
                book.setEdition(editon);
                System.out.println("Book Updated Sucessfully");
            }else {
                System.out.println("Book not found");
            }
        }else {
            System.out.println("Wrong User Credentials");
        }
    }

    private Book validateBookFound(int id) {
        for(Book book:bookList){
            if(book.getIsbn()==id){
                return book;
            }
        }
        return null;
    }

    private boolean validateUser(){
        System.out.println("Enter User Name");
        String userName=scanner.next();
        System.out.println("Enter User Password");
        String userPassword=scanner.next();
        return userName.equals("User") && userPassword.equals("Password");
    }

    private void addBook() {
        Book book = new Book();
        scanner.nextLine();
        System.out.println("Enter Book Name");
        book.setName(scanner.nextLine());
        System.out.println("Enter Book Author Name");
        book.setAuthor(scanner.nextLine());
        book.setIsbn(idCount++);
        System.out.println("Enter Book Publication");
        book.setPublication(scanner.nextLine());
        System.out.println("Enter Book Edition");
        book.setEdition(scanner.nextInt());
        bookList.add(book);
        System.out.println("Book Added Sucessfully");
    }
}
