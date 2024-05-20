import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5, 2, 4, 6, 1, 3,6,6,6};
        System.out.println(Arrays.toString(new InsertionSort().insertionSort(arr)));
    }

    public int[] insertionSort(int[] arr) {
        int element = 0;
        for (int i = 1; i < arr.length; i++) {
            element = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > element) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
                arr[j + 1] = element;
        }
        return arr;
    }
}
