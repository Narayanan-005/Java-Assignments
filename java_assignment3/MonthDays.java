import java.util.*;
class MonthDays {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter year and month");
        int year=s.nextInt();
        String month=s.next();
        switch(month){
            case "january","march","may","july","august","october","december":System.out.println(31+"days");
            break;
            case "april","june","september","november":
                System.out.println(30+"days");
                break;
                case "february":{
                    if((year%4==0 && year%100!=0) || year%400==0){
                System.out.println(29+"days");
            }else{
                System.out.println(28+"days");
            }
            break;
                }
                default:
                System.out.println("enter correct data");
        }
    }
}
