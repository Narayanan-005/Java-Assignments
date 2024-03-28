class ShapesDemo {
    public static void main(String[] args) {
        Shape s1=new Circle(5);
        Shape s2=new Rectangle(6,4);
        Shape s3=new Square(4);
        s1.area();
        s2.area();
        s3.area();
        s1.perimeter();
        s2.perimeter();
        s3.perimeter();
    }
}

abstract class Shape{
    abstract public void area();
    abstract public void perimeter();
}
class Circle extends Shape{
    int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    public void area(){
        System.out.println("Area of Circle="+(3.14*radius*radius));
    }
    public void perimeter(){
        System.out.println("Perimeter of Circle="+(2*3.14*radius));
    }
}
class Rectangle extends Shape{
    int length;
    int breadth;
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void area(){
        System.out.println("Area of Rectangle="+(length*breadth));
    }
    public void perimeter(){
        System.out.println("Perimeter of Rectangle="+(2*(length+breadth)));
    }
}
class Square extends Shape{
    int length;
    public Square(int length){
        this.length=length;
    }
    public void area(){
        System.out.println("Area of Square="+(length*length));
    }
    public void perimeter(){
        System.out.println("Perimeterof Square="+(4*length));
    }
}
