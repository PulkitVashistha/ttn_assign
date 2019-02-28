import java.util.Arrays;
import java.util.List;

public class Question10 {
    
    public static void main(String[] args) {
    
        List<Integer> list= Arrays.asList(1,2,3,4,6,6,8);
    
        System.out.println("Addition of all numbers greater than 5: "+list.stream().filter(e-> e>5).reduce(0, (a,b)-> a+b));
    
    }
    
}
