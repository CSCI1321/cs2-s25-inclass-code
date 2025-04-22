package cs2.adt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTester {
  private Queue<Integer> q;

  @BeforeEach
  public void init() {
    q = new ArrayQueue<Integer>();
  }

  @Test
  public void testQueue() {
    assertTrue(q.isEmpty());
    q.enqueue(1);
    assertEquals(q.peek(), 1);
    assertEquals(q.dequeue(), 1);
    assertTrue(q.isEmpty());
  }

  @Test
  public void testMulti() {
    for(int i=0; i<100; i++) {
      q.enqueue(i);
    }
    for(int i=0; i<100; i++) {
      assertEquals(q.peek(), i);
      assertEquals(q.dequeue(), i);
    }
  } 
}
