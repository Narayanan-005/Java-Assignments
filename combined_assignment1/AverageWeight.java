import java.util.Scanner;

public class AverageWeight {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("The average is: "+new AverageWeight().averageWeight());
    }

    public double averageWeight() {
        int n=sc.nextInt();
        double sum=0;
        double weights[]=new double[n];
        for(int i=0;i<n;i++){
            weights[i]=sc.nextInt();
            sum+=weights[i];
        }
        double average=sum/n;
        return average;
    }
}