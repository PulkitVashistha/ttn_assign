class CThread extends Thread {
    
    @Override
    public void run() {
        System.out.println("[Thread Class] Hello from "+Thread.currentThread().getName());
    }
}

class IThread implements Runnable {
    
    @Override
    public void run() {
        System.out.println("[Runnable Interface] Hello from "+Thread.currentThread().getName());
    }
}

public class Question1 {
    
    public static void main(String[] args) {
        
        CThread CT=new CThread();
        CT.start();
        
        IThread runn=new IThread();
        Thread IT=new Thread(runn);
        IT.start();
        
        System.out.println("Hello from "+Thread.currentThread().getName());
        
    }

}
