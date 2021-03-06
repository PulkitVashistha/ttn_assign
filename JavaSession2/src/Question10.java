import java.util.Scanner;
abstract class CoffeeShop {
    abstract int requestService();
    abstract void processOrder();
    abstract void deliverService();
}
public class Question10 extends CoffeeShop {
    //private static Question10 st = new Question10();
    private static int token_number=1000;
    private double order_amount;
    private boolean token_status;
    private  boolean payment_status;
    private int[] order_queue;
    private int[] ready_queue;
    private final int MAX_ORDER;
    private Scanner In;
    private static int o_count=-1;
    
    
    public Question10() {
        MAX_ORDER=10;
        token_status=false;
        payment_status=false;
        order_queue=new int[MAX_ORDER];
        ready_queue=new int[MAX_ORDER];
        In=new Scanner(System.in);
    }
    
    
    /*public static Question10 getInstance() {
        return st;
    }*/
    
    @Override
    public int requestService() {
        o_count++;
        token_number++;
        
        System.out.println("[Pay Bill] Enter amount: ");
        order_amount=In.nextLong();
        if(order_amount>=0) {
            order_queue[o_count]=token_number;
            System.out.println("Order id "+order_queue[o_count]+" of amount "+order_amount +" is in order queue, please wait.");
            
            return  order_queue[o_count];
        } else {
            System.out.println("Amount not paid, try again.");
            return 0;
        }
    }
    
    @Override
    public void processOrder() {
        if(order_queue.length>0) {
            for(int i=0;i<order_queue.length;i++) {
                if(order_queue[i]==0) {
                    break;
                } else {
                    System.out.println("Order id " + order_queue[i] + " is ready.");
                    ready_queue[i] = order_queue[i];
                }
            }
            order_queue=null;
        }
    }
    
    @Override
    public void deliverService() {
        if(ready_queue.length>0) {
            for(int i=0;i<ready_queue.length;i++) {
                if(ready_queue[i]==0) {
                    break;
                } else {
                    System.out.println("Order id " + ready_queue[i] + " is completed.");
                }
            }
            ready_queue=null;
        }
    }
    
}
