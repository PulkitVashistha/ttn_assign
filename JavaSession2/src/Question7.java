public class Question7 {
    
    private long days;
    private int hours;
    private int minutes;
    private int seconds;
    private long tseconds;
    
    public Question7(int tSeconds) {
       tseconds=tSeconds;
    }
    
    public void convertResult() {
        long tsecs=tseconds;
    
        days = tsecs / (24 * 3600);
        
            tsecs = tsecs % (24 * 3600);
            
        hours = (int)tsecs / 3600;
    
            tsecs %= 3600;
            
        minutes = (int)tsecs / 60 ;
    
            tsecs %= 60;
            
        seconds = (int)tsecs;
        
        System.out.println("Data in Seconds: "+tseconds);
        System.out.println("\nDay(s): "+days);
        System.out.println("Hour(s): "+hours);
        System.out.println("Minute(s): "+minutes);
        System.out.println("Second(s): "+seconds);
    }
    
}
