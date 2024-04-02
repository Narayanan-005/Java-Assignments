public class SortMain {
    public static void main(String[] args) {
        int[] arr = {45, 1, 32, 13, 26};
        Sortable sortable1 = new BubbleSort();
        sortable1.sort(arr);
        Sortable sortable2 = new MergeSort();
        sortable2.sort(arr);
        Sortable sortable3 = new QuickSort();
        sortable3.sort(arr);
    }
}
