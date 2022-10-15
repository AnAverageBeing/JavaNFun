package Arrays.Sorting;

public class InsertionSort {

  /*
   * This method takes a int array as input
   * Then sorts the array using INSERTION SORT algorithm
   * Then returns the sorted array
   */
  public static int[] sort(int[] arr) {
    int n = arr.length;

    for (int i = 1; i < n; i++) {
      int j = i;
      while (j > 0 && arr[j] < arr[j - 1]) {
        int temp = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = temp;
        j--;
      }
    }
    return arr;
  }
}
