
interface PrintWord {
    default void print() {
        System.out.println("PrintWord print method.");
    }
}

interface PrintString {
    default void print() {
        System.out.println("PrintString print method.");
    }
}

public class Question8 implements PrintString, PrintWord {
    
    public void print() {
        PrintWord.super.print();
        PrintString.super.print();
    }
    
    public static void main(String[] args) {
    
        Question8 question8=new Question8();
        
        question8.print();
    
    }
    
}
