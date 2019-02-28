import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question11 {
    
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Average After Double Numbers: "+list.stream().collect(Collectors.averagingInt(x -> x * 2)) );
    
    
    }
    
}
