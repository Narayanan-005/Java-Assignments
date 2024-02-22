import java.util.*;
class QuadraticEqu {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
         System.out.println("ax^2+bx+c=0");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        double root=b*b-4*a*c;
        if(root==0){
          System.out.println("factor"+(-b/(2*a)));
        }else if(root<0){
          System.out.println("The equation has no real roots");
        }else if(root>0){
          double x1=(-b+Math.sqrt(root))/(2*a);
          double x2=(-b-Math.sqrt(root))/(2*a);
          System.out.println("factors "+x1+" "+x2);
        }
    }
}
