package cs2.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetTester {
  public static void main(String[] args) {
    HashSet<String> s = new HashSet<String>();
    System.out.println(s);
    s.add("Hello");
    s.add("Goodbye");
    s.add("!!!!");
    System.out.println(s);
    System.out.println(s.size());
    s.add("Hello");
    System.out.println(s);
    System.out.println(s.size());
    System.out.println(s.contains("Hello"));
    System.out.println(s.contains("What?"));
    s.remove("Goodbye");
    System.out.println(s);
    s.remove("Goodbye");
    System.out.println(s);
    //System.out.println(s.get(2));
    HashSet<Integer> loSet = new HashSet<Integer>();
    for(int i=0; i<20; i++) {
      loSet.add(i);
    }
    HashSet<Integer> hiSet = new HashSet<Integer>();
    for(int i=16; i<30; i++) {
      hiSet.add(i);
    }
    System.out.println(loSet);
    System.out.println(hiSet);

    System.out.println(loSet.removeAll(hiSet));
    System.out.println(loSet);

    /* No get method - doesn't work
    for(int i=0; i<loSet.size(); i++) {
      System.out.println(loSet.get(i));
    } */

    HashSet<Integer> dupeSet = new HashSet<Integer>();

    Iterator<Integer> it = loSet.iterator();
    while(it.hasNext()) {
      int tmp = it.next();
      System.out.println(tmp);
      dupeSet.add(tmp);// * 2);
    }
    System.out.println(dupeSet);

    /*
    ArrayList<String> als = new ArrayList<String>();
    als.add("Hello");
    als.add("Goodbye");
    als.add("zzz");
    Iterator<String> it2 = als.iterator();
    while(it2.hasNext()) {
      System.out.println(it2.next());
    }
    */






  }
}
