import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question5 {
    
    public static void main(String[] args) {
    
        //java.util.function
        
        //Producer
        Supplier<Integer> supplier = () -> new Integer((int) (Math.random() * 1000D));
        System.out.println(supplier.get());
        
        //Consumer
        Consumer<Integer> consumer = (value) -> System.out.println(value);
        consumer.accept(10);
        
        
        //Predicate
        List<Integer> list= Arrays.asList(1,null,3,null,5,null,7);
        Predicate predicate = (value) -> value != null;;
        list.stream().filter(predicate).forEach(System.out::println);
        
        
        //Function
        Function<Integer, Integer> adder = (value) -> value + 1;
        int result = adder.apply( 9);
        System.out.println("Result: " + result);
        
        
    }
    
}
