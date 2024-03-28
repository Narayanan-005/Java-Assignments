import java.util.*;
class BookDriver {
    public static void main(String[] args) {
        List<Book> books=new ArrayList<Book>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number of Books");
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter isbn Number of book");
            int isbn=scanner.nextInt();
            System.out.println("Enter Name of book");
            String name=scanner.next();
            System.out.println("Enter Author of book");
            String author=scanner.next();
            System.out.println("Enter Gernre of book");
            String gernre=scanner.next();
            Book book=new Book(isbn,name,author,gernre);
            books.add(book);
        }
        System.out.println(books);
    }
}

class Book{
    private int isbn;
    private String name;
    private String author;
    private static String tax="5%";
    private String gernre;
    
    public Book(int isbn,String name,String author,String gernre){
        this.isbn=isbn;
        this.name=name;
        this.author=author;
        this.gernre=gernre;
    }
    
    public int getIsbn(){
        return isbn;
    }
    public void setIsbn(int isbn){
        this.isbn=isbn;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    
    public static String getTax(){
        return tax;
    }
    public static void setTax(String tax){
        Book.tax=tax;
    }
    
    public String getGernre(){
        return gernre;
    }
    public void setGernre(String gernre){
        this.gernre=gernre;
    }
    
    public String toString(){
        return "isbn:"+isbn+" name:"+name+" author:"+author+" tax:"+tax+" gernre:"+gernre;
    }
}
