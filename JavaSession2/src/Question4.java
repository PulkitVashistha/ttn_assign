
public class Question4 {
    
    private static Question4 st = new Question4();
    private Question4() { }
    
    
    public static Question4 getInstance( ) {
        return st;
    }
    
    public void getInfo( ) {
        System.out.println("Singleton class method called.");
    }
}
