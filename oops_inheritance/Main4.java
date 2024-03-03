public class Main4 {
    public static void main(String[] args) {
        Bag b=new Bag();
        System.out.println(b.color);//ash
        System.out.println(b.size);//school-bag-size
        System.out.println(b.shape);//school-bag-shape
        System.out.println(b.state);//open
        b.store();//The bag is full
        b.cleaning();//The bag cleaning process starts
        b.open();//The bag is opened
        b.close();//The bag is closed
        b.overRide();//This is bag overRidden method
        System.out.println("---------------------------------");

        Interface6 i6=new Bag();
        i6.close();//The bag is closed
        i6.open();//The bag is opened
        i6.overRide();//This is bag overRidden method
        i6.store();//The bag is full
        System.out.println("---------------------------------");

        Interface5 i5=new Bag();
        i5.overRide();//This is bag overRidden method
        i5.store();//The bag is full
    }
}
