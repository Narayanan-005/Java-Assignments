import java.util.Arrays;

public class QuickSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int beg = 0;
        int end = arr.length - 1;
        quick(arr, beg, end);
        System.out.println(Arrays.toString(arr));
    }

    private int partition(int a[], int start, int end) {
        int p = a[end];
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++) {
            if (a[j] < p) {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i + 1];
        a[i + 1] = a[end];
        a[end] = t;
        return (i + 1);
    }

    private void quick(int a[], int start, int end) {
        if (start < end) {
            int p = partition(a, start, end);
            quick(a, start, p - 1);
            quick(a, p + 1, end);
        }
    }
}
