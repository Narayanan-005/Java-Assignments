import java.util.*;
class Time {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Time in sec");
        int time=s.nextInt();
        int hour=time/3600;
        int minute=(time%3600)/60;
        int sec=(time%3600)%60;
        System.out.println("TIme "+hour+":"+minute+":"+sec);
    }
}
