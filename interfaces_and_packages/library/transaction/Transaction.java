package library.transaction;

import library.book.Book;
import library.members.Member;

public class Transaction {
    private Book book;
    private Member member;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void getDetails() {
        System.out.println(book.getName() + " is taken by " + member.getName());
    }
}
