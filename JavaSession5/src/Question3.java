
@FunctionalInterface
interface ACalculator {
    int add(int arg1, int arg2);
}

@FunctionalInterface
interface SCalculator {
    int sub(int arg1, int arg2);
}

@FunctionalInterface
interface MCalculator {
    int multiply(int arg1, int arg2);
}

public class Question3 {
    
    int addition(int arg1, int arg2) {
        return arg1+arg2;
    }
    
    int subtract(int arg1, int arg2) {
        return arg1-arg2;
    }
    
    static int multiply(int arg1, int arg2) {
        return arg1*arg2;
    }
    
    public static void main(String[] args) {
    
        Question3 question=new Question3();
        
        //Question Instance Method Reference
        
        //Add
        ACalculator aCalculator=(question::addition);
    
        System.out.println("Addition Result: "+aCalculator.add(6,23));
        
        //Sub
        SCalculator sCalculator=(question::subtract);
    
        System.out.println("Subtraction Result: "+sCalculator.sub(23,8));
        
        
        //Question Static Method Reference
        
        MCalculator mCalculator=(Question3::multiply);
    
        System.out.println("Multiply: "+mCalculator.multiply(5,5));
    
    }

}
