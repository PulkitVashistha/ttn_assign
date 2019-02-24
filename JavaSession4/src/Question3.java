import java.util.Date;
import java.util.HashMap;

public class Question3 {
    
    static void uniqueCharCount(String str) {
    
        HashMap<Character,Integer> hashMap=new HashMap<>();
        System.out.println("Original String: "+str);
        
        char[] strArr=str.toCharArray();
        
        for(char ch:strArr) {
            if(hashMap.containsKey(ch)) {
                hashMap.put(ch,hashMap.get(ch)+1);
            } else {
                hashMap.put(ch,1);
            }
        }
    
        System.out.println(hashMap);
        
    }
    
    public static void main(String[] args) {
    
        uniqueCharCount("ABACABDFD");
    
    }
    
}
