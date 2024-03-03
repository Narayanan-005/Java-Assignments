public class Main1 {
    public static void main(String[] args) {
        Pen p=new Pen();
        System.out.println(p.color);//black
        System.out.println(p.size);//0.5mm
        System.out.println(p.shape);//round
        System.out.println(p.state);//open
        p.write();//The pen writing
        p.open();//The pen opened
        p.close();//The pen is closed
        System.out.println("-----------------------------");

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

        Bag bg=new Bag();
        System.out.println(bg.color);//ash
        System.out.println(bg.size);//school-bag-size
        System.out.println(bg.shape);//school-bag-shape
        System.out.println(bg.state);//open
        bg.store();//The bag is full
        bg.cleaning();//The bag cleaning process starts
        bg.open();//The bag is opened
        bg.close();//The bag is closed
        bg.overRide();//This is bag overRidden method
        System.out.println("---------------------------------");

        Pen pg=new Bag();
        System.out.println(pg.color);//black
        System.out.println(pg.size);//0.5mm
        System.out.println(pg.shape);//round
        System.out.println(pg.state);//open
        pg.write();//The pen writing
        pg.open();//The bag is opened
        pg.close();//The bag is closed
        System.out.println("---------------------------------");

        Box bxg=new Bag();
        System.out.println(bxg.color);//green
        System.out.println(bxg.size);//3dimention
        System.out.println(bxg.shape);//rectangle
        System.out.println(bxg.state);//closed
        bxg.open();//The bag is opened
        bxg.close();//The bag is closed
        bxg.isLeft();//The box is left
        bxg.overRide();//This is bag overRidden method
        bxg.isBroken();//The box is broken
        bxg.write();//The pen writing
        System.out.println("---------------------------------");

        Pen px=new Box();
        System.out.println(px.color);//black
        System.out.println(px.size);//0.5mm
        System.out.println(px.shape);//round
        System.out.println(px.state);//open
        px.write();//The pen writing
        px.open();//The box is open
        px.close();//The box is close

    }
}
