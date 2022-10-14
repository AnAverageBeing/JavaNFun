package Arrays.Sorting;

public class SelectionSort {
    /*
     * This method takes a int array as input
     * Then sorts the array using SELECTION SORT algorithm
     * Then returns the sorted array
     */
    public static int[] sort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}