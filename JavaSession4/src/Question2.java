import java.util.HashSet;

public class Question2 {
    
     static void FindUniqueChar(String str) {
        HashSet<Character> hashSet=new HashSet<>();
        System.out.println("Original String: "+str);
    
        for(int loop=0;loop<str.length();loop++) {
            hashSet.add(str.charAt(loop));
        }
    
        System.out.println("Unique Characters: "+hashSet);
    }
    
    public static void main(String[] args) {
    
        FindUniqueChar("AAbbCCddEFFgHH");
    }
}
