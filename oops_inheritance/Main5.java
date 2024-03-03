public class Main5 {
    public static void main(String[] args) {
        Interface1 i1=new Bag();
        i1.write();//The pen writing
        i1.open();//The bag is opened
        System.out.println("---------------------------------");

        Interface2 i2=new Bag();
        i2.open();//The bag is opened
        i2.close();//The bag is closed
        System.out.println("---------------------------------");

        Interface3 i3=new Bag();
        i3.overRide();//This is bag overRidden method
        i3.isBroken();//The box is broken
        System.out.println("---------------------------------");

        Interface4 i4=new Bag();
        i4.overRide();//This is bag overRidden method
        i4.isLeft();//The box is left
        System.out.println("---------------------------------");

        Interface1 ib1=new Box();
        ib1.write();//The pen writing
        ib1.open();//The box is open
        System.out.println("---------------------------------");

        Interface2 ib2=new Box();
        ib2.open();//The box is open
        ib2.close();//The box is close
        System.out.println("---------------------------------");
    }
}
