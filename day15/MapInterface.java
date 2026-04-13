package day15;

import java.util.Map;

//map.put(0,1)0->key,1->value
//map.get(0,2) return 1
//.containsKey(0) return true
//check the key exist or not
//if key exist value will be updated
//get(key) get(0)->2
//.remove(key) remove(0) return 2
//.size() return the size of map
//map.get or default(key,defaultValue) return the value of key if exist otherwise return defaultValue4
import java.util.HashMap;
public class MapInterface {
        public static void main(String[] args) {
        //HashMap, LinkedHashMap, TreeMap
        int[] arr = {10, 15,20, 25, 40};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(i, arr[i]);
        }
        System.out.println(map.keySet());
        System.out.println(map.values());
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
    
}
