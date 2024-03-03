public class Bag extends Box implements Interface6 {
    String color="ash";
    String size="school-bag-size";
    String shape="school-bag-shape";
    String state="open";

    public void store() {
        System.out.println("The bag is full");
    }

    public void cleaning() {
        System.out.println("The bag cleaning process starts");
    }

    public void open() {
        System.out.println("The bag is opened");
    }

    public void close() {
        System.out.println("The bag is closed");
    }

    public void overRide() {
        System.out.println("This is bag overRidden method");
    }
}
