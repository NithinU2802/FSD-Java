import java.util.*;
import java.util.Map.Entry;

public class HashMaping{
    public static void main(String[] arg){
        Map<String,Integer> map=new HashMap<>();
        map.put("a",10);
        map.put("b",20);
        map.put("c",30);
        System.out.println(map.size());
        System.out.println(map);
        
        // contains keys 
        if(map.containsKey("a")){
            Integer a=map.get("a");
            System.out.println("Value of a is "+a);
        }

        // Iteration of key 
        for(String key: map.keySet())
        System.out.println("Key: "+key+", Value: "+map.get(key));

        // uses entry to iterate 
        System.out.println();
        for(Entry<String, Integer> entry:map.entrySet())  // Need to import java.util.Map.Entry;
        System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
    }
}
