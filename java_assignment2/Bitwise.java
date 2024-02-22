import java.util.*;
class Bitwise {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("And "+(a&b));
        System.out.println("Or "+(a|b));
        System.out.println("Xor "+(a^b));
        System.out.println("Complement "+(~b));
        System.out.println("RightShift "+(a>>1));
        System.out.println("LeftShift "+(a<<1));
        System.out.println("UnsighnedRightShift "+(a>>>1));
    }
}
