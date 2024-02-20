import java.util.*;
class WeekEnum {
    static Scanner s=new Scanner(System.in);
     enum Days{
        SUNDAY,MONDAY,THUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
    }
    public static void main(String[] args) {
        int n=s.nextInt();
        if(n>=1 && n<=7){
            System.out.println(Days.values()[n-1]);
        }else {
            System.out.println("enter valid data");
        }
    }
}
