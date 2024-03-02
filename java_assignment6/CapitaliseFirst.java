import java.util.*;
class CapitaliseFirst {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        String st=s.nextLine();
        String str[]=st.split("\\s+");
        String res="";
        for(int i=0;i<str.length;i++){
            res+=(""+str[i].charAt(0)).toUpperCase()+str[i].substring(1).toLowerCase()+" ";
        }
        System.out.println(res.trim());
    }
}
