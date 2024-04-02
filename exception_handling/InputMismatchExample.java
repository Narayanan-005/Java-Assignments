import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Phone Number");
        try {
            long phone=scanner.nextLong();
            System.out.println("Valid Number");
        }catch (InputMismatchException e){
            System.out.println("Input Mismathch Exception\nInvalid number");
        }
    }
}
