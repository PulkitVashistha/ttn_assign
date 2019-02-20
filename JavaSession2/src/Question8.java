import java.util.Scanner;

public class Question8 {
    
    private String data;
    
    public Question8() {
        data="";
    }
   
    public void processInputDW() {
        int flag=0;
        char fchar,lchar;
        Scanner In=new Scanner(System.in);
        
        do{
            System.out.println("Enter any word [Enter DONE to exit]: ");
            data=In.nextLine();
            
            int tlength=data.length();
            fchar=data.charAt(0);
            lchar=data.charAt(tlength-1);
            
            if(fchar==lchar) {
                System.out.println("Valid String: "+data);
            }
            
        } while(!data.equals("DONE"));
    }
    
    public void processInputW() {
        char fchar,lchar;
        Scanner In=new Scanner(System.in);
    
        while(!data.equals("DONE")){
            System.out.println("Enter any word [Enter DONE to exit]: ");
            data=In.nextLine();
            
            int tlength=data.length();
            fchar=data.charAt(0);
            lchar=data.charAt(tlength-1);
            
            if(fchar==lchar) {
                System.out.println("Valid String: "+data);
            }
            
        }
    }
   
}
