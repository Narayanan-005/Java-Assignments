import java.util.Arrays;
import java.util.Scanner;

class Person /*implements Comparable<Person>*/ {
    String name;
    Double bmi;
    String remark;
    Person(String name,double bmi,String remark){
        this.name=name;
        this.bmi=bmi;
        this.remark=remark;
    }
    // @Override
    // public int compareTo(Person p){
    //     if(p.bmi>this.bmi)
    //     return 1;
    //     else if(p.bmi<this.bmi)
    //     return -1;
    //     else 
    //     return 0;
    // }
    @Override
    public String toString(){
        String s= String.format("%s %.2f  %s" , name,bmi,remark); 
        return s;
    }
    
}
public class BmiComparison {
    static Scanner msc=new Scanner(System.in);
    public static void main(String[] args) {
        BmiComparison b=new BmiComparison();
        b.bmi();
    }

    public void bmi() {
        System.out.println("Enter the number of persons to compare:");
        int n=msc.nextInt();
        Person [] arr=new Person[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the name of person "+(i+1)+":");
            String name=msc.next();
            System.out.println("Enter weight of person "+(i+1)+" in kg:");
            double weight=msc.nextDouble();
            System.out.println("Enter height of person "+(i+1)+" in cm");
            double height=msc.nextDouble()/100;
            double bmi=weight/(height*height);
            Person p=new Person(name, bmi, remark(bmi));
            arr[i]=p;
        }
        Arrays.sort(arr,(a,b)->b.bmi.compareTo(a.bmi));
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    public String remark(double bmi){
        String res="";
        if(bmi<18){
            res="UnderWeight";
        }else if(bmi>24){
            res="OverWeigth";
        }else{
            res="Normal";
        }
        return res;
    }
}