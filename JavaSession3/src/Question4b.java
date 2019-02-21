import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question4b {
    
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
                    
                    try {
                        Thread.sleep(2000L);
                        System.out.println("Thread "+Thread.currentThread().getName()+" Executing Task 2");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    
                }
            });
            
        }finally {
            executorService.shutdownNow();
        }
        
        System.out.println("Executor Service Instance Termination Status :: "+executorService.isTerminated());
        System.out.println("Executor Service Instance Shutdown Status :: "+executorService.isShutdown());
        
    }
    
}
