public class Question10 {
    
    public void addValues(int op1, int op2) {
        int tSum=op1+op2;
        System.out.println("Addition of Integer type "+op1+" and "+op2+" is: "+tSum);
    }
    
    public void addValues(double op1, double op2) {
        double tSum=op1+op2;
        System.out.println("Addition of Double type "+op1+" and "+op2+" is: "+tSum);
    }
    
    public void multiplyValues(float op1, float op2) {
        float tProduct=op1 * op2;
        System.out.println("Multiplication of float type "+op1+" and "+op2+" is: "+tProduct);
    }
    
    public void multiplyValues(int op1, int op2) {
        int tProduct=op1*op2;
        System.out.println("Multiplication of Integer type "+op1+" and "+op2+" is: "+tProduct);
    }
    
    public void concatString(String str1, String str2) {
        String tString=str1.concat(" "+str2);
        System.out.println("Concatination of String "+str1+" and "+str2+" is: "+tString);
    }
    
    public void concatString(String str1, String str2, String str3) {
        String tString=str1.concat(" "+str2.concat(" "+str3));
        System.out.println("Concatination of String "+str1+", "+str2+" and "+str3+" is: "+tString);
    }

}
