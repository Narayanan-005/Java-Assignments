import java.util.*;

class BookMain {
    List<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookMain main = new BookMain();
        while (true) {
            System.out.println("\n1.Add Book\n2.Remove Book\n3.Update Book\n4.Show List\n0.Exit\nEnter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    main.add();
                    break;
                case 2:
                    main.remove();
                    break;
                case 3:
                    main.update();
                    break;
                case 4:
                    main.showList();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("invalid choice");
            }
        }

    }


    public void add() {
        Book book = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book name");
        book.setName(sc.next());
        System.out.println("Enter Book isbn");
        book.setIsbn(sc.nextInt());
        System.out.println("Enter Book Author Name");
        book.setAuthorName(sc.next());
        System.out.println("Enter Book Price");
        book.setPrice(sc.nextDouble());
        System.out.println("Enter Book Genre");
        book.setGenre(sc.next());
        if (!chekBook(book.getIsbn())) {
            bookList.add(book);
            System.out.println("Book added sucessfully");
        } else {
            System.out.println("Book already Exist");
        }
    }

    private boolean chekBook(int id) {
        for (Book book : bookList) {
            if (id == book.getIsbn()) {
                return true;
            }
        }
        return false;
    }

    public void remove() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book isbn");
        int id = sc.nextInt();
        if (chekBook(id)) {
            for (Book book : bookList) {
                if (id == book.getIsbn()) {
                    bookList.remove(book);
                    break;
                }
            }
            System.out.println("Book removed Sucessfully");
        } else {
            System.out.println("Book not foune");
        }
    }

    private void update() {
        System.out.println("Enter isbn of Book");
        Scanner sc = new Scanner(System.in);
        int isbn = sc.nextInt();
        if (chekBook(isbn)) {
            System.out.println("Enter updated price");
            for (Book book : bookList) {
                if (isbn == book.getIsbn()) {
                    book.setPrice(sc.nextDouble());
                    break;
                }
            }
            System.out.println("Book updated sucessfully");
        } else {
            System.out.println("Book not found");
        }
    }

    private void showList() {
        if(bookList.size()==0){
            System.out.println("No Book Found");
        }else {
            System.out.println(bookList);
        }
    }
}
