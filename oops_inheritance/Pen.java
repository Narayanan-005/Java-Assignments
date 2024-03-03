public class Pen implements Interface1,Interface2{

    String color="black";
    String size="0.5mm";
    String shape="round";
    String state="open";

    public void write(){
        System.out.println("The pen writing");
    }

    public void open(){
        System.out.println("The pen opened");
    }

    public void close(){
        System.out.println("The pen is closed");
    }
}