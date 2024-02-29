import java.util.*;
class SpiralMatrix {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int n=s.nextInt();
        int arr[][]=new int[n][n];
        int num=1;
        for(int i=0,k=0;k<n/2;i++,k++){
            int j=i;
            while(j<n-k-1){
                arr[i][j++]=num++;
            }
            while(i<n-k-1){
                arr[i++][j]=num++;
            }
            while(j>=0+k+1){
                arr[i][j--]=num++;
            }
            while(i>=0+k+1){
                arr[i--][j]=num++;
            }
        }
        if(n%2==1){
            arr[n/2][n/2]=num;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
