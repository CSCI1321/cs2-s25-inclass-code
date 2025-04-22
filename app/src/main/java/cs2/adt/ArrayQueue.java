package cs2.adt;

public class ArrayQueue<T> implements Queue<T> {
  private T[] a;
  private int beg;
  private int len;
  
  public ArrayQueue() {
    beg = 0;
    len = 0;
    a = (T[]) new Object[10];
  }

  public void enqueue(T elem) {
    if(len == a.length) {
      T[] tmp = (T[]) new Object[len*2];
      for(int i=0; i<a.length; i++) {
        tmp[i] = a[(beg + i) % a.length];
      }
      a = tmp;
      beg = 0;
    }
    a[(beg + len) % a.length] = elem;
    len++;
  }
  public T dequeue() {
    T retVal = a[beg];
    beg++;
    len--;
    return retVal;
  }
  public T peek() {
    return a[beg];
  }
  public boolean isEmpty() {
    return len == 0;
  }
}
