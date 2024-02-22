import java.util.*;
class CelciusToFaran {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int celcius=s.nextInt();
        int faran=(celcius*9/5)+32;
        System.out.println(faran+"F");
    }
}
