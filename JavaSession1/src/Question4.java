import java.util.Scanner;

public class Question4 {
    private String main_str;
    private int str_len;
    private int TotalLC, TotalUC, TotalDigit, TotalSC;
    
    public Question4() {
        TotalLC=TotalUC=TotalDigit=TotalSC=str_len=0;
    }
    public void setData(){
        System.out.println("Enter any string with lower case, upper case, digits,special charater: ");
        Scanner In=new Scanner(System.in);
        main_str=In.nextLine();
        str_len=main_str.length();
    }
    
    
    public void fetchResult() {
        
        char[] str_char=main_str.toCharArray();
        
        for(int i=0;i<str_len;i++) {
            if(str_char[i]>='a' && str_char[i]<='z') {
                TotalLC++;
            } else if(str_char[i]>='A' && str_char[i]<='Z') {
                TotalUC++;
            } else if(str_char[i]>='0' && str_char[i]<='9') {
                TotalDigit++;
            } else {
                TotalSC++;
            }
        }
        
        PrintResult();
        
    }
    
    public void PrintResult() {
        float per_lc=(float)TotalLC*100/str_len;
        float per_uc=(float)TotalUC*100/str_len;
        float per_dc=(float)TotalDigit*100/str_len;
        float per_sc=(float)TotalSC*100/str_len;
        
        System.out.println("Details of string: "+main_str);
        System.out.println("\nLower Case Character\nTotal: "+TotalLC+"\nPercentage: "+per_lc+"%");
        System.out.println("\nUpper Case Character\nTotal: "+TotalUC+"\nPercentage: "+per_uc+"%");
        System.out.println("\nDigit Character\nTotal: "+TotalDigit+"\nPercentage: "+per_dc+"%");
        System.out.println("\nSpecial Case Character\nTotal: "+TotalSC+"\nPercentage: "+per_sc+"%");
    }
    
}
