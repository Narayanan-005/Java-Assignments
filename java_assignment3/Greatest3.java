import java.util.*;
class Greatest3 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int great=(a>b && a>c)?a:(b>c)?b:c;
        System.out.println("Greatest number is :"+great);
    }
}
