package cs2.util;

import java.util.ArrayList;

public class Conversion {

  public static ArrayList<Integer> arrayToArrayList(int[] arr) {
    ArrayList<Integer> al = new ArrayList<Integer>();
    for(int i : arr) {
      al.add(i);
    }
    return al;
  }

  public static <T> ArrayList<T> arrayToArrayListGeneric(T[] arr) {
    ArrayList<T> al = new ArrayList<T>();
    for(T i : arr) {
      al.add(i);
    }
    return al;
  }

  public static void main(String[] args) {
    int[] x = {1, 3, 5, 7, 9};
    ArrayList<Integer> ali = arrayToArrayList(x);
    System.out.println(ali);

    Double[] d = {2.1, 3.2, Math.PI, Math.E };
    ArrayList<Double> ald = arrayToArrayListGeneric(d);
    System.out.println(d);


  }
}
