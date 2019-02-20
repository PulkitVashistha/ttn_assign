public class Question6 {
    
    private int op1;
    private int op2;
    private int res;
    private boolean flag;
    
    public Question6(int t1,int t2) {
        op1=t1;
        op2=t2;
        flag=false;
    }
    
    public void divideValues() {
        
        try{
            res=op1/op2;
        } catch (ArithmeticException ex) {
            flag=true;
            System.out.println("Arithmetic exception caught! \nError Message: "+ex.getMessage());
        } catch (Exception ex) {
            flag=true;
            System.out.println("Exception caught! \nError Message: "+ex.getMessage());
        } finally {
            if(!flag){
                System.out.println("Result: "+res);
            } else {
                System.out.println("Exception! No Result Found.");
            }
        }
        
    }
}
