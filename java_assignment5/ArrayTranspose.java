import java.util.*;
class ArrayTranspose {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        mCrossM(arr);
        System.out.println("---------------------------------------");
        int arr1[][]={{1,2,3,11},{4,5,6,12},{7,8,9,13}};
        mCrossN(arr1);
    }
    public static void mCrossM(int arr[][]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr[i].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(Arrays.toString(arr[arr.length-1]));
    }
    public static void mCrossN(int arr[][]){
        int res[][]=new int[arr[0].length][arr.length];
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                res[i][j]=arr[j][i];
            }
            System.out.println(Arrays.toString(res[i]));
        }
    }
}
