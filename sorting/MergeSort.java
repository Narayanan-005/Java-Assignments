import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 1, 4};
        System.out.println(Arrays.toString(new MergeSort().mergeSort(arr)));
    }

    public int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int n = arr.length;
        int[] first = new int[n / 2];
        int[] second = new int[n - n / 2];
        for (int i = 0; i < n / 2; i++) {
            first[i] = arr[i];
        }
        for (int i = n / 2, j = 0; i < n; i++, j++) {
            second[j] = arr[i];
        }
        first = mergeSort(first);
        second = mergeSort(second);
        return merge(first, second);
    }

    private int[] merge(int[] first, int[] second) {
        int[] res = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] > second[j]) {
                res[k] = second[j++];
            } else {
                res[k] = first[i++];
            }
            k++;
        }
        while (i < first.length) {
            res[k++] = first[i++];
        }
        while (j < second.length) {
            res[k++] = second[j++];
        }
        return res;
    }
}
