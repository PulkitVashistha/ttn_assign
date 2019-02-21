public class Question2 {
    
    public static void main(String[] args) throws InterruptedException {
        
        Thread T1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 Started.");
                try {
                    Thread.sleep(1000L);
                    System.out.println("Thread 1 Finished.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    
        Thread T2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2 Started.");
                try {
                    Thread.sleep(2000L);
                    System.out.println("Thread 2 Finished.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        T1.start();
        T2.start();
        
        T1.join();
        T2.join();
        
        System.out.println("Main Finished!");
        
        
    }

}
