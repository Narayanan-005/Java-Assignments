import java.util.ArrayList;
import java.util.Scanner;

public class CircularBuffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the capacity");
        int capacity = scanner.nextInt();
        ArrayList<String> list = new ArrayList<>(capacity);
        System.out.println("Enter the no of message to be entered");
        int length = scanner.nextInt();
        int index = 0;;
        for (int i = 0; i < length; i++) {
            System.out.println("Enter the message");
            if (i < capacity) {
                list.add(scanner.next());
                continue;
            }
            index = i % capacity;
            list.set(index, scanner.next());
        }
        System.out.println(list);
    }
}
