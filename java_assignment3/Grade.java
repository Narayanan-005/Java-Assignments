import java.util.*;
class Grade {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int n=s.nextInt();
        if(n>90 && n<=100){
            System.out.println("A");
        }else if(n>80 && n<=90){
            System.out.println("B");
        }else if(n>70 && n<=80){
            System.out.println("C");
        }else if(n>=60 && n<=70){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
        
    }
}
