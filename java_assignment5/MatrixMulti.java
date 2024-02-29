import java.util.*;
class MatrixMulti {
    public static void main(String[] args) {
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]={{3,2,1},{6,5,4},{9,8,7}};
        if(arr1[0].length==arr2.length){
            int res[][]=new int[arr1.length][arr2[0].length];
            for(int i=0;i<res.length;i++){
                for(int j=0;j<arr2[i].length;j++){
                    int sum=0;
                    for(int k=0;k<arr2.length;k++){
                        sum+=arr1[i][k]*arr2[k][j];
                    }
                    res[i][j]=sum;
                }
                System.out.println(Arrays.toString(res[i]));
            }
        }else{
            System.out.println("invalid Matrix");
        }
    }
}
