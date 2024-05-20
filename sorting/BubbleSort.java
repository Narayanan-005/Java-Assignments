import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 3};
        System.out.println(Arrays.toString(new BubbleSort().bubbleSort(arr)));
    }

    public int[] bubbleSort(int[] arr) {
        boolean swapped = false;
        int swapCount = 0;
        do {
            swapped = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i - 1);
                    swapCount++;
                    swapped = true;
                }
            }
        } while (swapped);
        System.out.println(swapCount);
        return arr;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
