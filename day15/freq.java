package day15;
//map.KeySet() looping through all the keys in the map
//input int[]  arr={1,2,3,1,1,1,2,4,3}
//1->4
//2->2
//3->2
//4->1
import java.util.Map;
import java.util.HashMap;
public class freq {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,2,4,3};
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num , 1) + 1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
