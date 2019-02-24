import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Question1 {
    
    public static void main(String[] args) {
    
        List<Float> list=new ArrayList<>();
        float data_sum=0;
        
        list.add(25.5f);
        list.add(14.5f);
        list.add(75.25f);
        list.add(63.25f);
        list.add(14.5f);
    
        ListIterator<Float> iterator=list.listIterator();
        
        System.out.println(list);
        while(iterator.hasNext()) {
    
            data_sum = data_sum + iterator.next();
            
        }
    
        System.out.println("Sum of "+list+" Elements:: "+data_sum);
    
    }
    
}
