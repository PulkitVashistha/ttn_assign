
@FunctionalInterface
interface MergerValues {
    int merge(int arg1, int arg2);
}

public class Question2 {
    
    public static void main(String[] args) {
    
        MergerValues mergerValues=(int arg1, int arg2) -> arg1+arg2;
    
        System.out.println(mergerValues.merge(10,11));
    
    }
    
}
