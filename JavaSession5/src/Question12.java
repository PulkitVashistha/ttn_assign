import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Question12 {
    
    public static void main(String[] args) {
    
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5,6);
        Optional<Integer> result=list.stream().filter(e -> e > 3).filter(e -> e % 2==0).findFirst();
        
        if(result.isPresent()) {
            System.out.println("First even number greater than 3: "+result.get());
        }
        
        
    
    }
    
}
