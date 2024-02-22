import java.util.*;
class Bmi {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("weight-kg,heights-m");
        double a=s.nextDouble();
        double b=s.nextDouble();
        double bmi=a/(b*b);
        System.out.println("BMI="+bmi);
    }
}
