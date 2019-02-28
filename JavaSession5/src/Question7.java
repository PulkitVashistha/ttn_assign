
interface StringPrinter {
    
    default void print(String arg) {
        System.out.println("Default interface method implementation. Argument value: "+arg);
    }
    
}

public class Question7 implements StringPrinter {
    
    @Override
    public void print(String arg) {
        System.out.println("Overridden interface method implementation. Argument value: "+arg);
    }
    
    public static void main(String[] args) {
    
        Question7 question7=new Question7();
        
        question7.print("Shubham");
    
    }
    
}
