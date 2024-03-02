import java.util.*;
class EmailVerify {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        String email=s.nextLine().toLowerCase();
        String str[]=email.split("@");
        for(String s1:str)
        System.out.println(s1);
        if(
        email.length()<6 || email.length()>30 || 
        str.length!=2 || 
        !(
            (str[1].split("[.]").length==2 && (str[1].endsWith(".com") || str[1].endsWith(".in"))) || 
            (str[1].split("[.]").length==3 && str[1].endsWith(".co.in")) 
        )|| 
        str[0].charAt(0)=='.' || 
        str[0].endsWith(".") || 
        str[0].contains("..")){
            System.out.println("if.");
            System.out.println("Invalid email");
        }else {
            String t=str[0];
            String d=str[1].substring(0,str[1].indexOf("."));
            for(int i=0;i<d.length();i++){
                if(!(t.charAt(i)>=97 && t.charAt(i)<=122)){
                    System.out.println("invalid email");
                    return;
                }
            }
            for(int i=0;i<t.length();i++){
                if(!(t.charAt(i)>=97 && t.charAt(i)<=122) && !(t.charAt(i)>='0' && t.charAt(i)<='9') && t.charAt(i)!='.'){
                    System.out.println("invalid email");
                    return;
                }
            }
            System.out.println("valid email");
        }
    }
}
