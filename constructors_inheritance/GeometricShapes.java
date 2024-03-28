abstract class Shape{
    abstract public void areaFormula();
}
class Circle extends Shape{
    public void areaFormula(){
        System.out.println("Area=pi*r*r");
        System.out.println("pi-value=3.14\nr-radius of circle");
    }
}
class Rectangle extends Shape{
    public void areaFormula(){
        System.out.println("Area=l*b");
        System.out.println("l-Length of Rectangle\nb-Breadth of the Rectangle");
    }
}
class Square extends Shape{
    public void areaFormula(){
        System.out.println("Area=a*a");
        System.out.println("a-length of side\nIn Square all sides are equal");
    }
}
