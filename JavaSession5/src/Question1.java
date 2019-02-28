import java.sql.SQLOutput;

@FunctionalInterface
interface CheckGreater {
    boolean cGreater(int arg1, int arg2);
}

@FunctionalInterface
interface Incrementor {
    int increment(int arg);
}

@FunctionalInterface
interface StringJoiner {
    String join(String arg1, String arg2);
}

@FunctionalInterface
interface CaseConvert {
    String convert(String arg);
}

public class Question1 {
    
    public static void main(String[] args) {
        
        //Question 1.1
        
        CheckGreater checkGreater=(int arg1, int arg2) -> {
            if(arg1>arg2)
                return true;
            else
                return false;
        };
    
        System.out.println("Result: "+checkGreater.cGreater(10,5));
        
        //Question 1.2
        
        Incrementor incrementor=(int arg) -> ++arg;
    
        System.out.println("Result: "+incrementor.increment(10));
        
        //Question 1.3
        
        StringJoiner stringJoiner=(String::concat);
    
        System.out.println(stringJoiner.join("Shubham","Kumar"));
        
        //Question 1.4
        
        CaseConvert caseConvert=(String::toUpperCase);
    
        System.out.println(caseConvert.convert("india"));
    
    }
    
}
