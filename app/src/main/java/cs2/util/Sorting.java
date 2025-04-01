package cs2.util;

public class Sorting {
  
  public static void bubbleSort(int[] arr) {
    for(int j=0; j<arr.length; j++) {
      for(int i=0; i<arr.length-1; i++) {
        if(arr[i] > arr[i+1]) {
          int tmp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = tmp;
        }
      }
    }
  }

  public static <T> void bubbleSortGeneric(T[] arr) {
    for(int j=0; j<arr.length; j++) {
      for(int i=0; i<arr.length-1; i++) {
        if(arr[i] > arr[i+1]) {
          T tmp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = tmp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] x = {4,3,2,7,5,1,6,9,8,0};
    for(int z : x) System.out.print(z + ",");
    bubbleSort(x);
    System.out.println();
    for(int z : x) System.out.print(z + ",");

    Double[] d = {3.4, 2.1, 6.7, Math.PI, Math.E };
    bubbleSort(d);

  }
}
