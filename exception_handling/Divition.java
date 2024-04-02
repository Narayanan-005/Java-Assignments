import java.util.Scanner;

public class Divition {
    public static void main(String[] args) {
        try {
            System.out.println(4/0);
        }catch (ArithmeticException e){
            System.out.println("can't divide number by 0");
        }
    }
}
