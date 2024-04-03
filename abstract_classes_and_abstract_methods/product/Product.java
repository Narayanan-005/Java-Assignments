package product;

public abstract class Product {
    String name;
    String type;
    double price;
    public void getPrice(){
        System.out.println(this.price);
    }
    public void getDescription(){
        System.out.println("Name of the Product :"+name);
        System.out.println("Type of the Product :"+type);
        System.out.println("Price of the Product :"+price);
    }
}
