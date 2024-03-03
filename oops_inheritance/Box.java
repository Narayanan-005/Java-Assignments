public class Box extends Pen implements Interface3,Interface4{
    String color="green";
    String size="3dimention";
    String shape="rectangle";
    String state="closed";

    public void open() {
        System.out.println("The box is open");
    }

    public void close() {
        System.out.println("The box is close");
    }

    public void isLeft() {
        System.out.println("The box is left");
    }

    public void overRide() {
        System.out.println("This is box overRidden method");
    }

    public void isBroken() {
        System.out.println("The box is broken");
    }
}
