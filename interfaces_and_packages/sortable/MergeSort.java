import java.util.Arrays;

public class MergeSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int beg = 0;
        int end = arr.length - 1;
        mergesort(arr, beg, end);
        System.out.println(Arrays.toString(arr));
    }

    private void mergesort(int[] arr, int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            mergesort(arr, beg, mid);
            mergesort(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
    }

    private void merge(int[] arr, int beg, int mid, int end) {
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;
        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];

        for (int n = 0; n < n1; n++)
            LeftArray[n] = arr[beg + n];
        for (int m = 0; m < n2; m++)
            RightArray[m] = arr[mid + 1 + m];

        i = 0;
        j = 0;
        k = beg;

        while (i < n1 && j < n2) {
            if (LeftArray[i] <= RightArray[j]) {
                arr[k] = LeftArray[i];
                i++;
            } else {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }
}
