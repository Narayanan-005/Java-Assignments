class Book{
    private int isbn;
    private String name;
    private String author;
    private static String tax="5%";
    private String gernre;
    
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
}
