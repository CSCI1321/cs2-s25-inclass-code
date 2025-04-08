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

  public static <T extends Comparable<T>> void bubbleSortGeneric(T[] arr) {
    for(int j=0; j<arr.length; j++) {
      for(int i=0; i<arr.length-1; i++) {
        if(arr[i].compareTo(arr[i+1]) > 0) {
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
    System.out.println();

    Double[] d = {3.4, 2.1, 6.7, Math.PI, Math.E };
    for(double z : d) System.out.print(z + ",");
    bubbleSortGeneric(d);
    System.out.println();
    for(double z : d) System.out.print(z + ",");
    System.out.println();

    String[] s = { "Alice", "Cindy", "Bob", "Daniel", "Elaine" };
    for(String z : s) System.out.print(z + ",");
    bubbleSortGeneric(s);
    System.out.println();
    for(String z : s) System.out.print(z + ",");
    System.out.println();

  }
}
