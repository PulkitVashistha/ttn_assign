
interface Printer {
    
    default void print(String arg) {
        System.out.println("Data: " + arg+"\nLength: "+stringLength(arg));
    }
    
    static int stringLength(String arg) {
        
        return arg.length();
    }
}

public class Question6 implements Printer {
    
    public static void main(String[] args) {
    
        Question6 question6=new Question6();
        question6.print("Shubham");
        
    
    }
    
}
