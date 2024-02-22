import java.util.*;
class Table {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int n=s.nextInt();
        for(int i=1;i<=20;i++){
            System.out.println(i+"*"+n+"="+(i*n));
        }
    }
}
