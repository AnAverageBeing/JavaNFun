package Arrays.Sorting;

public class BubbleSort {

    /*
     * This method takes a int array as input
     * Then sorts the array using BUBBLE SORT algorithm
     * Then returns the sorted array
     */
    public static int[] sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
