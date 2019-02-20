class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}

public class Question13 {
    
    private int op1,op2,res;
    private boolean flag;
    
    public Question13(int op1, int op2) {
        this.op1=op1;
        this.op2=op2;
        flag=false;
    }
    
    public void calcResult() {
        
        try {
            if(op2==0) {
                throw new CustomException("Arithmetic exception caught!");
            } else {
                res=op1/op2;
            }
            
        } catch(CustomException ex) {
            System.out.println(ex.getMessage());
            flag=true;
        } finally {
            if(flag==true) {
                System.out.println("Execution halted.");
            } else {
                System.out.println("Result: "+res);
            }
        }
    }
    
}
