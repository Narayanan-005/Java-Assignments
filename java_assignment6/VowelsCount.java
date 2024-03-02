import java.util.*;
class VowelsCount {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        String str=s.next();
        String vowel="aeiouAEIOU";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(vowel.contains(""+str.charAt(i)))
               count++;
        }
        System.out.println(count);
    }
}
