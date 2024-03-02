import java.util.*;
class ReverseChar {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        String str=s.next();
        String res="";
        for(int i=str.length()-1;i>=0;i--){
            res+=str.charAt(i);
        }
        System.out.println(res);
    }
}
