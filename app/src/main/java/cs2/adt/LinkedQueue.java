package cs2.adt;

public class LinkedQueue<T> implements Queue<T> {
  private class Node {
    public T data;
    public Node next;
    public Node (T d, Node n) {
      data = d; next = n;
    }
  }

  private Node head;
  private Node last;

  public void enqueue(T elem) {
    if(head == null) {
      head = new Node(elem, null);
      last = head;
    } else {
      last.next = new Node(elem, null);
      last = last.next;
    }
  }
  public T dequeue() {
    T retVal = head.data;
    head = head.next;
    if(head == null) {
      last = null;
    }
    return retVal;
  }
  public T peek() {
    return head.data;
  }
  public boolean isEmpty() {
    return head == null && last == null;
  }
}
