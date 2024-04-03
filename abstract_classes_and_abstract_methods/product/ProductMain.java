package product;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {
    private List<Product> productList = new ArrayList<>();

    public static void main(String[] args) {
        new ProductMain().dispay();
    }

    private void dispay() {
        Product p1 = new ElectronicsProduct("Laptop", "Electornic", 50000);
        p1.getDescription();
        productList.add(p1);
        System.out.println();
        Product p2 = new ClothingProduct("Shirt", "Cloth", 950);
        p2.getDescription();
        productList.add(p2);
        System.out.println();
        Product p3 = new BookProduct("The Book With No Name", "Book", 500);
        p3.getDescription();
        productList.add(p3);
        System.out.println();
        System.out.println("The Cost of Products :" + calculateTotalPrice());
    }

    private double calculateTotalPrice() {
        double price = 0;
        for (Product product : productList) {
            price += product.price;
        }
        return price;
    }
}
