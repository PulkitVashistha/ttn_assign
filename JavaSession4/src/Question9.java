import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Question9 {
    
    public static void main(String[] args) {
    
        
        Date date=new Date();
        Locale locale=new Locale("en","in");
        DateFormat timeFormat=DateFormat.getTimeInstance(DateFormat.FULL,locale);
        DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.FULL,locale);
        System.out.println("India\nCurrent Date: "+dateFormat.format(date)+" Current Time: "+timeFormat.format(date));
    
        Locale locale1=new Locale("it","ch");
        DateFormat timeFormat1=DateFormat.getTimeInstance(DateFormat.FULL,locale1);
        DateFormat dateFormat1=DateFormat.getDateInstance(DateFormat.FULL,locale1);
        System.out.println("Italian\nCurrent Date: "+dateFormat1.format(date)+" Current Time: "+timeFormat1.format(date));
        
        
        
        
    }
    
}
