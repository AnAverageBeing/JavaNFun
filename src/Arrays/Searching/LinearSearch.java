package Arrays.Searching;

public class LinearSearch {

  /*
   * This method takes a int array and a key as input
   * Then search the array with LINEAR SEARCH algorithm
   * Then if Found
   * returns the first index of the key
   * else returns -1
   */
  public static int search(int[] arr, int key) {
    int foundAt = -1;
    int n = arr.length;
    for (int index = 0; index < n; index++) {
      if (arr[index] == key) {
        foundAt = index;
        break;
      }
    }
    return foundAt;
  }
}
