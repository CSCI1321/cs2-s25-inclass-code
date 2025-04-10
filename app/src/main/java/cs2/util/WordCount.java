package cs2.util;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class WordCount {
  
  public static Set<String> getWords(String filename) {
    HashSet<String> set = new HashSet<String>();
    try {
      Scanner scan = new Scanner(new File(filename));
      while(scan.hasNextLine()) {
        String line = scan.nextLine();
        String[] words = line.split("\\s+");
        for(int i=0; i<words.length; i++) {
          words[i] = words[i].replaceAll("[^A-Za-z]", "");
          set.add(words[i].toLowerCase());
        }
      }
    } catch (Exception ex) {
      System.out.println("Hey, an error occured.");
    }
    return set;
  }

  public static Map<String, Integer> getWordCounts(String filename) {
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    try {
      Scanner scan = new Scanner(new File(filename));
      while(scan.hasNextLine()) {
        String line = scan.nextLine();
        String[] words = line.split("\\s+");
        for(int i=0; i<words.length; i++) {
          words[i] = words[i].replaceAll("[^A-Za-z]", "").toLowerCase();
          if(map.containsKey(words[i])) {
            map.put(words[i], map.get(words[i]) + 1);
          } else {
            map.put(words[i], 1);
          }
        }
      }
    } catch (Exception ex) {
      System.out.println("Hey, an error occured.");
    }
    return map;
  }

  public static void main(String[] args) {
    Set<String> tempWords = getWords("tempest.txt");
    Set<String> summerWords = getWords("midsummer.txt");
    System.out.println(tempWords.size());
    System.out.println(summerWords.size());
    //Difference
    summerWords.removeAll(tempWords);
    //System.out.println(summerWords.size());
    //System.out.println(summerWords);

    Map<String, Integer> tempMap = getWordCounts("tempest.txt");
    System.out.println(tempMap);
    for(String word : tempMap.keySet()) {
      if(tempMap.get(word) > 100) {
        System.out.println(word + " " + tempMap.get(word));
      }
    }

  }


}
