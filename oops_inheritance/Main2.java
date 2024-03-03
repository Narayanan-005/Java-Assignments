public class Main2 {
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

        Interface1 i1=new Pen();
        i1.open();//The pen opened
        i1.write();//The pen writing
        System.out.println("-----------------------------");

        Interface2 i2=new Pen();
        i2.close();//The pen is closed
        i2.open();//The pen opened
    }
}
