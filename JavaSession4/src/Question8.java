import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Question8 {
    
    public static void main(String[] args) {
        
        Date D=new Date();
        SimpleDateFormat SDF=new SimpleDateFormat("dd-MMMM-YYYY");
    
        System.out.printf(SDF.format(D));
        
    }
    
}
