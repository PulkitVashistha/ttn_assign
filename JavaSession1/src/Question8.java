public class Question8 {
    
    private String main_str;
    
    public Question8(String temp) {
        main_str=temp;
    }
    
    public void getResult() {
        StringBuffer SF=new StringBuffer(main_str);
        SF.reverse().delete(4,9);
        System.out.println("Original String: "+main_str);
        System.out.println("Expected String: "+SF.toString());
        
        
    }
    
}
