public class Main3 {
    public static void main(String[] args) {
        Box b=new Box();
        System.out.println(b.color);//green
        System.out.println(b.size);//3dimention
        System.out.println(b.shape);//rectangle
        System.out.println(b.state);//closed
        b.open();//The box is open
        b.close();//The box is close
        b.isLeft();//The box is left
        b.overRide();//This is box overRidden method
        b.isBroken();//The box is broken
        System.out.println("---------------------------");

        Interface3 i3=new Box();
        i3.overRide();//This is box overRidden method
        i3.isBroken();//The box is broken
        System.out.println("---------------------------");

        Interface4 i4=new Box();
        i4.overRide();//This is box overRidden method
        i4.isLeft();//The box is left
    }
}
