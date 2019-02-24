import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.*;

public class Question6 {
    
    static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
        Comparator<K> valueComparator = new Comparator<K>() {
                    public int compare(K k1, K k2) {
                        int compare = map.get(k1).compareTo(map.get(k2));
                        if (compare == 0)
                            return 1;
                        else
                            return compare;
                    }
                };
        
        Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }
    
    static void findFrequency(int[] arr) {
    
        SortedMap<Integer,Integer> sortedMap=new TreeMap<>();
    
        for(int val:arr) {
            if(sortedMap.containsKey(val)) {
                sortedMap.put(val,sortedMap.get(val)+1);
            } else {
                sortedMap.put(val,1);
            }
        }
    
        System.out.println("Increasing Order: "+sortByValues(sortedMap));
        //System.out.println(((TreeMap<Integer, Integer>) sortedMap).descendingMap());
        System.out.println("Original Map: "+sortedMap);
        
    }
    
    public static void main(String[] args) {
        
        int[] arr=new int[] {10,11,12,11,14,12,11,10,4,10,4};
        findFrequency(arr);
        
    }
    
}
