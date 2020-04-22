package map;
import java.util.*;

 

public class MapExample {

 

    public static void main(String[] args) {

        HashMap<String, Integer> a = new HashMap<String, Integer>();

        a.put("one", 1);

        a.put("two", 2);

        a.put("three", 3);

        a.put("four", 4);
        
        a.put("five", 5);
        
        a.put("six", 6);
        
        a.put("seven", 7);
        
        a.put("eight", 8);
        
        a.put("nine", 9);
        
        a.put("ten", 10);
        System.out.println("------------------------");

        System.out.println(a.get("one"));

        System.out.println(a.get("two"));

        System.out.println(a.get("three"));
        
        System.out.println(a.get("four"));
        
        System.out.println(a.get("five"));
        
        System.out.println(a.get("six"));
        
        System.out.println(a.get("seven"));
        
        System.out.println(a.get("eight"));
        
        System.out.println(a.get("nine"));
        
        System.out.println(a.get("ten"));

        System.out.println("------------------------");

        iteratorUsingForEach(a);

        iteratorUsingIterator(a);
        
      

    }

     

    static void iteratorUsingForEach(HashMap map){

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {

            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
        
        	System.out.println("------------------------");

    }

     

    static void iteratorUsingIterator(HashMap map){

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        Iterator<Map.Entry<String, Integer>> i = entries.iterator();

        while(i.hasNext()){

            Map.Entry<String, Integer> entry = i.next();

            System.out.println(entry.getKey()+" : "+entry.getValue());

        }
        	System.out.println("----------END----------");

    }

    
}