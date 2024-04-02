package library;

import library.book.Book;
import library.members.Member;
import library.transaction.Transaction;

public class LibraryMain {
    public static void main(String[] args) {
        Transaction transaction = new Transaction();
        Book book = new Book();
        book.setIsbn(1);
        book.setName("java");
        book.setAuthor("james Gauslin");
        book.setPublication("xyz");
        transaction.setBook(book);

        Member member = new Member();
        member.setId(1);
        member.setName("Narean");
        member.setEmail("narean@gmail.com");
        member.setPhone("7894561230");
        member.setLocation("kalakad");
        transaction.setMember(member);

        transaction.getDetails();
    }
}
