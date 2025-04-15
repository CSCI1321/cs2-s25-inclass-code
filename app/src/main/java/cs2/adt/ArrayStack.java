package cs2.adt;

public class ArrayStack<T> implements Stack<T> {
  private T[] a;
  private int len;

  public void push(T elem) {
    if(a.length == len) {
      T[] tmp = (T[]) new Object[len * 2];
      for(int i=0; i<len; i++) {
        tmp[i] = a[i];
      }
      a = tmp;
    }
    a[len] = elem;
    len += 1;
  }
  public T pop() {
    len -= 1;
    return a[len];
  }
  public T peek() {
    return a[len-1];
  }
  public boolean isEmpty() {
    return len == 0;
  }


  /*
  public ArrayStack() {
    a = (T[])new Object[0];
  }
  public void push(T elem) {
    T[] tmp = (T[]) new Object[a.length + 1];
    for(int i=0; i<a.length; i++) {
      tmp[i] = a[i];
    }
    a = tmp;
    a[a.length-1] = elem;
  }
  public T pop() {
    T retVal = a[a.length-1];
    T[] tmp = (T[]) new Object[a.length - 1];
    for(int i=0; i<tmp.length; i++) {
      tmp[i] = a[i];
    }
    a = tmp;
    return retVal;
  }
  public T peek() {
    return a[a.length-1];
  }
  public boolean isEmpty() {
    return a.length == 0;
  }
    */
}
