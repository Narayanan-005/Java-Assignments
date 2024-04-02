import java.util.Arrays;

public class BubbleSort implements Sortable {
    @Override
    public void sort(int arr[]) {
        int l = arr.length;
        for (int i = 0; i < l - 1; i++) {
            for (int j = i + 1; j < l; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
