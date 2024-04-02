package customexception;

import java.util.Scanner;

public class EligibleExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mark you get");
        int mark = scanner.nextInt();
        if (mark >= 40) {
            System.out.println("congradulations you pass the exam");
        } else {
            try {
                throw new EntranceExamFailException();
            } catch (EntranceExamFailException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
