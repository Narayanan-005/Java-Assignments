import java.util.*;
class JagArray {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int n=s.nextInt();
        int arr[][]=new int[n][];
        addWeight(arr);
        minWeight(arr);
    }
    public static void addWeight(int arr[][]){
        int n=s.nextInt();
        int weights=s.nextInt();
        arr[n-1]=new int[weights];
        for(int i=n-1,j=0;j<weights;j++){
            arr[i][j]=s.nextInt();
        }
    }
    public static void minWeight(int arr[][]){
        int n=s.nextInt();
        if(arr[n-1]!=null){
            Arrays.sort(arr[n-1]);
            System.out.println(arr[n-1][0]);
        }else {
            System.out.println("invalid input fill the weights first");
        }
    }
}
