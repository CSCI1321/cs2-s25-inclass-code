package cs2.adt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class StackTester {
  private Stack<Integer> s;

  @BeforeEach
  public void init() {
    s = new LinkedStack<Integer>();
  }

  @Test
  public void testStack() {
    assertTrue(s.isEmpty());
    s.push(1);
    assertEquals(s.peek(), 1);
    assertEquals(s.pop(), 1);
    assertTrue(s.isEmpty());
  }

  @Test
  public void testMulti() {
    for(int i=0; i<100; i++) {
      s.push(i);
    }
    for(int i=99; i>=0; i--) {
      assertEquals(s.peek(), i);
      assertEquals(s.pop(), i);
    }
    //s.pop();
  }


}
