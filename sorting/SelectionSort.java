import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr [] = {8,5,3,2,6,9,7,4,1};
        System.out.println(Arrays.toString(new SelectionSort().selectionSort(arr)));
    }

    public int[] selectionSort(int arr[]) {
        int min = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            swap(arr,i,min);
        }
        return arr;
    }
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
