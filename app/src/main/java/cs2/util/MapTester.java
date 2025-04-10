package cs2.util;

import java.util.HashMap;
import java.util.Map;

public class MapTester {
  public static void main(String[] args) {
    Map<String, Integer> m = new HashMap<String, Integer>();
    System.out.println(m);
    m.put("Hello", 42);
    m.put("Goodbye", 17);
    m.put("", 0);
    System.out.println(m);
    m.put("Hello", 17);
    System.out.println(m);
    System.out.println(m.size());
    m.remove("");
    System.out.println(m);
    System.out.println(m.get("Hello"));
    System.out.println(m.get("What?"));

    System.out.println(m.values());
    System.out.println(m.keySet());


  }
}
