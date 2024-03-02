import java.util.*;
class ReverseWord {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        String str=s.nextLine();
        String []str1=str.split(" ");
        String res="";
        for(int i=str1.length-1;i>0;i--){
            res+=str1[i]+" ";
        }
        res+=str1[0];
        System.out.println(res);
    }
}
