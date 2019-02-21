import com.sun.prism.shader.Solid_ImagePattern_Loader;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question3 {
    
    public static void main(String[] args) {
        
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                        System.out.println("Thread "+Thread.currentThread().getName()+" Executing Task 1");
                }
            });
            
            executorService.submit(new Runnable() {
                @Override
                public void run() {
    
                    System.out.println("Thread "+Thread.currentThread().getName()+" Executing Task 2");
                    
                }
            });
    
        }finally {
            executorService.shutdown();
        }
        
        System.out.println("Thread "+Thread.currentThread().getName()+" Executed!");
    
    }

}
